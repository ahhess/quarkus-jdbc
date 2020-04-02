package org.acme.datasource;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/hello")
          .then()
             .statusCode(200)
             .body(is("Hallihallo!"));
    }

    // @Test
    // public void testDBEndpoint() {
    //     given()
    //       .when().get("/db/create")
    //       .then()
    //          .statusCode(200)
    //          .body(is("ok."));
    //     given()
    //       .when().get("/db/find")
    //       .then()
    //          .statusCode(200);
    // }

}