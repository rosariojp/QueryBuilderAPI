package com.jeipz.clients;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.jeipz.query.Match;
import com.jeipz.query.Must;

public class Test {

	public static void main(String[] args) {
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
		
		Match match = new Match("item", "Milk");
		Must must = new Must(match);
		try {
			String objectToJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(must);
			System.out.println(objectToJson);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
	}
	
}
