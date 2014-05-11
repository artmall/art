package cn.culturemall.art.common.enums;

public enum TRADE_MODEL {

	NORMAL_MODEL(0, "正常模式"), AUCTION_MODEL(1, "拍卖模式");
	
    private int code;
	
	private String name;
	
	TRADE_MODEL(int code, String name) {
		this.code = code;
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
