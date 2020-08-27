package com.jeipz.builder;

import com.jeipz.query.Bool;
import com.jeipz.query.Query;

public class QueryBuilder {

	Query query;
	
	public QueryBuilder() {
		query = new Query();
	}
	
	public Bool bool() {
		return query.getBool();
	}

	public Query getQuery() {
		return query;
	}

	public void setQuery(Query query) {
		this.query = query;
	}
	
}
