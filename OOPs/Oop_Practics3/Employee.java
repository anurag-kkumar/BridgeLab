package CoreJava.Oop_Practics3;

public class Employee {
    static String companyName="Google";
    static int numEmpy;
    final int id;
    String name;

    Employee(String name ,int id){
        this.name=name;
        this.id=id  ;
        numEmpy++;
    }
void disply(){
    System.out.println(companyName);
    System.out.println(numEmpy);
    System.out.println(id);


}
    public static void main(String[] args) {
        System.out.println("intial = "+numEmpy);
        Employee empy1=new Employee("anurag",1);
        empy1.disply();
        System.out.println("final "+numEmpy);
    }
}
