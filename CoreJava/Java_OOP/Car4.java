package CoreJava.Java_OOP;



public class Car4 {
    String model;
    int year;
    Car4(String model,int year){
        this.model=model;
        this.year=year;
    }

    public static void main(String[] args) {
        Car4 car=new Car4("maruti",2021);
        System.out.println(car.model +" "+car.year);
        Car4 car1=new Car4("audi",2000);
        System.out.println(car1.model +" "+car1.year);
        //  from above we can see car and car1 variable have their own copy
//        becuase class Car4 instance var acces by both var but their value differnt in differnt var
    }
}

