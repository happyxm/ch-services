package com.chcoa.service.document;

import org.jbpm.api.listener.EventListenerExecution;

public class EventListener implements org.jbpm.api.listener.EventListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void notify(EventListenerExecution arg0) throws Exception {
		System.out.println("EventListener.....");
	}

}
