package cn.culturemall.art.business.domain.merchant;

import cn.culturemall.art.common.domain.DomainObject;
import cn.culturemall.art.common.enums.GENDER;

public class Merchant extends DomainObject {

	private static final long serialVersionUID = 6915056781973922945L;

	private Long merchant_id;

	private Long club_id;

	private String nickname;

	private String login_name;

	private String password;

	private String real_name;

	private Integer telephone;

	private Integer mobile_phone;

	private String emall;

	private String identity_card;

	private GENDER sex;

	public Long getMerchant_id() {
		return merchant_id;
	}

	public void setMerchant_id(Long merchant_id) {
		this.merchant_id = merchant_id;
	}

	public Long getClub_id() {
		return club_id;
	}

	public void setClub_id(Long club_id) {
		this.club_id = club_id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
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

	public String getReal_name() {
		return real_name;
	}

	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}

	public Integer getTelephone() {
		return telephone;
	}

	public void setTelephone(Integer telephone) {
		this.telephone = telephone;
	}

	public Integer getMobile_phone() {
		return mobile_phone;
	}

	public void setMobile_phone(Integer mobile_phone) {
		this.mobile_phone = mobile_phone;
	}

	public String getEmall() {
		return emall;
	}

	public void setEmall(String emall) {
		this.emall = emall;
	}

	public String getIdentity_card() {
		return identity_card;
	}

	public void setIdentity_card(String identity_card) {
		this.identity_card = identity_card;
	}

	public GENDER getSex() {
		return sex;
	}

	public void setSex(GENDER sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Merchant [merchant_id=" + merchant_id + ", club_id=" + club_id
				+ ", nickname=" + nickname + ", login_name=" + login_name
				+ ", password=" + password + ", real_name=" + real_name
				+ ", telephone=" + telephone + ", mobile_phone=" + mobile_phone
				+ ", emall=" + emall + ", identity_card=" + identity_card
				+ ", sex=" + sex + "]";
	}

}
