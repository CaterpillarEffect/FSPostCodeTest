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




        public boolean getPostCodeValidation() {
            boolean validPostcode = false;


            try {


                validPostcode = answer.validatePostCode(postcode).path("result");

                if (!validPostcode) {
                    String errorMessage = answer.getPostcode(postcode).path("error");

                    System.out.println(postcode + " : Is "+errorMessage);

                }


            } catch (Exception e) {
                String errorMessage = answer.getPostcode(postcode).path("error");

                System.out.println(postcode + " : is "+errorMessage);
            }
            return validPostcode;
        }


        public void getPostcode(){

        pcodepojo v =checkPostcode();
        System.out.println(v.toString());






        }



        public pcodepojo checkPostcode () {
        if(getPostCodeValidation()){
             Response response = answer.getPostcode(postcode);
            assertEquals(response.statusCode(), 200);
            pcodepojo pcjo = response.getBody().as(pcodepojo.class);


            return pcjo;}

        return null;

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





    }







