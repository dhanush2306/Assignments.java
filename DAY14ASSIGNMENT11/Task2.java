package DAY14ASSIGNMENT11;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(39);
        numbers.add(23);
        numbers.add(45);
        numbers.add(43);


System.out.println("using for loop");
        for( int i=1;i< numbers.size();i++){
            System.out.println(numbers.get(i));
            for(int num:numbers){
                System.out.println(num);
            }
        }
    }
}
