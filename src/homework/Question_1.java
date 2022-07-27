package homework;

//Write a java program to input any year like (ex.2007) and find out if it is leap year or not ?

import java.util.Scanner;

public class Question_1 {

    public static void main(String[] args) {
       int no;
       String h1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        no = sc.nextInt();

        h1 = (no % 2 == 0) ? "IT is an even number": "It is an odd number";

        System.out.println(h1);

    }
}
