package com.istec.ipc.rest;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class KostenstelleResourceTest {

    @Test
    public void testFindAllKostenstelle() {
        given().when().get("/kst").then().statusCode(200);
    }

    // @Test
    // public void testFindKostenstelle2() {
    // given().when().get("/Kostenstelle/2")
    // .then()
    // .statusCode(200);
    // given().when().get("/Kostenstelle/9")
    // .then()
    // .statusCode(204);
    // }

}
