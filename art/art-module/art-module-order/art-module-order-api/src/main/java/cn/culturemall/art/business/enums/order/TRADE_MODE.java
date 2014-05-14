package cn.culturemall.art.business.enums.order;

public enum TRADE_MODE {

	NORMAL_BUY(0, "正常购买"), AUCTION_BUY(1, "竞拍购买");

	private int code;

	private String name;

	TRADE_MODE(int code, String name) {
		this.code = code;
		this.name = name;
	}

	public int getCode() {
		return this.code;
	}

	public String getName() {
		return this.name;
	}

	public static TRADE_MODE valueOf(int code) {
		switch (code) {
			case 0:
				return NORMAL_BUY;
			case 1:
				return AUCTION_BUY;
			default:
				return null;
		}
	}
}
