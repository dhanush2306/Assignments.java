package DAY14ASSIGNMENT12;
import java.util.LinkedList;
public class Task2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();


        list.add(20);
        list.add(35);
        list.add(46);


    list.addFirst(10);

    list.addLast(68);

    System.out.println("Linkedlist elements are:");
    for(Integer num : list){
        System.out.println(num);
    }
    }
}
