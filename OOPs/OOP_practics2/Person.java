package CoreJava.OOP_practics2;

public class Person {

    private String name;
    private int age;


    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

        public static void main(String[] args) {

            Person person1 = new Person("Anu", 30);
            System.out.println("Original person:");


            System.out.println(person1.age+" "+person1.name);


            Person person2 = new Person(person1);
            System.out.println("Copied person:");
            System.out.println(person2.age+" "+person2.name);

        }



    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }




}
