package qaautomation.october2021;

import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;


import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.response.Response;
import restassured.apis.Tugas5APIEndpoints;
import utils.APIUtility;
import utils.DataUtility;

public class APITest {
	String token = "";

	@Test
	public void testDashboard() {
		RequestSpecification loginJsonSpec = null;
		Response response = given().spec(loginJsonSpec).param("status", "completed").when().get(Tugas5APIEndpoints.dashboard);
		APIUtility.verifyStatusCodeSuccess(response);
		response.then().assertThat()
				.body(matchesJsonSchema(DataUtility.getDataFromExcel("Schemas", "DashboardAPISchema")));
	}

	@Test
	public void testUser() {
		RequestSpecification loginJsonSpec = null;
		Response response = given().spec(loginJsonSpec).when().get(Tugas5APIEndpoints.me);
		APIUtility.verifyStatusCodeSuccess(response);
		response.then().assertThat().body(matchesJsonSchema(DataUtility.getDataFromExcel("Schemas", "UserAPISchema")));
	}

	@Test
	public void testConfig() {
		RequestSpecification commonJsonSpec = null;
		Response response = given().spec(commonJsonSpec).when().get(Tugas5APIEndpoints.config);
		assertEquals(response.getStatusCode(), 200);
	}

	@Test
	public void fakerTest() {
		Faker faker = new Faker();
		System.out.println(faker.name().username() + "@gmail.com");
	}

	@Test
	public void invalidCredTest() {
		String loginPayload = DataUtility.getDataFromExcel("Payloads", "IncorrectLoginPayload")
				.replace("$.username", "a@gmail.com").replace("$.password", "wrongpassword");
		RequestSpecification commonJsonSpec = null;
		Response response = given().spec(commonJsonSpec).body(loginPayload).when().post(Tugas5APIEndpoints.login);
		assertNotEquals(response.getStatusCode(), 200);
	}
	
	
}
