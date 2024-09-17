package DefaultConstructor;

public class Bike {
    int price;
        String name;
        Bike(){
            System.out.println("Crating Byke");
        }
        public static void main(String[] args){
            Bike bike = new Bike();
            System.out.println(bike.price);
            System.out.println(bike.name);
        }
  }
