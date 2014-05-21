package cn.culturemall.art.web.controller.product;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Scope("prototype")
@RequestMapping(value = "/product")
public class ProductController {

	@RequestMapping(value = "/productList")
	public String productList() {

		return "product/product_list";
	}

	@RequestMapping(value = "/toProductAdd")
	public String toProductAdd() {

		return "product/product_add";
	}
}
