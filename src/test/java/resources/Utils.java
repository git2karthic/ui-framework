package resources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Utils {

	public RequestSpecification requestSpecification;

	public RequestSpecification getRequestSpecification() throws IOException {
		
		
			if(requestSpecification == null)
			{
			PrintStream log =new PrintStream(new FileOutputStream("logging.txt"));
			requestSpecification =new RequestSpecBuilder().setBaseUri(GetGlobalValue("BASE_URL")).addQueryParam("key", "qaclick123")
					 .addFilter(RequestLoggingFilter.logRequestTo(log))
					 .addFilter(ResponseLoggingFilter.logResponseTo(log))
			.setContentType(ContentType.JSON).build();
			 return requestSpecification;
			}
			return requestSpecification;
		
		
	}

	public String GetGlobalValue(String key) throws IOException {
		FileInputStream fisInput = new FileInputStream(
				System.getProperty("user.dir") + "/src/test/java/resources/Global.properties");
		Properties prop = new Properties();
		prop.load(fisInput);
		return prop.getProperty(key);
	}

	public String GetJsonPath(Response response, String key) {
		String strResponse = response.asString();
		JsonPath jsonPath = new JsonPath(strResponse);
		return jsonPath.getString(key).toString();
	}

}
