package com.jeipz.query;

import java.util.HashMap;
import java.util.Map;

public class Match {

	Map<String, String> match = new HashMap<String, String>();
	
	public Match(String key, String value) {
		match.put(key, value);
	}

	public Map<String, String> getMatch() {
		return match;
	}

	public void setMatch(Map<String, String> match) {
		this.match = match;
	}

}
