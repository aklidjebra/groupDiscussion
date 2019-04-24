package datastructures;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Bufferreader {
    public static void main(String[] args) {
        String st= "";

        FileReader file=null;
        BufferedReader bfile=null;
        try {
             file =new FileReader("/Users/user/Documents/GroupDiscussion/src/datastructures/reder.txt");
             bfile=new BufferedReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
        try {
            while ((st=bfile.readLine())!=null){
                System.out.println(st);

        }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(file!=null){
                file=null;
            }if (bfile!=null)
            {bfile=null;}




        }
    }



}
