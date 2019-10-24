package com.mycompany.spring_dependency_injection.beans;

import lombok.Setter;

@Setter
public class CricketCoach implements Coach {
	private String email;
	private String teamName;
	private Fortune fortune;
	
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice batting today";
	}
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune().toString();
	}
	@Override
	public String toString() {
		return "CricketCoach [email=" + email + ", teamName=" + teamName + ", fortune=" + fortune + "]";
	}
	
}
