package com.zch.service.kernel.bootstap;

import com.zch.service.kernel.IServiceKernel;
/**
 * 
 * 服务启动器<p>
 * 
 * @Author 郑才海
 * @Date 2009-6-23
 */
public interface ServiceBootStap extends IServiceKernel {
	/**
	 * 启动服务<p>
	 * <li>通过ServiceConfigurator获取内核服务Bean配置
	 * <li>调用ServiceInitializer接口初始化内核
	 * <li>
	 * @return
	 * @throws Exception
	 */
	public boolean bootStap() throws Exception;
}
