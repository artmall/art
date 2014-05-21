package cn.culturemall.art.web.controller.merchant;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Scope("prototype")
@RequestMapping(value = "/merchant")
public class MerchantController {

	@RequestMapping(value = "/merchantList")
	public String merchantList() {

		return "merchant/merchant_list";
	}
}
