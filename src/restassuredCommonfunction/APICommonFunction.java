package restassuredCommonfunction;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;

public class APICommonFunction {
	public static int statusCode(String baseURI,String requestBody,String resource) {
		RestAssured.baseURI=baseURI;
		int statusCode=given().header("Content-Type","application/json").body(requestBody).when().post(resource).then().extract().statusCode();
		return statusCode;
	}
	public static String responseBody(String baseURI,String requestBody,String resource) {
		RestAssured.baseURI=baseURI;
		String responseBody=given().header("Content-Type","application/json").body(requestBody).when().post(resource).then().extract().response().asString();
				return responseBody;
	}
	public static int statusCode1(String baseURI1,String resource1)
	{
		RestAssured.baseURI=baseURI1;
		int statusCode1=given().header("Content-Type","application/json").when().get(resource1).then().extract().statusCode();
		return statusCode1;
	}
	public static String responseBody1(String baseURI1,String resource1) {
		RestAssured.baseURI=baseURI1;
		String responseBody1=given().header("Content-Type","application/json").when().get(resource1).then().extract().response().asString();
				return responseBody1;
	}
 public static int statusCode2(String baseURI2,String resource2)
 {
	 RestAssured.baseURI=baseURI2;
	 int statusCode2=given().header("Content-Type","application/json").when().get(resource2).then().extract().statusCode();
	 return statusCode2;
 }
 public static String responseBody2(String baseURI2,String resource2) {
	  RestAssured.baseURI=baseURI2;
	  String responseBody2=given().header("Content-Type","application/json").when().get(resource2).then().extract().response().asString();
	  return responseBody2;
 }
}
