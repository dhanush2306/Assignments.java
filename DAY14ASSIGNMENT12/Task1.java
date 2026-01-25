package DAY14ASSIGNMENT12;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {
    Set<Integer> numbers = new HashSet<>();

numbers.add(20);
numbers.add(35);
numbers.add(40);
numbers.add(55);


Iterator<Integer> itr = numbers.iterator();

System.out.println("Elements in the Set:");
while (itr.hasNext()) {
    System.out.println(itr.next());
}
    }
}
