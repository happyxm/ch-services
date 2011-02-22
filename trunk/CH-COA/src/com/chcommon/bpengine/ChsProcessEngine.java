package com.chcommon.bpengine;

import org.jbpm.api.Configuration;
import org.jbpm.api.ExecutionService;
import org.jbpm.api.HistoryService;
import org.jbpm.api.IdentityService;
import org.jbpm.api.ManagementService;
import org.jbpm.api.NewDeployment;
import org.jbpm.api.ProcessEngine;
import org.jbpm.api.RepositoryService;
import org.jbpm.api.TaskService;

public final class ChsProcessEngine {
	protected static ChsProcessEngine chsProcessEngine = null;
	protected static ProcessEngine processEngine = null;
	
	protected RepositoryService repositoryService;
	protected ExecutionService executionService;
	protected ManagementService managementService;
	protected TaskService taskService;
	protected HistoryService historyService;
	protected IdentityService identityService;

	// 初始化引擎服务
	public void initialize() {
		if (processEngine == null) {
			processEngine = Configuration.getProcessEngine();
			
			repositoryService = processEngine.get(RepositoryService.class);
			executionService = processEngine.getExecutionService();
			historyService = processEngine.getHistoryService();
			managementService = processEngine.getManagementService();
			taskService = processEngine.getTaskService();
			identityService = processEngine.getIdentityService();
		}
	}

	// 部署流程
	public String deploy(String xmlFile) {
		NewDeployment deploy =repositoryService.createDeployment().addResourceFromClasspath(xmlFile);
		String deployId = deploy.deploy();
		return deployId;
	}

	// 反部署流程
	public void unDeploy(String deployId) {
		processEngine.getRepositoryService().deleteDeployment(deployId);
	}

	/**
	 * 获取引擎对象，并初始化引擎服务
	 * @author zhengcaihai 2011-1-19 上午08:58:19
	 * @return
	 */
	public static ChsProcessEngine getInstance() {
		if (chsProcessEngine == null) {
			chsProcessEngine = new ChsProcessEngine();
			chsProcessEngine.initialize();
		}
		return chsProcessEngine;
	}

	
	public RepositoryService getRepositoryService() {
		return repositoryService;
	}

	public ExecutionService getExecutionService() {
		return executionService;
	}

	public ManagementService getManagementService() {
		return managementService;
	}

	public TaskService getTaskService() {
		return taskService;
	}

	public HistoryService getHistoryService() {
		return historyService;
	}

	public IdentityService getIdentityService() {
		return identityService;
	}

}
