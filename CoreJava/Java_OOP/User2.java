package CoreJava.Java_OOP;

public class User2 {
    int localvar;
    final int fixe=0;
    User2(int instanceVar,int fixe){
        this.localvar=instanceVar;
        this.fixe=fixe;
        //error : final valur cannot change
//        java: cannot find symbol
//        symbol:   class fixe
//  location: class CoreJava.Java_OOP.User2
    }
    void display()
    {
        System.out.println(fixe);
        System.out.println(localvar);
    }
    public static void main(String[] args) {
        User2 dmo=new User2(1,22);

        dmo.display();
    }
}
