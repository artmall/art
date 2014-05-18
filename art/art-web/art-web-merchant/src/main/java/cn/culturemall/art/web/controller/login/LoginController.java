package cn.culturemall.art.web.controller.login;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Scope("prototype")
@RequestMapping(value = "/login")
public class LoginController {

	@RequestMapping(value = "/login")
	public String login() {

		return "login/login";
	}

	@RequestMapping(value = "/verify", method = RequestMethod.POST)
	public String verify(HttpSession session, HttpServletResponse response, String loginName, String password) {

		System.out.println(loginName);
		System.out.println(password);

		return "redirect:main.do";
	}

	@RequestMapping(value = "/main")
	public String main() {

		return "main";
	}

}
