package OOPs;

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        System.out.println("The NoArgs Constructor is Called!!!");
    }
    public MyMainEmployee(int k, String myName){
        id = k;
        name = myName;
    }
    public MyMainEmployee(String myName){
        id = 200;
        name = myName;
    }

    public String getName() { return name; }
    public int getID() { return id; }
//    public void setName(String n) { name = n; }
//    public void setID(int i) { id = i; }
}

//Constructors can take parameters without being overloaded.
//There can be more than two overloaded constructors.

public class Oops4_Constructor {
    public static void main(String[] args) {
        MyMainEmployee satvik = new MyMainEmployee(001, "Satvik Thaman");
        MyMainEmployee sampleName = new MyMainEmployee();
        MyMainEmployee hardik = new MyMainEmployee("Hardik Chodha");
//        satvik.setName("Satvik Thaman");
//        satvik.setID(001);
        System.out.println(satvik.getID());
        System.out.println(satvik.getName());
        System.out.println(hardik.getID());
        System.out.println(hardik.getName());
        System.out.println(sampleName.getName());
    }
}
