package org.example;

import org.example.Utils.PostcodeUtils;
import org.example.Utils.Utils;

public class Postcodechecks {

    public void searchPostCode(String postCode) {


        postCode = Utils.InputValidiation(postCode);
        PostcodeUtils pc = new PostcodeUtils(postCode);

        if( pc.getPostCodeValidation()) {

            pc.getPostcode();

            pc.nearestPostcodes( 500);
        }

    }


    public  void searchPostCode(String[] postCode1) {


        for (String s : postCode1) {

            String postCode = s;
            postCode = postCode.toUpperCase().trim();
            postCode = Utils.InputValidiation(postCode);
            PostcodeUtils pc = new PostcodeUtils(postCode);

            if( pc.getPostCodeValidation()) {

                pc.getPostcode();
                pc.nearestPostcodes( 500);
            }
        }

    }
}
