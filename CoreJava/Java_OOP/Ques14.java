package CoreJava.Java_OOP;

public class Ques14 {
    String name;
    void setName(String name){
        this.name=name;
    }
Ques14(String name){
        this.name=name;
    System.out.println(name);
}
    public static void main(String[] args) {
        Ques14 quse=new Ques14("anurag");
        quse.setName("anura");

    }
}
