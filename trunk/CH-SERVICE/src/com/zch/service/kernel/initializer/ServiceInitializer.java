/**
 * 
 */
package com.zch.service.kernel.initializer;

/**
 * 内核初始化器
 * 
 * @Author 郑才海
 * @Date 2009-6-23
 */
public interface ServiceInitializer {
	/**
	 * 初始化服务内核
	 * @throws Exception
	 */
	public void initialize() throws Exception;
}
