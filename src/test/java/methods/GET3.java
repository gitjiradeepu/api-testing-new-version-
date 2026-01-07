package methods;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GET3 {


    public static void main(String[] args) {

        // Perform GET request
        Response res = RestAssured.given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://reqres.in/api/users?page=2");

        // Print response
        System.out.println("Status Code: " + res.getStatusCode());
        System.out.println("Response Body:");
        System.out.println(res.asString());
    }
}
