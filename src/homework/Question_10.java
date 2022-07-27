package homework;

import java.util.Scanner;

//10.Write a java program to input any two number and ask user to enter their symbol (+, -,
//        /, *) find addition, Subtraction, multiplication and division according to their symbol
//        (using if else)
public class Question_10 {

    public static void main(String[] args) {
        Question_10 que = new Question_10();
        que.p1();

    }

    public void p1() {
        Scanner sc = new Scanner(System.in);
        String con = "";
        do {
            System.out.print("Enter number :");
            int num = sc.nextInt();
            System.out.println("Enter number");
            int num1 = sc.nextInt();
            System.out.println("Choose Operator[1] Addition[2]Multiplication[3]Subtraction[4]Division");
            int ch = sc.nextInt();
            if (ch == 1) {

                System.out.println("Answer:" + (num + num1));
            } else if (ch == 2) {

                System.out.println("Answer:" + (num * num1));
            } else if (ch == 3) {

                System.out.println("Answer:" + (num - num1));
            } else if (ch == 4) {

                System.out.println("Answer:" + (num / num1));

            } else {
                System.out.println("Error Operator");
            }
            System.out.println("Do you want to continue? type y (Yes) type n(N0):");
            con = sc.next();
        } while ("y".equals(con) || "Y".equals(con));
        if ("n".equals(con) || "N".equals(con)){
            System.out.println("End Progrm!");
        }
    }
    {
        System.out.println("Error Input");
    }
    }



