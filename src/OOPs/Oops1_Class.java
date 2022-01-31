package OOPs;

class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("My ID is: " + id);
        System.out.println("an my name is: " + name);
    }
}

public class Oops1_Class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee shivay = new Employee();
        Employee pranav = new Employee();

        shivay.id = 12;
        shivay.name = "Shivay Sabharwal";
        pranav.id = 13;
        pranav.name = "Pranav Thaman";

        shivay.printDetails();
        pranav.printDetails();
    }
}
