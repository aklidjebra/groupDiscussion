package datastructures;

public class SelctionSort {
    public static void main(String[] args) {

        int array2[] = {23, 15, 12, 7, 8, 1};
        for (int i = 0; i < array2.length - 1; i++) {
            int MI = i;
            for (int j = i + 1; j < array2.length; j++) {
                if (array2[j] < array2[MI]) {
                    MI = j;
                }
            }
            int temp = array2[MI];
            array2[MI] = array2[i];
            array2[i] = temp;
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
