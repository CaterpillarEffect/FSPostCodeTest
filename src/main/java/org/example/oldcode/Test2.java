package org.example;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test2 {
    private Object InputStream;

    public void testing(){
    ClassLoader classLoader = getClass().getClassLoader();
    InputStream inputStream = classLoader.getResourceAsStream("ja/hi.txt");
    }
    private String readFromInputStream(InputStream inputStream)
            throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br
                     = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        return resultStringBuilder.toString();
    }

    @Test
    public void givenFileNameAsAbsolutePath_whenUsingClasspath_thenFileData() throws IOException {
        String expectedData = "Hello, world!";

       // Class clazz = Test2.class;
       // ClassLoader classLoader = Test2.class.getClassLoader();
        boolean local = true;
        InputStream is  = getClass().getClassLoader().getResourceAsStream("ja/");
        String data = readFromInputStream(is);
        System.out.println(data);

       // Assert.assertThat(data, containsString(expectedData));
    }


}
