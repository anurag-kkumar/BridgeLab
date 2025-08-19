package CoreJava.Java_OOP;

public class User {
    int age;
    static String name;
    void gender(String gender){
        System.out.println(gender);

    }
User(int age){
        this.age=age;
}
    public static void main(String[] args) {
        User user1=new User(21);
        name="Anurag";

        System.out.println(user1.age +" " +name +" ");
        user1.gender("male");
    }
}
