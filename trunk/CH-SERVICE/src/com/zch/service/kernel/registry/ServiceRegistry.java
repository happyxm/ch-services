package com.zch.service.kernel.registry;

/**
 * 服务注册器 管理对象的生命周期
 * 
 * @Author 郑才海
 * @Date 2009-6-23
 */
public interface ServiceRegistry {
	
	public ServiceRegistryEntry getEntry();

	public void registryEntry();

	public void unRegistryEntry();

	public boolean containsEntry();
}
