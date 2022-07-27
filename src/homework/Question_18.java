package homework;

//Write a Java program to sum values of an array.

public class Question_18 {

    static int[] p1 = {25, 20, 30, 45, 36, 15, 55};

    static int p2() {
        int p2 = 0;
        int i;

        for (i = 0; i < p1.length; i++) p2 += p1[i];
        return p2;
    }

    public static void main(String[] args) {
        System.out.println("Sum value of array is :" +p2());
    }



}
