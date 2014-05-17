package cn.culturemall.art.business.domain.auctionproduct;

import java.util.Date;

import cn.culturemall.art.common.domain.DomainObject;

public class AuctionProduct extends DomainObject {

	private static final long serialVersionUID = 5744100330170328872L;

	private Long auction_id;
	
	private Long product_id;
	
	private Long merchant_id;
	
	private Long club_id;
	
	private Long user_id;
	
	private Date start_time;
	
	private Date end_time;
	
	private Long current_user_id;
	
	private Double current_price;
	
	private Double lowest_price;
	
	private Double step_price;
	
	private Integer times;

	public Long getAuction_id() {
		return auction_id;
	}

	public void setAuction_id(Long auction_id) {
		this.auction_id = auction_id;
	}

	public Long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}

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

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public Date getStart_time() {
		return start_time;
	}

	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}

	public Date getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}

	public Long getCurrent_user_id() {
		return current_user_id;
	}

	public void setCurrent_user_id(Long current_user_id) {
		this.current_user_id = current_user_id;
	}

	public Double getCurrent_price() {
		return current_price;
	}

	public void setCurrent_price(Double current_price) {
		this.current_price = current_price;
	}

	public Double getLowest_price() {
		return lowest_price;
	}

	public void setLowest_price(Double lowest_price) {
		this.lowest_price = lowest_price;
	}

	public Double getStep_price() {
		return step_price;
	}

	public void setStep_price(Double step_price) {
		this.step_price = step_price;
	}

	public Integer getTimes() {
		return times;
	}

	public void setTimes(Integer times) {
		this.times = times;
	}

	@Override
	public String toString() {
		return "AuctionProduct [auction_id=" + auction_id + ", product_id="
				+ product_id + ", merchant_id=" + merchant_id + ", club_id="
				+ club_id + ", user_id=" + user_id + ", start_time="
				+ start_time + ", end_time=" + end_time + ", current_user_id="
				+ current_user_id + ", current_price=" + current_price
				+ ", lowest_price=" + lowest_price + ", step_price="
				+ step_price + ", times=" + times + "]";
	}
	
}
