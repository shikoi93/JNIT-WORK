package com.playersInc;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MyController {
	
	@Autowired
	private PlayersService playersService;

	public void setPlayersService(PlayersService playersService) {
		this.playersService = playersService;
	}
	
	public PlayersService getPlayersService() {
		return playersService;
	}
	
	@RequestMapping(value ="/" ,method=RequestMethod.GET)
	public String homePage(){
		return "home";
	}
	@RequestMapping(value ="/register" ,method=RequestMethod.GET)
	public String registerPage(Model model){
		model.addAttribute("players", new Players());
		return "register";
	}
	@RequestMapping(value ="/login" ,method=RequestMethod.GET)
	public String loginPage(Model model){
		model.addAttribute("playersCredential", new PlayersCredential());
		return "login";
	}
	@RequestMapping(value ="/registerSuccess" ,method=RequestMethod.POST)
	public ModelAndView registerSuccess(@Valid @ModelAttribute("players") Players players){
		getPlayersService().registerPlayers(players);
		
		ModelAndView modelAndView = new ModelAndView("home");
		
		return modelAndView;
	}
	@RequestMapping(value ="/loginSuccess" ,method=RequestMethod.POST)
	public ModelAndView loginSuccess(@Valid @ModelAttribute("playersCredential") PlayersCredential playersCredential){
		
		ModelAndView modelAndView = new ModelAndView("welcome");
		Players players = getPlayersService().validatePlayersCredential(playersCredential.getEmail(), playersCredential.getPassword());
		if(players!= null){
			modelAndView.addObject("players", players);
			return modelAndView;
		}else{
			 modelAndView = new ModelAndView("notFound");
		}
		return modelAndView;
	}
	

}
