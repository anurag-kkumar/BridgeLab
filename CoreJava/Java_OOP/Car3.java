package CoreJava.Java_OOP;
// 3. Create a method inside a class that declares a local variable. Try printing it outside the method. What happens?
public class Car3 {
    String model;
    int year;

    Car3(String model, int year){
        this.model=model;
        this.year=year;
    }
    public  void otherFeature(int prices){
//        prices=200000;
        System.out.println(prices);
    }

    public static void main(String[] args) {
        Car3 car= new Car3("maruti",2021);
        System.out.println(car.model +" "+car.year);
        car.otherFeature(200000);
        System.out.println(prices);

        //error  : cannot find local variable because by calling function you canot access local variable
//        java: cannot find symbol
//        symbol:   variable prices
//        location: class CoreJava.Java_OOP.Car3





    }
}

