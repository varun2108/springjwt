package com.javainuse.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.Team;
import com.javainuse.repository.TeamRepository;



@RestController
@CrossOrigin()
public class hello {
@Autowired
TeamRepository te;
	@GetMapping("/hello")
	public Iterable<Team> teams(){
		Iterable<Team> t=new ArrayList<Team>();
		System.out.println(te.findAll());
		return te.findAll();
	}
	
}
