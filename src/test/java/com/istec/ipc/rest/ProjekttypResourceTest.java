package com.istec.ipc.rest;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class ProjekttypResourceTest {

    @Test
    public void testFindAllProjekttyp() {
        // given().when().get("/projekttyp/create").then().statusCode(200).body(is("ok."));
        given().when().get("/projekttyp")
            .then()
                .statusCode(200);
    }

    @Test
    public void testFindProjekttyp2() {
        given().when().get("/projekttyp/2")
            .then()                
                .statusCode(200);
        given().when().get("/projekttyp/9")
            .then()                
                .statusCode(204);
    }

}
