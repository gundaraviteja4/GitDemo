package javaexample;

import java.io.*;
class ThrowsExample{
    public static void main(String[] args) throws IOException{   //throws is used instead of try & catch, to handle 1 or multiple exceptions
      FileWriter file = new FileWriter("c:\\Data1.txt");
      file.write("Guru99");
      System.out.println("done");
      file.close();
    }
}