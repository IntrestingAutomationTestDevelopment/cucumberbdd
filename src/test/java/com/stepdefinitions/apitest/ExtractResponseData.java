package com.apitest;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class ExtractResponseData {
	@Test
	public static void apiTestExtract(){
		Response response = given().when().get("https://jsonplaceholder.typicode.com/posts/1").then().extract()
				.response();

		// Extract values
		int userId = response.jsonPath().getInt("userId");
		String title = response.jsonPath().getString("title");

		System.out.println("User ID: " + userId);
		System.out.println("Title: " + title);
	}
}
