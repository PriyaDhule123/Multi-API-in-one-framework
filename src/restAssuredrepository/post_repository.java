package restAssuredrepository;

public class post_repository {
	public static String req_baseURI()
	{
		String baseURI="https://reqres.in/";
		return baseURI;
	}
	public static String requestBody() {
		String requestBody="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		return requestBody;
	}
	public static String resource() {
		String resource="/api/users";
		return resource;
	}
	public static String resource1() {
		String resource1="/api/users?page=2";
		return resource1;
	}
    public static String resource2() {
    	String resource2="api/unknown/2";
    	return resource2;
    }
}
