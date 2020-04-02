package org.acme.datasource;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class ProjekttypResourceTest {

    @Test
    public void testDBEndpoint() {
        given().when().get("/projekttyp/create").then().statusCode(200).body(is("ok."));
        given().when().get("/projekttyp").then().statusCode(200);
    }

}
