package kr.ac.sku.service;

import java.util.HashMap;

import kr.ac.sku.dto.Team;

public interface TeamService {
	public Team getTeambycall(String t_call);
	public String callCheck(String t_call);
	public void addTeam(Team team);
	public int login (String t_call, String t_pwd);
}
