package cn.culturemall.art.business.enums.order;

public enum ORDER_STATUS {

	WAITING_PAY(0, "等待付款"), PAID(1, "已支付"), PAY_TIMEOUT(2, "超时未支付"), WAITING_SEND_GOODS(3, "待发货"), HAS_SEND_GOODS(4, "已发货"), CLOSE_EXPIRED_ORDER(5,
			"超时支付关闭订单"), CLOSE_NORMAL_ORDER(6, "正常关闭订单");

	private int code;

	private String name;

	ORDER_STATUS(int code, String name) {
		this.code = code;
		this.name = name;
	}

	public int getCode() {
		return this.code;
	}

	public String getName() {
		return this.name;
	}

	public static ORDER_STATUS valueOf(int code) {
		switch (code) {
			case 0:
				return WAITING_PAY;
			case 1:
				return PAID;
			case 2:
				return PAY_TIMEOUT;
			case 3:
				return WAITING_SEND_GOODS;
			case 4:
				return HAS_SEND_GOODS;
			case 5:
				return CLOSE_EXPIRED_ORDER;
			case 6:
				return CLOSE_NORMAL_ORDER;
			default:
				return null;
		}
	}
}
