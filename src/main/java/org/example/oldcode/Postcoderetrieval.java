package org.example;

import org.example.Pojos.pcodepojo;

public class Postcoderetrieval {

  //  System.out.println(response.prettyPrint());

      //  System.out.println("response = " + //response);

    // PostcodePojo postcodePojo2[] =response.jsonPath().getObject("result",PostcodePojo[].class );

    //  PostcodePojo postcodePojo= response.getBody().as(PostcodePojo.class);
    pcodepojo pcjo = new GetResponse().getPostcode("RH1 1Le").getBody().as(pcodepojo.class);






}
