package cn.culturemall.art.web.controller.merchant;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Scope("prototype")
@RequestMapping(value = "/club")
public class ClubController {

	@RequestMapping(value = "/clubList")
	public String clubList() {

		return "merchant/club_list";
	}
}
