package kr.ac.sku.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.ac.sku.dao.TeamMapper;
import kr.ac.sku.dto.Team;

@Service
public class TeamServiceImpl implements TeamService{
	@Autowired
	TeamMapper teamDao;
	
	@Override
	@Transactional(readOnly=true)
	public Team getTeambycall(String t_call) {

		return teamDao.getTeambycall(t_call);
	}
	
	@Override
	@Transactional(readOnly=true)
	public String callCheck(String t_call) {
		String resutl =" {\"result\":\"possible\"} ";
		if (teamDao.getTeambycall(t_call) !=null) {
			resutl = " {\"result\":\"impossible\"} ";
		}
		System.out.println(resutl);
		return resutl;
	}

	@Override
	public void addTeam(Team team) {

		teamDao.addTeam(team);
	}
	public int login (String t_call, String t_pwd) {
		int t_num = teamDao.login(t_call, t_pwd);
		return t_num;
	}
	
	
}
