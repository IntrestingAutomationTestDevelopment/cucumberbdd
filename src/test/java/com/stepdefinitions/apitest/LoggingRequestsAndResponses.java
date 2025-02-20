package com.apitest;

	import static io.restassured.RestAssured.*;

	public class LoggingRequestsAndResponses {
		
		//public class GETWITHLOGGING {

	    public static void main(String[] args) {
	        given()
	                .log().all() // Log request details
	                .when()
	                .get("https://jsonplaceholder.typicode.com/posts/1")
	                .then()
	                .log().all(); // Log response details
	    }
	}

//}
