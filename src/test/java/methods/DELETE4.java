package methods;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DELETE4 {
    public static void main(String[] args) {

        Response res = RestAssured.given()
                .contentType(ContentType.JSON)
                .header("X-API-Key", "reqres-free-v1")
                .when()
                .delete("https://reqres.in/api/users/2");

        System.out.println("Status Code: " + res.getStatusCode());
        System.out.println("Response Body: " + res.asString());
    }
}


