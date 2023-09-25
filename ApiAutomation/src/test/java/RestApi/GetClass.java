package RestApi;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class GetClass {
	
	@Test
	public void getCall() {
		 
		Response res = given().contentType("application/json")
								.when()
								.get("https://reqres.in/api/users/2")
								.then()
								.statusCode(200).log().body().extract().response();
		String s1 = res.jsonPath().getString("");
								System.out.println("output email id "+s1);
					
	}

}
