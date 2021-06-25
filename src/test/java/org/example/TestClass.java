package org.example;

import org.example.Utils.PostcodeUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass {
    PostcodeUtils util;

    @ParameterizedTest
    @ValueSource(strings = {"s117ty", "IM4 4QN", "KT11 1JT", "KT5 9AN", "CB3 0FA"})
    public void checkingMultiplePostCodes(String postCodes) {
        postCodes = postCodes.toUpperCase().trim().replaceAll("\\s", "");

         util = new PostcodeUtils(postCodes);
        String actual = "";


        if (util.getPostCodeValidation()) {
            actual = util.getPostcodeRegionandCountry(util.checkPostcode()).get(0).replaceAll("\\s", "");
        }


        Assertions.assertEquals(postCodes, actual);

    }

    /**
     * This Method tests the "Not Found" Error Message of the checkPostCodeMethod.
     */
        @Test
        public void notfoundPostCode(){

            util = new PostcodeUtils("rh11lp");

            Assertions.assertEquals("Postcode not found", util.getPostCode("rh11lp"));
        }

    @ParameterizedTest
    @CsvSource({"CB3 0FA,England,East of England", "M1 1AF,England,North West", "GU16 7HF,England,South East"})
    public void printCountryAndRegionName(String postCode, String country, String region) {
        postCode = postCode.replaceAll("\\s", "");
         util = new PostcodeUtils(postCode);
        List<String> list = util.getPostcodeRegionandCountry(util.checkPostcode());

        assertEquals(country, list.get(2));
        assertEquals(region, list.get(1));

    }

    @ParameterizedTest
    @CsvFileSource(resources = "mockData.csv", numLinesToSkip = 1)
    public void getPostCodeTest(String postCode) {

        postCode = postCode.toUpperCase().trim().replaceAll("\\s", "");

        util = new PostcodeUtils(postCode);


        assertEquals(util.getPostCodeValidation(), true);


    }


}