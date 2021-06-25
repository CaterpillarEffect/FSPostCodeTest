package org.example;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.example.Utils.Utils;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertTrue;

public class GetResponse {

    Response response;
    String baseURI = Utils.getBaseURI();

    /**
     *  Returns nearest Postcode response ,
     *  @param postCode
     *  @param radius
      */


    public  Response getnearestPostcode(String postCode, int radius){
        return response = given().accept(ContentType.JSON)
                .baseUri(baseURI)
                .pathParam("postcodes", postCode)
                .queryParam("radius",radius)
                .when().get("/postcodes/{postcodes}/nearest");


    }

    /**
     * gets the Postcode as Response
     * @param postCode
     * @return response
     */

    public Response getPostcode(String postCode){
        return response = given().accept(ContentType.JSON)
                .baseUri(baseURI)
                .pathParam("postcodes", postCode)
                .when().get("/postcodes/{postcodes}/");
    }

    /**
     * validates the postcode
     * @param postCode
     * @return
     */

    public Response validatePostCode(String postCode){
        response = given().accept(ContentType.JSON)
                .baseUri(baseURI)
                .pathParam("postcodes", postCode)
                .when().get("/postcodes/{postcodes}/validate");




        return response;
}


}
