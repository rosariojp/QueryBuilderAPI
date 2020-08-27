package com.jeipz.query;

@SuppressWarnings("rawtypes")
public class Should<A, B> {

	private Match match;

	public Should(A name, B value) {
		this.match = new Match<A, B>(name, value);
	}

	public Match getMatch() {
		return match;
	}

}
