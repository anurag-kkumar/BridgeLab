package CoreJava.OOP_practics;

public class Employee {
    String name;
    int id;
    int salary;
    Employee(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public static void main(String[] args) {
        Employee employee1=new Employee("Anurag",1,100000);
        System.out.println(employee1.id+ " "+ employee1.salary+" "+employee1.name);
    }
}
