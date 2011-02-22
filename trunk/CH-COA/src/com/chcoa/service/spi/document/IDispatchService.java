package com.chcoa.service.spi.document;

import com.chcoa.domain.model.ChsDispatch;
import com.chcommon.exception.ChServiceException;
import com.chcommon.exception.service.ChServiceServiceException;
import com.chcommon.hibernate.BaseService;
import com.chfaces.custom.datagrid.PageModel;

/**
 * 发文服务	
 * @author zhengcaihai
 * 2011-1-10 下午12:50:26
 */
public interface IDispatchService extends BaseService{
	/**
	 * 获取当前登录用户的发文列表
	 * @author zhengcaihai
	 * 2011-1-10 下午12:56:01
	 * @param userCode 当前登录人
	 * @param page	当前页数
	 * @param rows	每页行数
	 * @return
	 * @throws ChServiceException
	 */
	public PageModel findDispatchList(String userCode,int page,int rows) throws ChServiceServiceException;
	
	/**
	 * 获取当前发文对象
	 * @author zhengcaihai
	 * 2011-1-10 下午12:58:39
	 * @param id
	 * @return
	 * @throws ChServiceException
	 */
	public ChsDispatch findDispatchById(String id) throws ChServiceException;
	
	/**
	 * 发文拟稿服务
	 * 1、检查对象合理性：1）对象不为null；2）标题不能空；3）如果是修改的情况则id不能空（这用于修改时，新建不做此判断）
	 * @author zhengcaihai
	 * 2011-1-17 下午03:55:29
	 * @param dispatch
	 * @throws ChServiceException
	 */
	public void saveDispatch(ChsDispatch dispatch) throws ChServiceException;
}
