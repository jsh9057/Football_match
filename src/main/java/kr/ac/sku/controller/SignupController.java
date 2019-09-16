package kr.ac.sku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.sku.dto.Team;
import kr.ac.sku.service.TeamService;

@Controller
public class SignupController {
	@Autowired
	TeamService teamService;
	
	@RequestMapping("/signup")
	public String signup (Model model) {
		System.out.println("signup.jsp");
		
		return "signup/signup1";
	}
	
	@PostMapping("/signup2")
	public String signup2 (Model model,
			@RequestParam(value="t_call", required = true)String t_call,
			@RequestParam(value="t_pwd", required = true)String t_pwd) {
		if(t_call==null) {
			return "signup/signup1";
		}
		model.addAttribute("t_call", t_call);
		model.addAttribute("t_pwd", t_pwd);
		
		return "signup/singup2";
	}
	
	@RequestMapping("/aftersignup")
	public String loginView (Model model,
			@RequestParam(value="t_call", required = true)String t_call,
			@RequestParam(value="t_pwd", required = true)String t_pwd,
			@RequestParam(value="t_name", required = true)String t_name,
			@RequestParam(value="t_leader", required = true)String t_leader,
			@RequestParam(value="t_place", required = true)String t_place,
			@RequestParam(value="t_time", required = true)String t_time,
			@RequestParam(value="t_power", required = true)int t_power) {
		
		
		System.out.println(t_call);
		System.out.println(t_pwd);
		System.out.println(t_name);
		System.out.println(t_leader);
		System.out.println(t_place);
		System.out.println(t_time);
		System.out.println(t_power);
		
		Team team = new Team();
		team.setT_call(t_call);
		team.setT_pwd(t_pwd);
		team.setT_name(t_name);
		team.setT_leader(t_leader);
		team.setT_place(t_place);
		team.setT_time(t_time);
		team.setT_power(t_power);
		
		teamService.addTeam(team);
		
		return "login/login";
	}
	
}
