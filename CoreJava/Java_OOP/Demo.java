package CoreJava.Java_OOP;

public class Demo {
    int localvar;
    Demo(int instanceVar){
        this.localvar=instanceVar;
    }
    void display()
    {
        System.out.println(localvar);
    }
    public static void main(String[] args) {
        Demo1 dmo=new Demo1(1);
//        System.out.println(dmo.localvar);
        dmo.display();
    }
}
