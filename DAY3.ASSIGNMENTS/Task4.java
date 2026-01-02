 public class Task4{

    static int staticVar = 10;   // static variable
    int instanceVar = 20;        // instance variable

    void display() {
        int localVar = 30;       // local variable
        System.out.println("Local Variable = " + localVar);
        System.out.println("Instance Variable = " + instanceVar);
        System.out.println("Static Variable = " + staticVar);
    }

    public static void main(String[] args) {
      Task4 obj = new Task4();
        obj.display();
    }
}