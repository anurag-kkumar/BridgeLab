package CoreJava.Java_OOP;

public class Demo1 {
    int localvar;
    final int fixed=0;
    Demo1(int instanceVar,int fixed){
        this.localvar=instanceVar;
        this.fixed=fixed;
        // complie error :cannot assign a value to final variable fixed
    }
    void display()
    {
        System.out.println(fixed);
        System.out.println(localvar);
    }
    public static void main(String[] args) {
        Demo1 dmo=new Demo1(1,30);

        dmo.display();
    }
}
