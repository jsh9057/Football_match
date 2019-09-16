package kr.ac.sku.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.sku.service.TeamService;

@Controller
public class LoginController {
	@Autowired TeamService teamService;
	
	@RequestMapping("/login")
	public String index (Model model) {
		System.out.println("login.jsp");
		
		return "login/login";
	}
	
	@RequestMapping("/loginpost")
	public String loginpost(Model model, HttpSession httpSession,
			@RequestParam(value="call", required = true)String t_call,
			@RequestParam(value="pwd", required = true)String t_pwd) {
		
		int t_num = teamService.login(t_call, t_pwd);
		if(t_num == 0) {
			return "/login";
		}
		
		httpSession.setAttribute("t_num", t_num);
		System.out.println(t_num);
		return "team/myTeamInfo";
	}
	
	
	
	
}
