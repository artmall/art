package cn.culturemall.art.common.enums;

public enum PRODUCT_STATUS {

	WAIT_SHELVES(1, "待上架"), OFF_SHELVES(0, "下架"), SHELVES(2, "上架");
	
    private int code;
	
	private String name;
	
	PRODUCT_STATUS(int code, String name) {
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
