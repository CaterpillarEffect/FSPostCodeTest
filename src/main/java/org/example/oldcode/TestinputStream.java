package org.example;

import io.restassured.internal.util.IOUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class TestinputStream {

    String projectPath = System.getProperty("user.dir");
    String filePath = "src/main/resources";
}

  //  public InputStream getInputStream(String key){


       /* try ( in = new FileInputStream(key))
        {
            String contents = IOUtils.toString(in, StandardCharsets.UTF_8);
            System.out.println(contents);
        }
        catch (IOException e) {
            e.printStackTrace();
        }


        return in;
    }


    public String getFilepath(String key){

        String fullPath = projectPath+"/"+filePath+"/"+key;


        return fullPath;
    }
*/





