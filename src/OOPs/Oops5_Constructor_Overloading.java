package OOPs;

class MyEmployee2 {
    private int id;
    private String name;

    // CONSTRUCTORS WITH OVERLOADING
    public MyEmployee2(){
        id = 23;
        name = "Your-Name-Here";
    }

    public MyEmployee2(String Name1, int myId){
        id = myId;
        name = Name1;
    }

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
// USE OF CONSTRUCTORS
public class Oops5_Constructor_Overloading {
    public static void main(String[] args) {
        MyEmployee2 shivu = new MyEmployee2("Shivay Sabharwal", 001);
//        shivu.setName("Shivay");
//        shivu.setId(01);
        System.out.println(shivu.getName());
        System.out.println(shivu.getId());
    }
}
