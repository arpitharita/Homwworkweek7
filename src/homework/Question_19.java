package homework;
/*Write a Java program to calculate the average value of array elements.*/

public class Question_19 {

    public static void main(String[] args) {

     int[] t1 = new int[]{25,10,30,45,50,65,45,80};
     int sum = 0;
     for (int i = 0; i< t1.length;i++);
        int i = 0;
        sum += t1[i];

        double average = sum/t1.length;
        System.out.println("Average value of arry is :" + average);


    }
}
