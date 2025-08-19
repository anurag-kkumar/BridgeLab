package CoreJava.Java_OOP;

public class Student {
    int marks;
    String name;
    Student(int marks,String name){
        this.marks=marks;
        this.name=name;
    }

    public static void main(String[] args) {
        Student student1=new Student(200,"Anurag kumar");
        System.out.println(student1.marks);
        System.out.println(student1.name);
        Student student2=new Student(100,"Aryan kumar");
        System.out.println(student2.marks);
        System.out.println(student2.name);
    }
}
