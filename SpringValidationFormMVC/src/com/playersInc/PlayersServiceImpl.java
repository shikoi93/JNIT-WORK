package com.playersInc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.playersInc.*;

@Service("playersService")
public class PlayersServiceImpl implements PlayersService {
	
	@Autowired
	private PlayersDAO playersDAO;
	
	public void setStudentDAO(PlayersDAO playersDAO) {
		this.playersDAO = playersDAO;
	}
	
	public PlayersDAO getPlayersDAO() {
		return playersDAO;
	}
	
	@Override
	public boolean registerPlayers(Players players) {
		boolean isRegister=false;
		boolean savePlayers = getPlayersDAO().savePlayers(players);
		if(savePlayers)
			isRegister=true;
		return isRegister;
	}

	@Override
	public Players validatePlayersCredential(String email, String password) {
		// TODO Auto-generated method stub
		Players players = getPlayersDAO().getPlayersDetailsByEmailAndPassword(email, password);
		
		return players;
	}

}
