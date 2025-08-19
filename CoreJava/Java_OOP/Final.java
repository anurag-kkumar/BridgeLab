package CoreJava.Java_OOP;

public class Final {
    final double PI =3.14;

    public static void main(String[] args) {
        Final finals =new Final();
        finals.PI=20; // you can not change val of final
        System.out.println(finals.PI);
    }
}
