package homework;
//Same as above program-8 using switch statement.

import java.util.ArrayList;
import java.util.Scanner;

public class Question_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Character");
        char c = in.next().charAt(0);
        city(c);
        in.close();
    }
    public static void city(char c){

        ArrayList<String>city = new ArrayList<String>();

        city.add("Ahmedabad");
        city.add("bengluru");
        city.add("chandighar");
        city.add("Delhi");
        city.add("Elyria");
        city.add("Florida");

        switch (c){

            case 'a':
                System.out.println(city.get(0));
                break;
            case 'b':
                System.out.println(city.get(1));
                break;
            case 'c':
                System.out.println(city.get(2));
            case 'd':
                System.out.println(city.get(3));
                break;
            case 'e':
                System.out.println(city.get(4));
            case 'f':
                System.out.println(city.get(5));
            default:
                System.out.println("Invalid");
                break;
        }
    }


}
