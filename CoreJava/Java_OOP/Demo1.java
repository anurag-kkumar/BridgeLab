package CoreJava.Java_OOP;

public class Demo1 {
    int localvar;
    final int fixed=0;
    Demo1(int instanceVar){
        this.localvar=instanceVar;
    }
    void display()
    {
        System.out.println(localvar);
    }
    public static void main(String[] args) {
        Demo1 dmo=new Demo1(1);

        dmo.display();
    }
}
