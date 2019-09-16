package kr.ac.sku.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.ac.sku.dao.PlayerMapper;
import kr.ac.sku.dto.Player;

@Service
public class PlayerServiceImpl implements PlayerService {
	@Autowired
	PlayerMapper playerDao;
	
	@Transactional(readOnly=true)
	public List<Player> getPlayers() {
		return playerDao.getPlayers();
	}

}
