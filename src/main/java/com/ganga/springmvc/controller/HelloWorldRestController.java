package com.ganga.springmvc.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ganga.springmvc.domain.Player;

@RestController
public class HelloWorldRestController {

	@RequestMapping("/hello/{player}")
	public Player message(@PathVariable String player) {
		Player message = new Player(player, "Hello.. " + player);
		return message;
	}
}
