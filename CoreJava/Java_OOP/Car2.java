package CoreJava.Java_OOP;

public class Car2 {
    String model;
    int year;
    static int numberOfcar;
    Car2(String model,int year){
        this.model=model;
        this.year=year;
    }

    public static void main(String[] args) {

        Car2 car= new Car2("maruti",2021);
        System.out.println(car.model +" "+car.year);
        Car2 car1=new Car2("audi",2000);
        System.out.println(car1.model +" "+car1.year);


        if(car !=null &&car1!=null ){
            numberOfcar=2;
        }
        System.out.println(numberOfcar);
    }
}

