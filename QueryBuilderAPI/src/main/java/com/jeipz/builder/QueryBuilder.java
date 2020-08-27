package com.jeipz.builder;

import com.jeipz.query.Bool;
import com.jeipz.query.Query;

@SuppressWarnings("rawtypes")
public class QueryBuilder {

	private Query query;
	
	public QueryBuilder() {
		query = new Query();
	}
	
	public Bool bool() {
		return query.getBool();
	}

	public Query getQuery() {
		return query;
	}
	
}
