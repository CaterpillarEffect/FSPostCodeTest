package org.example;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.example.Utils.PostcodeUtils;
import org.example.Utils.Utils;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PostCode_old {
    Response response;
    String postCodeParameter;
   String BaseURl = Utils.getBaseURI();


    public static void main(String[] args){
        PostCode_old a = new PostCode_old();
       // a.checkPostCode(args[0]);
      //  PostcodeUtils utils = new PostcodeUtils();


       // a.checkPostCode(Utils.InputValidiation(args[0]));
        a.checkPostCode((args));




    }



    public String getPostCode(String postCode) {
       // this.postCodeParameter = postCode.toUpperCase().trim();
        response = given().accept(ContentType.JSON)
                .baseUri(BaseURl)
                .pathParam("postcodes", postCode)
                .when().get("/postcodes/{postcodes}/");
        if (response.statusCode() == 200) {
           checkPostCodeParameter();

          String s=          response.path("result.postcode");
          return s.replaceAll("\\s","");

        } else {
            String errorMessage = response.path("error");
            System.out.println(postCodeParameter + " is " + errorMessage);
            return errorMessage;
        }
    }

      public  void checkPostCodeParameter() {
        int statusCode = response.path("status");
        String errorMessage = response.path("error");
        String actualPostCode = response.path("result.postcode");
        actualPostCode = actualPostCode.replaceAll("\\s","");
        if (statusCode == 200) {
            assertEquals(postCodeParameter, actualPostCode);
        } else if (statusCode == 404 && errorMessage.equals("Invalid postcode")) {
            System.out.println(errorMessage);
        }

    }
    public  Map<String, String> obtainResultMap(){
        Map<String,String> resultMap;
        resultMap=response.path("result");
        return resultMap;
    }


    public  void  printCountryAndRegionName(Map resultMap) {

        if (response.statusCode() == 200) {
            String actualCountryName = (String) resultMap.get("country");
            String actualRegionName = (String) resultMap.get("region");
            String actualPostCode = (String) resultMap.get("postcode");
            System.out.println("PostCode: "+actualPostCode);
            System.out.println("Country: "+actualCountryName);
            System.out.println("Region: "+actualRegionName);
            System.out.println();
        }
            }

    public  boolean getPostCodeValidation() {
        boolean validPostcode = false;
        //this.BaseURl = getBaseuri();

        try {


           Response response = given().accept(ContentType.JSON)
                    .baseUri(BaseURl)
                    .pathParam("postcodes", postCodeParameter)
                    .when().get("/postcodes/{postcodes}/validate");
            validPostcode = response.path("result");
            assertTrue(validPostcode);
        } catch (Exception e) {
            String errorMessage = response.path("error");
            System.out.println("ErrorMessage = " + errorMessage);
            System.out.println(postCodeParameter + " : Is Invalid Postcode");
        }
        return validPostcode;
    }


    public  void getNearestPostCode(String postCode) {
        //this.postCodeParameter = postCode.toUpperCase().trim();
        response = given().accept(ContentType.JSON)
                .baseUri(BaseURl)
                .pathParam("postcodes", postCodeParameter)
                .queryParam("radius",500)
                .when().get("/postcodes/{postcodes}/nearest");
        Map<String, Object> regionMap = response.body().as(Map.class);

        List<Map<String, Object>> itemsList = (List<Map<String, Object>>) regionMap.get("result");
        if(itemsList.size()>0){System.out.println("List of Nearest Postcodes: ");}
        itemsList.remove(0);

        for (Map<String, Object> stringObjectMap : itemsList) {
            printCountryAndRegionName( stringObjectMap);

        }
        System.out.println();
    }


    public  void checkPostCode(String postCode) {
        // System.out.println("this is our actual postcode "+postCode);
         getPostCode(postCode);
      //  if (response.statusCode() == 200) {
          //  Map  resultMap =obtainResultMap();
        this.postCodeParameter= postCode.replaceAll("\\s","");
        //Map  resultMap =obtainResultMap();

            getPostCodeValidation();
        getNearestPostCode(postCode);
        Map  resultMap =obtainResultMap();
            printCountryAndRegionName(resultMap);
           // getNearestPostCode(postCode);

        //}
    }

    public  void checkPostCode(String[] postCode1) {
        for (String s : postCode1) {

            String postCode = s;
            this.postCodeParameter = postCode.toUpperCase().trim();
            getPostCode(postCode);
            if (response.statusCode() == 200) {
                Map resultMap = obtainResultMap();
                System.out.println("this is actual postcode");
                printCountryAndRegionName(resultMap);
                //getPostCodeValidation();
                getNearestPostCode(postCode);
            }

        }
    }


    }
