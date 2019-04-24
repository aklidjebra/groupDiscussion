package groupdiscution;

import java.util.Arrays;
import java.util.Scanner;

public class CharArrays {
    public void anangram(String a,String b) {
        char []arrayofcharA =a.toCharArray();
        char []arrayofcharB =b.toCharArray();
        Arrays.sort(arrayofcharA);
        Arrays.sort(arrayofcharB);
         if (Arrays.equals(arrayofcharA,arrayofcharA)){
             System.out.println("the words are anangram");
         }else{
             System.out.println("the words are not anangram");
         }


        }





    public static void main(String[] args) {

     CharArrays charArrays = new CharArrays();
        Scanner sc =new Scanner(System.in);
        System.out.println("please entre the first word");
        String a=sc.nextLine();
        System.out.println("please entre the second word");
        String b=sc.nextLine();
        charArrays.anangram( a,b);










    }


}
