package Java_OOP;

public class Car {
    String model;
    int year;
    Car(String model,int year){
        this.model=model;
        this.year=year;
    }

    public static void main(String[] args) {
        Car car=new Car("maruti",2021);
        System.out.println(car.model +" "+car.year);
        Car car1=new Car("audi",2000);
        System.out.println(car1.model +" "+car1.year);
    }
}

