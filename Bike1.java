package ParaConstructor;

public class Bike1 {
    int price;
    String name;
    Bike1(int price,String name){
        this.name= name;
        this.price= price;
    }
    public static void main(String[] args){
        Bike1 bike = new Bike1(400000, " X pulse");
        System.out.println("The name of byke is " + bike.name);
        System.out.println("It's price is " + bike.price);
    }
}
