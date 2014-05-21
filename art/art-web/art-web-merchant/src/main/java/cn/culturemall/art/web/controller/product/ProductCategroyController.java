package cn.culturemall.art.web.controller.product;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Scope("prototype")
@RequestMapping(value = "/productCategroy")
public class ProductCategroyController {

	@RequestMapping(value = "/productCategroyList")
	public String productCategroyList() {

		return "product/product_categroy_list";
	}
}
