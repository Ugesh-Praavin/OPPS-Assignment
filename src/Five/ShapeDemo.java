package Five;


class Shape {

	 double area() {
	     System.out.println("Default area");
	     return 0;
	 }
}

class Circle extends Shape {
	 double radius;
	
	 Circle(double radius) {
	     this.radius = radius;
	 }
	
	 
	 double area() {
	     double result = Math.PI * radius * radius;
	     System.out.println("Area of Circle: " + result);
	     return result;
	 }
}

class Rectangle extends Shape {
	 double length, width;
	
	 Rectangle(double length, double width) {
	     this.length = length;
	     this.width = width;
	 }
	
	 
	 double area() {
	     double result = length * width;
	     System.out.println("Area of Rectangle: " + result);
	     return result;
	 }
}

public class ShapeDemo {
 public static void main(String[] args) {
     
     Shape s1 = new Circle(5);
     s1.area();   

     Shape s2 = new Rectangle(10, 5);
     s2.area();   

     Shape s3 = new Shape();
     s3.area();  
 }
}
