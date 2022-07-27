package homework;

import java.util.Scanner;

//Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
//        any other alphabet should be invalid entry
public class Question_8 {

    public static void main(String[] args) {
        Question_8 que = new Question_8();
         que.t1();
    }
    public void t1(){
       Scanner sc = new Scanner(System.in);
        System.out.println("input any alphabet = ");
        char c = sc.next().charAt(0);

        if (c=='A' || c=='a'){
            System.out.println("Ahmedabad,Amsterdam,Asansol,Akola,Agra");
        } else if
        (c=='B' || c=='b') {
            System.out.println("Bhopal,Bengaluru,Bhubaneshwar,Bareilly,Bhiwandi");

        } else if
        (c=='C' || c=='c') {
            System.out.println("Chennai,Coimbatore,Chandigarh,Cochin,Cuttack");

        } else if (c == 'D' || c=='d') {
            System.out.println("Delhi,Dhanbad,Dombivli,Durgapur,Dehradun");

        } else if
        (c=='E' || c=='e') {
            System.out.println("Etawah,Ellore,Edgewater,Encanto,Elyria");

        } else if
        (c=='F' || c=='f') {
            System.out.println("Florida,France,Fatehpur,Faridabad,Fort Collins");

        }else
            System.out.println("Invalid entry");
    }
}