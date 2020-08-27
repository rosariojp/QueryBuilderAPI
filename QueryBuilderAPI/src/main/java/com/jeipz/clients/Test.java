package com.jeipz.clients;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import com.jeipz.builder.QueryBuilder;

public class Test {

	public static void main(String[] args) {
		QueryBuilder builder = new QueryBuilder();
		builder.bool().mustMatch("item", "Milk").mustMatch("item_type", "Dairy");
		builder.bool().shouldMatch("product_location", "New Mexico").shouldMatch("warehouse_number", 37);
		System.out.println(convertObjectToJSONString(builder));
	}
	
	public static String convertObjectToJSONString(Object object) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
		String objectToJson = "";

		try {
			objectToJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
		} catch (JsonProcessingException e) {
			System.out.println("Error cause: " + e.getCause());
			System.out.println("Error message: " + e.getMessage());
		}
		return objectToJson;
	}
	
}
