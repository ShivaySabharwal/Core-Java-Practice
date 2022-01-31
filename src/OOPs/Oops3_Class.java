package OOPs;

class MyEmployee{
    private int id;
    private String name;
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int p){
        id = p;
    }
    public int getId(){
        return id;
    }
}

public class Oops3_Class {
    public static void main(String[] args) {
        MyEmployee Guddu = new MyEmployee();
        Guddu.setName("Akriti Chodha");
        Guddu.setId(001);
        System.out.println("The name of the employee: " + Guddu.getName());
        System.out.println("The ID number of the above said Employee: " + Guddu.getId());
        System.out.println(Guddu.getClass());
    }
}
