package kr.ac.sku.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.sku.dto.Player;
import kr.ac.sku.service.PlayerService;

@Controller
public class HomeController {
	@Autowired
	PlayerService playerService;
	@RequestMapping("/home")
	public String ground (Model model) {
		System.out.println("home.jsp"); 
		System.out.println("p_num: "+playerService.getPlayers().get(0).getP_num());
		System.out.println("");
		System.out.println();
		return "home";
	}
}
