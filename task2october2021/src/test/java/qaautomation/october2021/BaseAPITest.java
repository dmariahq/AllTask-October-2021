package qaautomation.october2021;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import restassured.apis.Tugas5APIEndpoints;
import restassured.apis.Tugas5JsonPaths;
import utils.DataUtility;

public abstract class BaseAPITest {

	RequestSpecification commonJsonSpec = new RequestSpecBuilder().setBaseUri("https://api-staging-builder.engineer.ai")
			.setContentType(ContentType.JSON).build().log().all();
	RequestSpecification loginJsonSpec;

	@BeforeMethod
	public void login() {
		RestAssured.baseURI = "https://api-staging-builder.engineer.ai";
		String loginPayload = DataUtility.getDataFromExcel("Payloads", "LoginPayload");
		Response response = RestAssured.given().contentType("application/json").body(loginPayload).when()
				.post(Tugas5APIEndpoints.login);
		String token = response.jsonPath().get(Tugas5JsonPaths.authToken);
		loginJsonSpec = new RequestSpecBuilder().setBaseUri("https://api-staging-builder.engineer.ai")
				.setContentType(ContentType.JSON).addHeader("authtoken", token).build().log().all();
	}

}
