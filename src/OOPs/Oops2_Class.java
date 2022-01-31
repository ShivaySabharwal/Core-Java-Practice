package OOPs;

class Employee1{
    int salary = 0;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setname(String n){
        name = n;
    }
}

class CellPhone{
    public void ring(){
        System.out.println("Ringing......");
    }
    public void vibrating(){
        System.out.println("Vibrating......");
    }
    public void callFriend(){
        System.out.println("Calling Hardik Chodha......");
    }
}

class Square{
    int area(int s){
        return (s*s);
    }
    int perimeter(int s){
        return (4*s);
    }
}

public class Oops2_Class {
    public static void main(String[] args) {
        Employee1 Shivay = new Employee1();
        Shivay.setname("Shivay Sabharwal");
        Shivay.salary = 1000000;
        System.out.println("Employee 1 Name: " + Shivay.getName());
        System.out.println("Employee 1 Salary: " + Shivay.getSalary());

        Employee1 Pranav = new Employee1();
        Shivay.setname("Pranav Thaman");
        Pranav.salary = 1000000;
        System.out.println("Employee 2 Name: " + Pranav.getName());
        System.out.println("Employee 2 Salary: " + Pranav.getSalary());


        CellPhone apple = new CellPhone();
        apple.ring();
        apple.vibrating();
        apple.callFriend();


        Square sq7 = new Square();
        System.out.println("The area of the square is: " + sq7.area(5));
        System.out.println("The perimeter of the square is: " + sq7.perimeter(5));
    }
}
