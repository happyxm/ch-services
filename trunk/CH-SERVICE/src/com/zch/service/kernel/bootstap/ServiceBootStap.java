package com.zch.service.kernel.bootstap;

import com.zch.service.kernel.IServiceKernel;
/**
 * 
 * ����������<p>
 * 
 * @Author ֣�ź�
 * @Date 2009-6-23
 */
public interface ServiceBootStap extends IServiceKernel {
	/**
	 * ��������<p>
	 * <li>ͨ��ServiceConfigurator��ȡ�ں˷���Bean����
	 * <li>����ServiceInitializer�ӿڳ�ʼ���ں�
	 * <li>
	 * @return
	 * @throws Exception
	 */
	public boolean bootStap() throws Exception;
}
