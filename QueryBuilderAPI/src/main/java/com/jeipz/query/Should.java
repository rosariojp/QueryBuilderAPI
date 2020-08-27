package com.jeipz.query;

public class Should {

	Match match;
	
	public Should(String type, String value) {
		this.match = new Match(type, value);
	}

	public Match getMatch() {
		return match;
	}

	public void setMatch(Match match) {
		this.match = match;
	}
	
}
