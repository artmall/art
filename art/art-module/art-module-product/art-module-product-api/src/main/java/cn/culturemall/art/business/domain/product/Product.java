package cn.culturemall.art.business.domain.product;

import java.util.Date;

import cn.culturemall.art.common.domain.DomainObject;
import cn.culturemall.art.common.enums.PRODUCT_STATUS;
import cn.culturemall.art.common.enums.TRADE_MODEL;

public class Product extends DomainObject {

	private static final long serialVersionUID = 2301768916727513349L;
	
	private Long product_id;
	
	private Long categroy_id;
	
	private Long merchant_id;
	
	private Long club_id;
	
	private String product_name;
	
	private Double product_price;
	
	private Integer storage_num;
	
	private Integer sell_num;
	
	private PRODUCT_STATUS status;
	
	private Date create_time;
	
    private String keyword;
    
   	private String short_desc;
   	
   	private String detail_desc;
   	
   	private Date update_time;
   	
   	private Integer sort_order;
   	
   	private Integer is_freeze;
   	
   	private TRADE_MODEL trade_model;

	public Long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}

	public Long getCategroy_id() {
		return categroy_id;
	}

	public void setCategroy_id(Long categroy_id) {
		this.categroy_id = categroy_id;
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

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public Double getProduct_price() {
		return product_price;
	}

	public void setProduct_price(Double product_price) {
		this.product_price = product_price;
	}

	public Integer getStorage_num() {
		return storage_num;
	}

	public void setStorage_num(Integer storage_num) {
		this.storage_num = storage_num;
	}

	public Integer getSell_num() {
		return sell_num;
	}

	public void setSell_num(Integer sell_num) {
		this.sell_num = sell_num;
	}

	public PRODUCT_STATUS getStatus() {
		return status;
	}

	public void setStatus(PRODUCT_STATUS status) {
		this.status = status;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getShort_desc() {
		return short_desc;
	}

	public void setShort_desc(String short_desc) {
		this.short_desc = short_desc;
	}

	public String getDetail_desc() {
		return detail_desc;
	}

	public void setDetail_desc(String detail_desc) {
		this.detail_desc = detail_desc;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	public Integer getSort_order() {
		return sort_order;
	}

	public void setSort_order(Integer sort_order) {
		this.sort_order = sort_order;
	}

	public Integer getIs_freeze() {
		return is_freeze;
	}

	public void setIs_freeze(Integer is_freeze) {
		this.is_freeze = is_freeze;
	}

	public TRADE_MODEL getTrade_model() {
		return trade_model;
	}

	public void setTrade_model(TRADE_MODEL trade_model) {
		this.trade_model = trade_model;
	}

	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", categroy_id="
				+ categroy_id + ", merchant_id=" + merchant_id + ", club_id="
				+ club_id + ", product_name=" + product_name + ", category_id="
			    + ", product_price=" + product_price
				+ ", storage_num=" + storage_num + ", sell_num=" + sell_num
				+ ", status=" + status + ", create_time=" + create_time
				+ ", keyword=" + keyword + ", short_desc=" + short_desc
				+ ", detail_desc=" + detail_desc + ", update_time="
				+ update_time + ", sort_order=" + sort_order + ", is_freeze="
				+ is_freeze + ", trade_model=" + trade_model + "]";
	}
   	
}
