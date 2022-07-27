package homework;

import java.util.Arrays;

//Write a Java program to sort a numeric array and a string array.
public class Question_17 {
    public static void main(String[] args) {
        Question_17 que = new Question_17();
        que.t1();

    }
    public void t1(){
        int[] m1 ={ 1252,5641,2314,1752,1359,1863};
        String[]m2 ={"Java","C++","Python","PHP","C#","C programming"};

        System.out.println("Original numeric array : "+ Arrays.toString(m1));
        Arrays.sort(m1);
        System.out.println("Sorted numeric array : "+Arrays.toString(m1));

        System.out.println("Original string array : "+Arrays.toString(m2));
        Arrays.sort(m2);
        System.out.println("Sorted string array : "+Arrays.toString(m2));
    }
}
