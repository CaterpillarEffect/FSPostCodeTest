package org.example.oldcode;

//import org.example.PostCode;
//import org.example.Postcodechecks;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;
//import org.junit.jupiter.params.provider.ValueSource;
//
//import java.util.Map;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestPostCode {

//PostCode p = new org.example.PostCode();
//Postcodechecks check = new Postcodechecks();

//    @ParameterizedTest
//    @ValueSource(strings = {"s117ty", "IM4 4QN", "KT11 1JT", "KT5 9AN", "CB3 0FA"})
    public void checkingMultiplePostCodes(String postCodes) {
        //postCodes= postCodes.toUpperCase().trim().replaceAll("\\s","");
        // Assertions.assertEquals(postCodes, check.searchPostCode(postCodes));

    }

    /**
     * This Method tests the "Not Found" Error Message of the checkPostCodeMethod.
     */
      @Test
    public void notfoundPostCode() {

        //Assertions.assertEquals("Postcode not found", p.getPostCode("rh11le"));
    }

//    @ParameterizedTest
//    @CsvSource({"CB3 0FA,England,East of England","M1 1AF,England,North West","GU16 7HF,England,South East"})
////    public void printCountryAndRegionName(String postCode,String country, String region){
//        postCode =postCode.replaceAll("\\s","");
//       p.getPostCode(postCode);
//        Map resultMap =  p.obtainResultMap();
//        assertEquals(country, resultMap.get("country"));
//        assertEquals(region, resultMap.get("region"));
//
//    }



}
