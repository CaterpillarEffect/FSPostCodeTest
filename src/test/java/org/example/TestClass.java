package org.example;

import org.example.Pojos.pcodepojo;
import org.example.Utils.PostcodeUtils;
import org.junit.Assert;
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

    pcodepojo pc = new pcodepojo();

    @ParameterizedTest
    @ValueSource(strings = {"s117ty", "IM4 4QN", "KT11 1JT", "KT5 9AN", "CB3 0FA"})
    public void checkingMultiplePostCodes(String postCodes) {
        postCodes = postCodes.toUpperCase().trim().replaceAll("\\s", "");

         util = new PostcodeUtils(postCodes);
        String actual = "";


        if (util.getPostCodeValidation()) {
            pc=util.checkPostcode();
            actual = pc.getResult().getPostcode().replaceAll("\\s", "");
        }


        Assertions.assertEquals(postCodes, actual);

    }

    /**
     * This Method tests the "Not Found" Error Message of the checkPostCodeMethod.
     */
        @Test
        public void notfoundPostCode(){

            util = new PostcodeUtils("rh11lp");

            Assert.assertFalse("Postcode not found", util.getPostCodeValidation());
        }

    @ParameterizedTest
    @CsvSource({"CB3 0FA,England,East of England", "M1 1AF,England,North West", "GU16 7HF,England,South East"})
    public void printCountryAndRegionName(String postCode, String country, String region) {
        postCode = postCode.replaceAll("\\s", "").toUpperCase();
         util = new PostcodeUtils(postCode);

        pc = util.checkPostcode();


        assertEquals(country, pc.getResult().getCountry());
        assertEquals(region, pc.getResult().getRegion());
        assertEquals(postCode, pc.getResult().getPostcode().replaceAll("\\s", ""));

    }

    @ParameterizedTest
    @CsvFileSource(resources = "mockData.csv", numLinesToSkip = 1)
    public void getPostCodeTest(String postCode) {

        postCode = postCode.toUpperCase().trim().replaceAll("\\s", "");

        util = new PostcodeUtils(postCode);


        assertEquals(util.getPostCodeValidation(), true);


    }


}