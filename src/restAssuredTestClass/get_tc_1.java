package restAssuredTestClass;

import org.testng.Assert;

import io.restassured.path.json.JsonPath;
import restAssuredrepository.post_repository;
import restassuredCommonfunction.APICommonFunction;

public class get_tc_1 {
public static void excute1() {
	    String baseURI1= post_repository .req_baseURI();
	    String resource1=post_repository.resource1();
	   int statusCode1=APICommonFunction.statusCode1(baseURI1, resource1);
	   String responseBody1=APICommonFunction.responseBody1(baseURI1, resource1);
	   System.out.println("response of get :s"+responseBody1);
	    
	   int id [] = {7, 8, 9, 10, 11, 12};
	    String[] email = {"michael.lawson@reqres.in", "lindsay.ferguson@reqres.in", "tobias.funke@reqres.in", "byron.fields@reqres.in", "george.edwards@reqres.in", "rachel.howell@reqres.in"};
		
	    JsonPath jsp=new JsonPath(responseBody1);
	    
	    int count=jsp.getList("data").size();

        // Validate each object in the data array
	    for(int i=0;i<count; i++)
		 {
			 // expected result
			 
			 int exp_id = id[i];
		     String exp_email = email[i];
			 //String res_id=jspresponse.getString("data["+i+"].id");
			 //int  res_int_id=Integer.parseInt(res_id);
			 String res_email=jsp.getString("data["+i+"].email");
			 int res_id=jsp.getInt("data["+i+"].id");
			 
			 // validate
			 Assert.assertEquals(statusCode1, 200);
			 Assert.assertEquals(res_id, exp_id,"ID at index " + i);
	         Assert.assertEquals(res_email, exp_email,"email at index " + i);
		
		
		 }
}
}