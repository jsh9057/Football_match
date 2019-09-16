package kr.ac.sku.dao;

import kr.ac.sku.dto.Team;

public interface TeamMapper {
	public Team getTeambycall(String t_call);
	public void addTeam(Team team);
	public int login(String t_call, String t_pwd);
//
//	public int addPlayer(Player player);
//	public void updatePlayer(int id);
//	public void deletePlayer(int id);
}

