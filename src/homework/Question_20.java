package homework;
//Write a Java program to test if an array contains a specific value.

public class Question_20 {

    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] my_array1 = {10,20,30,40,50,60,20,80,};
        System.out.println(contains(my_array1, 5));
        System.out.println(contains(my_array1, 20));
    }


}
