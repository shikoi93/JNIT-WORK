package com.playersInc;



public interface PlayersService {

	public abstract boolean registerPlayers(Players players);

	public abstract Players validatePlayersCredential(String email, String password);

}