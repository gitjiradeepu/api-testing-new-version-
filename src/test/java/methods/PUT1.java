package methods;



import org.json.simple.JSONObject;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PUT1 {
    public static void main(String[] args) {

        // Create JSON Body
        JSONObject json = new JSONObject();
        json.put("name", "AnjaliG");
        json.put("job", "QAQA");

        // Perform PUT request
        Response res = RestAssured.given()
                //.baseUri("https://reqres.in/api")
                .header("X-API-Key", "reqres-free-v1")
                .contentType(ContentType.JSON)
                .body(json.toJSONString())
                .when()
                .put("https://reqres.in/api/users/2");

        // Print response
        System.out.println("Status Code: " + res.getStatusCode());
        System.out.println("Response Body:");
        System.out.println(res.asString());
    }
}