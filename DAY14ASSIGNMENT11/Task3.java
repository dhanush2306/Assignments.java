package DAY14ASSIGNMENT11;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.add(20);
        numbers.add(30);
        numbers.add(45);
        numbers.add(54);
        int sum=0;
        for(int num:numbers){
            System.out.println("Sum of all elements:"+sum);
        }
    }
}
