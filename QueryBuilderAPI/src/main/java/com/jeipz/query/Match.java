package com.jeipz.query;

import java.util.HashMap;
import java.util.Map;

public class Match <A, B> {

	private Map<A, B> pair;
	
	public Match(A name, B value) {
		pair = new HashMap<A, B>();
		pair.put(name, value);
	}

	public Map<A, B> getMatch() {
		return pair;
	}

}
