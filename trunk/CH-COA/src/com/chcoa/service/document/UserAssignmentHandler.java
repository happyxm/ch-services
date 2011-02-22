package com.chcoa.service.document;

import org.jbpm.api.model.OpenExecution;
import org.jbpm.api.task.Assignable;
import org.jbpm.api.task.AssignmentHandler;

public class UserAssignmentHandler implements AssignmentHandler {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String assignee;

	public void assign(Assignable assignable, OpenExecution execution) {
		assignable.setAssignee(assignee);
	}
}
