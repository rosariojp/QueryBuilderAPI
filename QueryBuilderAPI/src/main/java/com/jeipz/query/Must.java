package com.jeipz.query;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Must {
	
	List<Map<String, String>> must = new ArrayList<Map<String, String>>();
	
	public Must(Match match) {
		must.add(match.getMatch());
	}

	public List<Map<String, String>> getMust() {
		return must;
	}

	public void setMust(List<Map<String, String>> must) {
		this.must = must;
	}

}
