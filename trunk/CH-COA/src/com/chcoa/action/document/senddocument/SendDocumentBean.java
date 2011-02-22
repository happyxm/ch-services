package com.chcoa.action.document.senddocument;

import java.util.Date;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import com.chcoa.domain.model.ChsDispatch;
import com.chcoa.service.spi.document.IDispatchService;
import com.chcommon.exception.ChServiceException;
import com.chcommon.exception.service.ChServiceServiceException;
import com.chcommon.exception.web.ChServiceWebException;
import com.chfaces.custom.datagrid.PageModel;
import com.chfaces.event.datatable.DataGridEvent;
import com.chfaces.event.datatable.DeleteRowEvent;
import com.chfaces.event.datatable.SelectRowEvent;
import com.chservice.action.platform.login.ChLogonUser;
import com.chservice.action.util.FacesUtil;

@ManagedBean(name="sendDocumentBean")
@RequestScoped
public class SendDocumentBean {
	private ChsDispatch dispatch;

	@ManagedProperty("#{dispatchService}")
	private IDispatchService service;
	public SendDocumentBean() throws ChServiceWebException {
		super();
//		HttpServletRequest request = FacesUtil.getHttpRequest(FacesContext.getCurrentInstance());
		Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
		dispatch=new ChsDispatch();
		dispatch.setTitle(params.get("title"));
		dispatch.setThemeWord(params.get("themeWord"));
		dispatch.setType(params.get("type"));
		dispatch.setClassification(params.get("classification"));
		dispatch.setFileWord(params.get("fileWord"));
		dispatch.setSecrecyLevel(params.get("secrecyLevel"));
		dispatch.setSecrecyTerm(params.get("secrecyTerm"));
		dispatch.setEmergencyLevel(params.get("emergencyLevel"));
		dispatch.setCarbonCopy(params.get("carbonCopy"));
		dispatch.setRemark(params.get("remark"));
	}

	/**
	 * 获取发文列表
	 * @return
	 */
	public PageModel getDispatchList(DataGridEvent event) throws ChServiceWebException{
		try {
			ChLogonUser logonUser = FacesUtil.getChLogonUser(FacesContext.getCurrentInstance());
			return service.findDispatchList(logonUser.getUserCode(),event.getPage(), event.getRows());
		} catch (ChServiceServiceException e) {
			throw new ChServiceWebException("CHS-0000003","获取信息失败！","","CHS-0000003",e);
		}
	}
	public void deleteListener(DeleteRowEvent event) throws ChServiceWebException{
		String ids=event.getRowIds();
		System.out.println("ids:"+ids);
	}
	/**
	 * 保存发文拟稿内容
	 * @author zhengcaihai
	 * 2011-1-17 上午09:06:24
	 * @param event
	 * @throws ChServiceWebException
	 */
	public void saveListener(ActionEvent event) throws ChServiceWebException{
		if(dispatch!=null){
			try {
				ChLogonUser logonUser = FacesUtil.getChLogonUser(FacesContext.getCurrentInstance());
				dispatch.setDraftTime(new Date());
				dispatch.setDraftOrg(logonUser.getOrgCode());
				dispatch.setDraftPeople(logonUser.getUserCode());
				service.saveDispatch(dispatch);
			} catch (ChServiceException e) {
				throw new ChServiceWebException("CHS-0000001","保存信息失败！","","CHS-0000003",e);
			}
		}
	}
	/**
	 * 发送功能<br/>
	 * 查询迁移路径：<br/>
	 * 1、判断流程是否存在<br/>
	 * 2、查询当前环节下可迁移的路径返回<br/>
	 * @author zhengcaihai
	 * 2011-1-20 下午04:45:50
	 * @param event
	 * @throws ChServiceWebException
	 */
	public void send(ActionEvent event) throws ChServiceWebException{
		
	}
	
	public void selectListener(SelectRowEvent event)throws ChServiceWebException{
		String id=event.getRowId();
		try {
			dispatch=(ChsDispatch) service.findChsEntityById(ChsDispatch.class, id);
		} catch (ChServiceServiceException e) {
			throw new ChServiceWebException("CHS-0000003","获取信息失败！","","CHS-0000003",e);
		}
	}
	public ChsDispatch getDispatch() {
		return dispatch;
	}

	public void setDispatch(ChsDispatch dispatch) {
		this.dispatch = dispatch;
	}

	public void setService(IDispatchService service) {
		this.service = service;
	}
	
}
