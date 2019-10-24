package com.mycompany.spring_dependency_injection.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
	@Autowired
	private Fortune fortune;		//loose coupling
	
	/*
	 * public BaseballCoach() { }
	 * 
	 * public BaseballCoach(Fortune fortune) { this.fortune = fortune; }
	 */

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice Back Volley today";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune().toString();
	}
	
}
