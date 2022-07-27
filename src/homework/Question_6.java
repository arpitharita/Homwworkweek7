package homework;

//Write a java program that tells us that Input number is odd or even?
 //       HINT: use ternary operator (? :)


import java.util.Scanner;

public class Question_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        System.out.println("Enter a number");
        no=sc.nextInt();
        if ((no/2)*2==no){
            System.out.println("It is an even number");
        }else{
            System.out.println("It is an odd number");
        }
    }


}
