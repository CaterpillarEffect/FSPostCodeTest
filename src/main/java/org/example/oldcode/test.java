package org.example;

import java.io.*;

public class test {

    public OutputStream ix() throws FileNotFoundException {
        FileOutputStream h = new FileOutputStream("h");
        return h;
    }

  /*  public OutputStream ix(String file) {
        if (x == 3) {

            file = "/scr/resources"+file;
            return new FileOutputStream(file);
        }
        S3Soutputstream s3Soutputstream = new S3Soutputstream;
       // return s3Soutputstream;
    }
*/
        public void st(){
            var iu =0;
        }

        public InputStream ixi(String file) throws FileNotFoundException {

       var i = new FileInputStream(String.valueOf(this.getClass().getClassLoader().getResource(file)));
        //var i = (true)?new FileInputStream(String.valueOf(this.getClass().getClassLoader().getResource(file))): new InputStream() {
           // @Override
          //  public int read() throws IOException {
           //     return 0;
          //  }


        //};
        return i;
        }
        public static void main(String[] args){
            test test = new test();
            test.try1();
        }
public void try1(){
   // public static void fileOutputStreamByteSequence(String file, String data) throws IOException {
       // byte[] bytes = data.getBytes();
        test test = new test();
        try (InputStream out =test.ixi("ja/hi.txt")) {
            String url = String.valueOf(this.getClass().getClassLoader().getResource("ja/hi.txt"));
            System.out.println("Value = " + url);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
           e.printStackTrace();
        }
}

}
