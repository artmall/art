package cn.culturemall.art.web.controller.demo;

import cn.culturemall.art.common.domain.DomainObject;
import cn.culturemall.art.common.enums.GENDER;

public class TestUser extends DomainObject {

	private static final long serialVersionUID = -4104855914329711777L;

	private String username;

	private String password;

	private GENDER gender;

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

	public GENDER getGender() {
		return gender;
	}

	public void setGender(GENDER gender) {
		this.gender = gender;
	}

}
