package com.apitest;

	import static io.restassured.RestAssured.*;
	import io.restassured.response.Response;

	public class GETRequestWithHeaders {
	    public static void main(String[] args) {
	        Response response = given()
	                .queryParam("page", 2) // Sending query parameter
	                .when()
	                .get("https://reqres.in/api/users")
	                .then()
	                .statusCode(200)
	                .extract().response();

	        System.out.println("Response: " + response.asPrettyString());
	    }
	}

//}
