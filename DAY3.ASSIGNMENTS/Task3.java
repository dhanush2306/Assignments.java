import java.security.Permissions;

public class Task3 {
    static String Gym = "muscle uncaged";
   int id;
String Name ;
void display(){
    System.out.println(id+""+Name+""+Gym);
}
public static void main(String[] args) {
  Task3 h1 = new Task3();
h1.id=900;
h1.Name = "dhanush";
Task3 h2 = new Task3();
h2.id=901;
h2.Name="Raghul";
h1.display();
h2.display();
}
}