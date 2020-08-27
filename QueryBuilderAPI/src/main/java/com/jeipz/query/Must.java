package com.jeipz.query;

@SuppressWarnings("rawtypes")
public class Must<A, B> {

	private Match match;

	public Must(A name, B value) {
		this.match = new Match<A, B>(name, value);
	}

	public Match getMatch() {
		return match;
	}

}
