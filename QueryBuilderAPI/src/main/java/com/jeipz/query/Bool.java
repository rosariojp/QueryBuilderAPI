package com.jeipz.query;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("rawtypes")
public class Bool <A, B> {

	private List<Match> must;
	private List<Match> should;
	
	public Bool() {
		must = new ArrayList<Match>();
		should = new ArrayList<Match>();
	}
	
	public Bool mustMatch(A name, B value) {
		must.add(new Must<A, B>(name, value).getMatch());
		return this;
	}
	
	public Bool shouldMatch(A name, B value) {
		should.add(new Should<A, B>(name, value).getMatch());
		return this;
	}

	public List<Match> getMust() {
		return must;
	}

	public List<Match> getShould() {
		return should;
	}

}
