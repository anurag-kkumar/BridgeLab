package CoreJava.Java_OOP;

public class User3 {
    int roll;
    void func1(int roll){
        this.roll=roll;
        System.out.println(roll);
    }
    void func2(int roll){
        this.roll=roll;
        System.out.println(roll);
    } void func3(int roll){
        this.roll=roll;
        System.out.println(roll);
    }
User3(int roll){
        this.roll=roll;
}
    public static void main(String[] args) {
        User3 users=new User3(20);
        users.func1(30);
        users.func3(40);
        users.func3(50);
        System.out.println(users.roll);
    }
}
