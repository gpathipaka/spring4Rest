package com.ganga.springmvc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ganga.springmvc.domain.Player;

@RestController
public class HelloWorldRestController {
	Map map=new HashMap<String,Integer>();

	@RequestMapping("/hello/{player}")
	public Player message(@PathVariable String player) {
		Player message = new Player(player, "Hello.. " + player);
		//testing
		return message;
	}
}
