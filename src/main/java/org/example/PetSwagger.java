package org.example;

import io.restassured.RestAssured;

public class PetSwagger {
    public static void getByPetId(Integer id) {
        RestAssured.
                given().log().body()
                //.body(data)
                //.contentType("application/json")

                .when().get("petstore.swagger.io/v2/pet/" + id)

                .then()
                .extract()
                .response()
                .body()
                .prettyPrint();
    }

    public static void createPet(Integer id, String name) {
        String body = "{\n" +
                "  \"id\": " + id + ",\n" +
                // "  \"id\":\"152\",\n" +
                "  \"category\": {\n" +
                "  \"id\": 0,\n" +
                "  \"name\":\"dogs 2\"\n" +
                "  },\n" +
                "  \"name\": \"" + name + "\",\n" +
                //"  \"name\": \"Katana\",\n" +
                "  \"photoUrls\": [\n" +
                "  \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "  {\n" +
                "  \"id\": 0,\n" +
                "  \"name\":\"Stranno\"\n" +
                "  }\n" +
                "  ],\n" +
                "  \"status\":\"available\"\n" +
                "}";
        RestAssured.
                given().log().body()
                .body(body)
                .contentType("application/json")

                .when().post("https://petstore.swagger.io/v2/pet")

                .then()
                //.statusCode(200)
                .extract()
                .response()
                .body()
                .prettyPrint();
    }

    public static void updatePet(Integer id, String name) {
        String body = "{\n" +
                "  \"id\": " + id + ",\n" +
                // "  \"id\":\"152\",\n" +
                "  \"category\": {\n" +
                "  \"id\": 0,\n" +
                "  \"name\":\"dogs 2\"\n" +
                "  },\n" +
                "  \"name\": \"" + name + "\",\n" +
                //"  \"name\": \"Katana\",\n" +
                "  \"photoUrls\": [\n" +
                "  \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "  {\n" +
                "  \"id\": 0,\n" +
                "  \"name\":\"Stranno\"\n" +
                "  }\n" +
                "  ],\n" +
                "  \"status\":\"available\"\n" +
                "}";
        RestAssured.
                given().log().body()
                .body(body)
                .contentType("application/json")

                .when().put("https://petstore.swagger.io/v2/pet")

                .then()
                //.statusCode(200)
                .extract()
                .response()
                .body()
                .prettyPrint();
    }

    public static void deleteById(Integer id) {
        RestAssured.
                given().log().body()
                //.body(data)
                //.contentType("application/json")

                .when().delete("petstore.swagger.io/v2/pet/" + id)

                .then()
                .extract()
                .response()
                .body()
                .prettyPrint();
    }
}