package com.chcoa.service.document;

import java.util.ArrayList;
import java.util.List;

import org.jbpm.api.Execution;
import org.jbpm.api.ProcessInstance;

import com.chcoa.domain.model.ChsDispatch;
import com.chcoa.service.spi.document.IDispatchService;
import com.chcommon.bpengine.ChsProcessEngine;
import com.chcommon.exception.ChServiceException;
import com.chcommon.exception.service.ChServiceServiceException;
import com.chcommon.hibernate.BaseServiceImpl;
import com.chfaces.custom.datagrid.PageModel;

/**
 * 发文拟稿服务<br/>
 * 1、保存或更新发文拟稿服务：保存发文拟稿对象，保存意见，保存正文，保存附件等。<br/>
 * 2、发文对象：如果未启动流程，则启动流程；否则，先获取迁移情况，在确定走流程<br/>
 * 3、处理流程公共服务<br/>
 * 4、作废发文对象<br/>
 * 5、删除发文拟稿，只有被作废的拟稿才能进行删除<br/>
 * @author zhengcaihai
 * 2011-1-18 下午03:25:25
 */
@SuppressWarnings({ "unchecked", "serial" })
public class DispatchService extends BaseServiceImpl implements IDispatchService {

	public ChsDispatch findDispatchById(String id) throws ChServiceException {
		return null;
	}

	public PageModel findDispatchList(String userCode, int page, int rows) throws ChServiceServiceException {
		String hql="from ChsDispatch ";
		try {
			List<ChsDispatch> list = super.findListForPage(hql, (page-1)*rows, rows);
			int count=super.executeCountQuery(hql);
			if(list!=null&&list.size()>0){
				List<List<Object>> dataList=new ArrayList<List<Object>>();//数据
				List tmp;
				for(ChsDispatch dispatch:list){
					tmp=new ArrayList();
					tmp.add(dispatch.getId());
					tmp.add(dispatch.getTitle());
					tmp.add(dispatch.getStatus());
					tmp.add(dispatch.getDraftOrg());
					tmp.add(dispatch.getDraftTime());
					tmp.add(dispatch.getDraftPeople());
					tmp.add(dispatch.getSendOrgId());
					tmp.add(dispatch.getSendTime());
					tmp.add(dispatch.getSender());
					tmp.add(dispatch.getMaterialityLevel());
					tmp.add(dispatch.getEmergencyLevel());
					dataList.add(tmp);
				}
				return new PageModel(page,rows,count,dataList);
			}
		} catch (Exception e) {
			throw new ChServiceServiceException(e);
		}
		return null;
	}

	public void saveDispatch(ChsDispatch dispatch) throws ChServiceException {
		if(!checkDispatchAllow(dispatch,true)){//检查合理性
			throw new ChServiceException("保存前检查合理性不通过!");
		}
		super.saveChsEntity(dispatch);
		ChsProcessEngine pe=ChsProcessEngine.getInstance();
		pe.deploy("com/chcoa/service/document/dispatch.jpdl.xml");
		ProcessInstance processInstance = pe.getExecutionService().startProcessInstanceByKey("dispatch");
//	    Execution executionInPrintDots = processInstance.findActiveExecutionIn("print dots");
//	    String executionId = executionInPrintDots.getId();
//	    System.out.println(executionId);
//	    pe.getExecutionService().signalExecutionById(executionId);
		
	}

	/**
	 * 检查对象合理性
	 * 1）对象不为null；2）标题不能空；3）如果是修改的情况则id不能空（这用于修改时，新建不做此判断）
	 * @author zhengcaihai
	 * 2011-1-17 下午03:58:56
	 * @return
	 */
	private boolean checkDispatchAllow(ChsDispatch dispatch,boolean isNew){
		if(dispatch==null||"".equals(dispatch.getTitle())||dispatch.getTitle()==null){
			return false;
		}
		if(!isNew&&("".equals(dispatch.getId())||dispatch.getId()==null)){
			return false;
		}
		return true;
	}
}
