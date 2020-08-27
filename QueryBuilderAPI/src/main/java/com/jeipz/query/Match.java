package com.jeipz.query;

import java.util.HashMap;
import java.util.Map;

public class Match {

	Map<String, String> pair;
	
	public Match(String name, String value) {
		pair = new HashMap<String, String>();
		pair.put(name, value);
	}

	public Map<String, String> getMatch() {
		return pair;
	}

	public void setMatch(Map<String, String> pair) {
		this.pair = pair;
	}

}
