package restAssuredTestClass;
import org.testng.Assert;
import io.restassured.path.json.JsonPath;
import restAssuredrepository.post_repository;
import restassuredCommonfunction.APICommonFunction;

public class post_tc_1 {
 public static void execute() {
	 String baseURI=post_repository.req_baseURI();
	 String requestBody=post_repository.requestBody();
	 String resource=post_repository.resource();
	 int statusCode=APICommonFunction.statusCode(baseURI, requestBody, resource);
	 String responseBody=APICommonFunction.responseBody(baseURI, requestBody, resource);
	 System.out.println("response of post"+responseBody);
	 
	 JsonPath jspreq=new JsonPath(requestBody);
	 String req_name=jspreq.getString("name");
	 String req_job=jspreq.getString("job");
	 
	 JsonPath jspres=new JsonPath(responseBody);
	 String res_name=jspres.getString("name");
	 String res_job=jspres.getString("job");
	 
	 Assert.assertEquals(statusCode, 201);
	 Assert.assertEquals(res_name, req_name);
	 Assert.assertEquals(res_job, req_job);
 }
}
