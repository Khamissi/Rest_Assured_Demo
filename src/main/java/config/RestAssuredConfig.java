package config;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

public class RestAssuredConfig
{
    static
    {
        // Set static variables for base URI and path
        RestAssured.baseURI = "https://reqres.in";
        RestAssured.basePath = "/api/users";
        // Logs the full request and response details to the console
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
        // Bypasses SSL certificate validation
        RestAssured.useRelaxedHTTPSValidation();
        // Sets the API key for the request in the header
        RestAssured.requestSpecification = RestAssured
                .given()
                .header("x-api-key", "reqres-free-v1");
    }
}
