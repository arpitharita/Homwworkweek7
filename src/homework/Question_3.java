package homework;

//Write a java program to input student Name, roll No, and three subjects Math, Science and
//        English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
//        Input, Marks should between 0 to 100”) and find out total, percentage and result.
//        If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
//        %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("|------------------------------------|");
        System.out.println("|             Mark sheet             |");
        System.out.println("|------------------------------------|");
        System.out.println("|  Name        :                     |");
        String name = sc.next();
        System.out.println("|  Roll No :                         |");
        int rollno = sc.nextInt();
        System.out.println("|------------------------------------|");
        System.out.println("|   Subjects :                Marks  |");
        System.out.println("|------------------------------------|");
        System.out.println("|   Maths    :                       |");
        int math = sc.nextInt();
        System.out.println("|    Science :                       |");
        int sci =sc.nextInt();
        System.out.println("|    English :                       |");
        int  eng = sc.nextInt();



        int t = math + sci +eng;
    }

}
