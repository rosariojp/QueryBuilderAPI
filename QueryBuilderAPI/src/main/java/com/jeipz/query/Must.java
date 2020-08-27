package com.jeipz.query;

public class Must {

	Match match;
	Bool bool;
	
	public Must(String name, String value) {
		bool = new Bool();
		this.match = new Match(name, value);
	}

	public Match getMatch() {
		return match;
	}

	public void setMatch(Match match) {
		this.match = match;
	}

	public Bool getBool() {
		return bool;
	}

	public void setBool(Bool bool) {
		this.bool = bool;
	}
	
}
