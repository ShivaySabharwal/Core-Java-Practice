package OOPs;

class Base{
    private int x = 0;
    public void setX(int x) {
        System.out.println("I am in Base Class and setting X Variable.");
        this.x = x;
    }
    public int getX() {
        return x;
    }

    public void printMe(){
        System.out.println("I am a Constructor");
    }
}
class Derived extends Base{
    private int y = 0;
    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }
}

public class Oops6_Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(33);
        System.out.println(b.getX());

        Derived d = new Derived();
        d.setX(33);
        System.out.println(d.getX());

    }
}
