package groupdiscution;
import  java.util.Arrays;
import java.util.Scanner;

public class arraychar {
    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);
        System.out.println("please entre 1st word");
        String a= sc.nextLine() ;
        System.out.println("please entre 2st word");
        String b= sc.nextLine();
        char [] arrayofcharA= a.toCharArray();
        char[] arrayofcharB= b.toCharArray();

        Arrays.sort(arrayofcharA);
        Arrays.sort(arrayofcharB);
if (Arrays.equals(arrayofcharA,arrayofcharB)){
    System.out.println("the words are anangram");
}else {
    System.out.println("the words are not anangram");
}

    }





}
