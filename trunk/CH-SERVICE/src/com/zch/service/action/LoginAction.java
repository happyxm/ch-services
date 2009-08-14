/**
 * 
 */
package com.zch.service.action;

/**
 * 
 * @author zhengcaihai
 * <li>Email:zhengcaihai529@126.com
 * <li>Phone:+8613860604117
 * @date 2009-8-14
 * @version 1.0
 */
public class LoginAction{
	public String login() {
		System.out.println(getUsername()+"-"+getPassword());
		return "success";
	}

	private String	username;
	private String	password;

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


}
