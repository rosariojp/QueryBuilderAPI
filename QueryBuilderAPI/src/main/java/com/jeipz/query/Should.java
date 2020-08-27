package com.jeipz.query;

public class Should {

	Match match;
	
	public Should(String name, String value) {
		this.match = new Match(name, value);
	}

	public Match getMatch() {
		return match;
	}

	public void setMatch(Match match) {
		this.match = match;
	}
	
}
