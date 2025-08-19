package CoreJava.Java_OOP;

public class Laptop {
    int price;
    String brand;
    static int osVersion;
    void versionEdition(int osVersion){
        Laptop.osVersion=osVersion;
        System.out.println(Laptop.osVersion);
    }
    Laptop(int price,String brand){
        this.price=price;
        this.brand=brand;
    }

    public static void main(String[] args) {
        Laptop laptop1=new Laptop(20000,"HP");
        laptop1.versionEdition(12);
        System.out.println(Laptop.osVersion);
        Laptop laptop2=new Laptop(20000,"HP");
        laptop2.versionEdition(13);

    }
}
