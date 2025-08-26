package Assignment;
class Person {
  protected String name;
  protected int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

// Derived class
class Student extends Person {
  private String department;

  public Student(String name, int age, String department) {
    super(name, age);
    this.department = department;
  }

  public void displayDetails() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Department: " + department);
  }
}

// Main class
public class Main {
  public static void main(String[] args) {
    Student s1 = new Student("John", 20, "Computer Science");
    s1.displayDetails();
  }
}