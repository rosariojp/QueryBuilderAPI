package com.jeipz.query;

import java.util.HashMap;
import java.util.Map;

public class Match {

	Map<String, String> pair;
	
	public Match(String type, String value) {
		pair = new HashMap<String, String>();
		pair.put(type, value);
	}

	public Map<String, String> getMatch() {
		return pair;
	}

	public void setMatch(Map<String, String> pair) {
		this.pair = pair;
	}

}
