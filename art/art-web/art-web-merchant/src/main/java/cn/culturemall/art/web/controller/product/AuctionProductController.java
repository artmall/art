package cn.culturemall.art.web.controller.product;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Scope("prototype")
@RequestMapping(value = "/auctionProduct")
public class AuctionProductController {

	@RequestMapping(value = "/auctionProductList")
	public String auctionProductList() {

		return "product/auction_product_list";
	}

}
