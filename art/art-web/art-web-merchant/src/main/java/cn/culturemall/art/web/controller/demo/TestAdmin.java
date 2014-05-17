package cn.culturemall.art.web.controller.demo;

import cn.culturemall.art.common.domain.DomainObject;

public class TestAdmin extends DomainObject {

	private static final long serialVersionUID = 1411220534876417792L;

	private String username;

	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
