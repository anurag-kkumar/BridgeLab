package CoreJava.OOP_practics;

public class Circle {
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    public double area(){
        return radius*radius*3.14;
    }
    public double circum(){
        return radius*2*3.14;
    }

    public static void main(String[] args) {
        Circle circle=new Circle(2);
        System.out.println(circle.area());
        System.out.println(circle.circum());
    }
}
