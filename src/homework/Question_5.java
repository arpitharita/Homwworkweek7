package homework;
//WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
//        salary
//        HRA = basic salary 10%
//        DA = Basic salary 8%
//        TA = Basic salary 9%
//        PF= Basic salary 20%
//        Gross salary = basic salary + HRA + TA + DA –PF

import java.util.Scanner;

public class Question_5 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("|------------------------------|");
        System.out.println("|    Salary slip               |");
        System.out.println("|------------------------------|");
        System.out.println("|Employee id     : joy         |");
        System.out.println("|Employee name   :5688         |");
        System.out.println("|------------------------------|");
        System.out.println("|Basic Salary  :               |");
        double sal = sc.nextDouble();
        double DA = 8 / 100.0 * sal;
        System.out.println("|  DA 8%  "               +DA    );
        double HRA = 10 / 100.0 * sal;
        System.out.println("|HRA 10%  "               +HRA   );
        double TA = 9 / 100.0 * sal;
        System.out.println("|TA   9%"                  +TA   );
        double PF = 20/100.0 * sal;
        System.out.println("|PF  20&"                  +PF   );
        double grosssalary = sal+HRA+TA+DA-PF;
        System.out.println("|------------------------------|");
        System.out.println("|Gross Salary = " + grosssalary  );
        System.out.println("|==============================|");
    }
}
