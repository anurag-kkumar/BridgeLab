package CoreJava.Oop_Practics3;

public class Shooping {
    static double discont;
    private static double update=0;
    String ProductName;
    int price;
    int quantity;
    final int productid;
    Shooping(String productName,int price,int productid,int quantity){
        this.productid=productid;
        this.price=price;
        this.ProductName=ProductName;
        this.quantity=quantity;

    }
    int setDiscont(){
        discont=20;
        price=price+(int)((price*discont)/100);
        return (int)Math.ceil(price);
    }
void display(){
    System.out.println(price);
    System.out.println(ProductName);
    System.out.println(productid);
    System.out.println(quantity+" Liter");
}
    public static void main(String[] args) {
        Shooping p1=new Shooping("hair oil",100,2,1);
p1.display();
        p1.setDiscont();
        p1.display();
    }
}
