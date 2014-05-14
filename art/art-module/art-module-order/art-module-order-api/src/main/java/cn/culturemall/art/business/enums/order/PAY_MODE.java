package cn.culturemall.art.business.enums.order;

public enum PAY_MODE {

	ALIPAY(0, "支付宝"), EBANK(1, "银行");

	private int code;

	private String name;

	PAY_MODE(int code, String name) {
		this.code = code;
		this.name = name;
	}

	public int getCode() {
		return this.code;
	}

	public String getName() {
		return this.name;
	}

	public static PAY_MODE valueOf(int code) {
		switch (code) {
			case 0:
				return ALIPAY;
			case 1:
				return EBANK;
			default:
				return null;
		}
	}
}
