package Practice;

public class Vehicle {
  public  void run(){
        System.out.println("vehicle");
    }
}
 class Bike extends Vehicle {
    public  static  void main(String args[]){
        Bike bike=new Bike();
        bike.run();
    }
}
