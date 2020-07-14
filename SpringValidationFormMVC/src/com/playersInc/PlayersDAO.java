package com.playersInc;

public interface PlayersDAO {
	public abstract boolean savePlayers(Players players);

	public Players getPlayersDetailsByEmailAndPassword(String email, String password);

}
