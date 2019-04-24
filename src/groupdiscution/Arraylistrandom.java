package groupdiscution;

import java.util.ArrayList;
import java.util.Random;

public class Arraylistrandom {

    public static void main(String[] args) {

        Random ran =new Random();
        ArrayList <Integer> arraylist =new ArrayList<>();
        for (int i=0;i<15;i++){

            int Z= ran.nextInt(100);
           arraylist.add(Z) ;
        }
        System.out.println(arraylist);




    }
}
