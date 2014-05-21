package cn.culturemall.art.web.controller.order;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Scope("prototype")
@RequestMapping(value = "/order")
public class OrderController {

	@RequestMapping(value = "/orderList")
	public String orderList() {

		return "order/order_list";
	}
}
