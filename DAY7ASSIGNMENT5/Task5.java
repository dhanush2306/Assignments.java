package DAY7ASSIGNMENT5;
interface Printable {
    void print();
}


interface Scannable {
    void scan();
}


class MultiFunctionPrinter implements Printable, Scannable {

    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }
}


public class Task5{
    public static void main(String[] args) {

        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        mfp.print();
        mfp.scan();
    }
}