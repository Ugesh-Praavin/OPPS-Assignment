package Four;


class CarDemo {

 String model;
 String color;


 CarDemo(String model, String color) {
     this.model = model;
     this.color = color;
 }

 void start() {
     if (model == null || model.isEmpty()) {
         System.out.println("Car (" + color + ") started");
     } else {
         System.out.println(color + " " + model + " Car started");
     }
 }


 void stop() {
     if (model == null || model.isEmpty()) {
         System.out.println("Car (" + color + ") stopped");
     } else {
         System.out.println(color + " " + model + " Car stopped");
     }
 }
}

public class Car {
 public static void main(String[] args) {
 
     CarDemo car1 = new CarDemo("Tesla", "Red");
     car1.start(); 
     car1.stop();   

    
     CarDemo car2 = new CarDemo("BMW", "Black");
     car2.start();  
     car2.stop();  

    
     CarDemo car3 = new CarDemo("", "White");
     car3.start(); 
     car3.stop();   

   
   
 }
}

