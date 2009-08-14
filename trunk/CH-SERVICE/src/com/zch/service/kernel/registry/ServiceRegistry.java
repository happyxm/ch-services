package com.zch.service.kernel.registry;

/**
 * ����ע���� ����������������
 * 
 * @Author ֣�ź�
 * @Date 2009-6-23
 */
public interface ServiceRegistry {
	
	public ServiceRegistryEntry getEntry();

	public void registryEntry();

	public void unRegistryEntry();

	public boolean containsEntry();
}
