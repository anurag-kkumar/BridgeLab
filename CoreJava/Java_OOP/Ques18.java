package CoreJava.Java_OOP;

public class Ques18 {
    int number = 10; // instance variable

    public void display() {
        int number = 20; // local variable shadows instance variable

        System.out.println("Local var " + number);         // Outputs 20
        System.out.println("Instance var " + this.number); // Outputs 10
    }

    public static void main(String[] args) {
        Ques18 obj = new Ques18();
        obj.display();
    }
}
