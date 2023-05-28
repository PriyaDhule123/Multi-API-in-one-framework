package restAssuredTestClass;
import java.util.Map;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import io.restassured.path.json.JsonPath;
import restAssuredrepository.post_repository;
import restassuredCommonfunction.APICommonFunction;

public class get2_tc2 {
	public static void execute3() {
	  String baseURI2=post_repository.req_baseURI();
	  String resource2=post_repository.resource2();
	  int statusCode=APICommonFunction .statusCode2(baseURI2, resource2);
	  String responseBody=APICommonFunction .responseBody2(baseURI2, resource2);
	 
	  JsonPath jsp=new JsonPath(responseBody);
	  Map<Object, Object> tmp=jsp.getMap("data");
	  int count=jsp.getMap("data").size();
	 System.out.println("get response2"+responseBody);
	  int exp_id=(int)tmp.get("id");
	  String exp_name=(String)tmp.get("name");
      int exp_year=(int)tmp.get("year");
	  String exp_color=(String)tmp.get("color");
	  String exp_Panton_value=(String)tmp.get("pantone_value");
	  SoftAssert softassert = new SoftAssert();
	     Assert.assertEquals(statusCode, 200);
	     softassert.assertEquals(tmp.get("id"),84);
		 softassert.assertEquals(tmp.get("name"),"priya");
		 Assert.assertEquals(tmp.get("year"),exp_year);
		 Assert.assertEquals(tmp.get("color"), exp_color);
		 softassert.assertEquals(tmp.get("pantone_value"),exp_Panton_value);
	  
	  
//	  for(int i=0;i<count;i++)
//	  {
//		 int exp_id=id[i];
//		 String exp_name=name[i];
//		 String exp_color=color[i];
//		 int exp_year=year[i];
//		 int exp_Panton_value=Panton_value[i];
//		 
//		 String res_name=jsp.getString("data["+i+"].name");
//		 int res_id=jsp.getInt("data["+i+"].id");
//		 int res_year=jsp.getInt("data["+i+"].year");
//		 String res_color=jsp.getString("data["+i+"].color");
//		 int res_Panton_value=jsp.getInt("data["+i+"].Panton_value");
//      
//		 Assert.assertEquals(statusCode, 200);
//		 Assert.assertEquals(res_id, exp_id);
//		 Assert.assertEquals(res_name, exp_name);
//		 Assert.assertEquals(res_year,exp_year);
//		 Assert.assertEquals(res_color, exp_color);
//		 Assert.assertEquals(res_Panton_value,exp_Panton_value);
//		 
//	  } 	 
} 	
	  }


