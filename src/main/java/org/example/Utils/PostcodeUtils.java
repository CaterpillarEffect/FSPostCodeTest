package org.example.Utils;

import com.sun.xml.bind.v2.runtime.output.SAXOutput;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.example.GetResponse;
import org.example.Pojos.NearestPostcodes;
import org.example.Pojos.Result;
import org.example.Pojos.getRegionCountryPostcodePcodepojo;
import org.example.Pojos.pcodepojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PostcodeUtils {

    GetResponse answer = new GetResponse();
    Response response;
    String postcode;

    public PostcodeUtils(String Postcode) {
        this.postcode = Postcode;
    }

    ;


    public void checkPostCodeParameter() {
        int statusCode = response.path("status");
        String errorMessage = response.path("error");
        String actualPostCode = response.path("result.postcode");
        actualPostCode = actualPostCode.replaceAll("\\s", "");
        if (statusCode == 200) {
            assertEquals(postcode, actualPostCode);
        } else if (statusCode == 404 && errorMessage.equals("Invalid postcode")) {
            System.out.println(errorMessage);
        }
    }


        public boolean getPostCodeValidation() {
            boolean validPostcode = false;


            try {


                validPostcode = answer.validatePostCode(postcode).path("result");

                //assertTrue(validPostcode);
                if (!validPostcode) {
                    String errorMessage = answer.getPostcode(postcode).path("error");
                    System.out.println("ErrorMessage = " + errorMessage);
                    System.out.println(postcode + " : Is Invalid Postcode");

                }
            } catch (Exception e) {
                String errorMessage = answer.validatePostCode(postcode).path("error");
                System.out.println("ErrorMessage = " + errorMessage);
                System.out.println(postcode + " : Is Invalid Postcode");
            }
            return validPostcode;
        }


        public void getPostcode(){

        pcodepojo v =checkPostcode();
        printPostcodeRegioncountry(getPostcodeRegionandCountry(v));





        }



        public pcodepojo checkPostcode () {
        if(getPostCodeValidation()){
             Response response = answer.getPostcode(postcode);
            assertEquals(response.statusCode(), 200);
            pcodepojo pcjo = response.getBody().as(pcodepojo.class);


            return pcjo;}

        return null;

        }
        public List <String> getPostcodeRegionandCountry(pcodepojo pcjo){
        getRegionCountryPostcodePcodepojo getRCP = new getRegionCountryPostcodePcodepojo();
        List<String>Postcodedetails = new ArrayList<>() ;

        String Actualpostcode = getRCP.getPostcode(pcjo);
        String Actualregion = getRCP.getRegion(pcjo);
        String ActualCountry = getRCP.getCountry(pcjo);
        Postcodedetails.add(Actualpostcode);
        Postcodedetails.add(Actualregion);
        Postcodedetails.add(ActualCountry);

            return Postcodedetails;


        }


        public List<Result> nearestPostcodes ( int radius){
            response = answer.getnearestPostcode(postcode, radius);
            assertEquals(response.statusCode(), 200);
            NearestPostcodes near = response.getBody().as(NearestPostcodes.class);
            List<Result> items = near.getResult();
            System.out.println();
            if (items.size() > 0) {
                System.out.println("List of Nearest Postcodes: ");
                System.out.println();

                items.remove(0);
                for (Result item : items) {
                    System.out.println(item.toString());
                }
            }

            return items;




        }

        public void printPostcodeRegioncountry(List<String> list){
            System.out.println("Postcode: "+list.get(0));
            System.out.println("Region: "+list.get(1));
            System.out.println("Country: "+list.get(2));
        }


    public String getPostCode(String postCode) {
        // this.postCodeParameter = postCode.toUpperCase().trim();
        response = given().accept(ContentType.JSON)
                .baseUri(Utils.getBaseURI())
                .pathParam("postcodes", postCode)
                .when().get("/postcodes/{postcodes}/");
        if (response.statusCode() == 200) {
            checkPostCodeParameter();

            String s=          response.path("result.postcode");
            return s.replaceAll("\\s","");

        } else {
            String errorMessage = response.path("error");
            System.out.println(postCode + " is " + errorMessage);
            return errorMessage;
        }
    }


    }







