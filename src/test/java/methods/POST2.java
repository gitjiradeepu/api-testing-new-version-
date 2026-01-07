package methods;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class POST2 {

	public static void main(String[] args) {
        JSONObject json = new JSONObject();
        json.put("name", "Anjali");
        json.put("job", "QA Tester");


       Response res = RestAssured.given()
           // .baseUri("https://reqres.in/api")
            .header("X-API-Key", "reqres-free-v1")
            .contentType(ContentType.JSON)
            .body(json.toJSONString())
            //.post("/users");   // directly call
            .post("https://reqres.in/api/users"); 

       System.out.println("Status Code: " + res.getStatusCode());
       System.out.println("Response Body:");
       System.out.println(res.asString());
   }
}