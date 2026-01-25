package DAY14ASSIGNMENT12;
import java.util.Set;
import java.util.HashSet;
public class Task3 {
    public static void main(String[] args) {
        Set<Integer> EmployeesId = new HashSet<>();


        EmployeesId.add(2002);
        EmployeesId.add(3990);
        EmployeesId.add(2002);
        EmployeesId.add(4009);
        EmployeesId.add(3888);
        EmployeesId.add(2337);
        EmployeesId.add(6677);
        EmployeesId.add(2333);

        System.out.println("Employee ID (Duplicates not allowed):");
        for(Integer ID : EmployeesId){
            System.out.println(ID);
        }
        
    }
}
