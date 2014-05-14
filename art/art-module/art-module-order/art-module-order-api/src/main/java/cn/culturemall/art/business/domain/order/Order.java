package cn.culturemall.art.business.domain.order;

import java.util.Date;

import cn.culturemall.art.business.enums.order.ORDER_STATUS;
import cn.culturemall.art.business.enums.order.PAY_MODE;
import cn.culturemall.art.business.enums.order.TRADE_MODE;
import cn.culturemall.art.common.domain.DomainObject;

public class Order extends DomainObject {

	private static final long serialVersionUID = -5653993338164671852L;

	private Long order_id;

	private String order_code;

	private Long product_id;

	private Long merchant_id;

	private Long user_id;

	private ORDER_STATUS order_status;

	private TRADE_MODE trade_mode;

	private Boolean is_pay;

	private PAY_MODE pay_mode;

	private Double amount;

	private Date pay_time;

	private Date last_pay_time;

	private Date create_time;

	public Long getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}

	public String getOrder_code() {
		return order_code;
	}

	public void setOrder_code(String order_code) {
		this.order_code = order_code;
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

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public ORDER_STATUS getOrder_status() {
		return order_status;
	}

	public void setOrder_status(ORDER_STATUS order_status) {
		this.order_status = order_status;
	}

	public TRADE_MODE getTrade_mode() {
		return trade_mode;
	}

	public void setTrade_mode(TRADE_MODE trade_mode) {
		this.trade_mode = trade_mode;
	}

	public Boolean getIs_pay() {
		return is_pay;
	}

	public void setIs_pay(Boolean is_pay) {
		this.is_pay = is_pay;
	}

	public PAY_MODE getPay_mode() {
		return pay_mode;
	}

	public void setPay_mode(PAY_MODE pay_mode) {
		this.pay_mode = pay_mode;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getPay_time() {
		return pay_time;
	}

	public void setPay_time(Date pay_time) {
		this.pay_time = pay_time;
	}

	public Date getLast_pay_time() {
		return last_pay_time;
	}

	public void setLast_pay_time(Date last_pay_time) {
		this.last_pay_time = last_pay_time;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	@Override
	public String toString() {
		return "Orders [order_id=" + order_id + ", order_code=" + order_code + ", product_id=" + product_id + ", merchant_id=" + merchant_id
				+ ", user_id=" + user_id + ", order_status=" + order_status + ", trade_mode=" + trade_mode + ", is_pay=" + is_pay + ", pay_mode="
				+ pay_mode + ", amount=" + amount + ", pay_time=" + pay_time + ", last_pay_time=" + last_pay_time + ", create_time=" + create_time
				+ "]";
	}

}
