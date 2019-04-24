package datastructures;

public class Bubblesclass {
    public static void main(String[] args) {
        int array[]={23,12,4,7,-1};

        int temp;
         for (int i=0;i<array.length-1;i++) {
             for (int j = 0; j < array.length - 1; j++) {
                 if (array[j]>array[j+1]){
                 temp=array[j+1];
                 array[j+1]= array[j];
                 array[j]=temp;

                 }
             }
         }
        for (int A:array){
            System.out.println(A);}







    }










}
