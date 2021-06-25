package org.example.oldcode;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.example.Pojos.*;
import org.example.Utils.Utils;
import org.junit.Test;

import java.util.*;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

//public class Postcoderesponse {
//    @Test

//    public void checkpostcode(){
//
//
//        Response response
//         = given().accept(ContentType.JSON)
//                .baseUri("http://api.postcodes.io/")
//                .pathParam("postcodes", "rh1 1le")
//                .when().get("/postcodes/{postcodes}/");
//
//        assertEquals(response.statusCode(),200);
//        pcodepojo pcjo = response.getBody().as(pcodepojo.class);
//        System.out.println("Postcode: "+pcjo.getResult().getPostcode().toString());
//        System.out.println("Region: "+pcjo.getResult().getRegion().toString());
//        System.out.println("Country: "+pcjo.getResult().getCountry().toString());
//
//
//    }
//@Test
//    public void checknearestpostcodes(){
//
//
//       Response response = given().accept(ContentType.JSON)
//                .baseUri(Utils.getBaseURI())
//                .pathParam("postcodes", "Rh1 1Le")
//                .queryParam("radius",500)
//                .when().get("/postcodes/{postcodes}/nearest");
//        assertEquals(response.statusCode(),200);
//
//    }
//}
