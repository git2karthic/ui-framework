package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.Pojo_Data;
import pojo.Pojo_GetAllUsers;
import resources.APIResources;
import resources.Utils;

public class GetAllUsers_StepDefinitions extends Utils{
	
	RequestSpecification reqSpec;
	ResponseSpecification resSpec;
	Response response;

	
	@Given("User has all the GetAllUsers API specification")
	public void user_has_all_the_get_all_users_api_specification() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
	    reqSpec = given().spec(getRequestSpecification()).queryParam("page", 1);
	}

	@When("User makes a GET call to GetAllUsers API")
	public void user_makes_a_get_call_to_get_all_users_api() {
	    // Write code here that turns the phrase above into concrete actions
		APIResources apiResource = APIResources.valueOf("GetAllUserAPI");
		resSpec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		response = reqSpec.when().get(apiResource.GetResource());
//		Deserialization
		Pojo_GetAllUsers allUsers = reqSpec.when().get(apiResource.GetResource()).as(Pojo_GetAllUsers.class);
		
		System.out.println(allUsers.getPage());
		System.out.println(allUsers.getPer_page());
		System.out.println(allUsers.getData());

	    
	}

	@Then("User receives a response with status code {int}")
	public void user_receives_a_response_with_status_code(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(response.getStatusCode(), 200);
	}

	@Then("User received a response with {string} value {int}")
	public void user_received_a_response_with_value(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(GetJsonPath(response, string), String.valueOf(int1));
	}

}
