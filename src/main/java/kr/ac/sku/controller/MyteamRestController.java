package kr.ac.sku.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.ac.sku.dto.Team;
import kr.ac.sku.service.TeamService;

@RestController
@RequestMapping("/restmyteam")
public class MyteamRestController {
	
	@Autowired
	TeamService teamService;
	
	@RequestMapping("/teambycall")
	@PostMapping
	public Team getTeambycall(@RequestBody String t_call) {
		System.out.println("t_call "+t_call );
		return teamService.getTeambycall(t_call);
	}
	
	@RequestMapping("/callcheck")
	@PostMapping
	public String callCheck(@RequestBody String t_call) {
		System.out.println("callcheck");
		return teamService.callCheck(t_call);
	}
	
}
