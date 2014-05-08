package cn.culturemall.art.business.user.domain;

import cn.culturemall.art.common.domain.DomainObject;
import cn.culturemall.art.common.enums.GENDER;

public class User extends DomainObject {

	private static final long serialVersionUID = -3312635527655483735L;

	private Long user_id;
	
	private String login_name;
	
	private String password;
	
	private String nickname;
	
	private String real_name;
	
	private GENDER sex;

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getLogin_name() {
		return login_name;
	}

	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getReal_name() {
		return real_name;
	}

	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}

	public GENDER getSex() {
		return sex;
	}

	public void setSex(GENDER sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", login_name=" + login_name
				+ ", password=" + password + ", nickname=" + nickname
				+ ", real_name=" + real_name + ", sex=" + sex + "]";
	}

}
