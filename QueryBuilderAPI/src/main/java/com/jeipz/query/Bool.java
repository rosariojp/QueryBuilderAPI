package com.jeipz.query;

import java.util.ArrayList;
import java.util.List;

public class Bool {

	List<Match> must;
	List<Match> should;
	
	public Bool() {
		must = new ArrayList<Match>();
		should = new ArrayList<Match>();
	}
	
	public Bool mustMatch(String type, String value) {
		must.add(new Must(type, value).getMatch());
		return this;
	}
	
	public Bool shouldMatch(String type, String value) {
		should.add(new Should(type, value).getMatch());
		return this;
	}

	public List<Match> getMust() {
		return must;
	}

	public void setMust(List<Match> must) {
		this.must = must;
	}

	public List<Match> getShould() {
		return should;
	}

	public void setShould(List<Match> should) {
		this.should = should;
	}

}
