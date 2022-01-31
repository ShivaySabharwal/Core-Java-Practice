package OOPs;

//Practice Set
class Circle11{
    float radi1 = 0.0f;

    public Circle11(){
        System.out.println("I am in Circle11's NoArgs Constructor.");
    }
    public Circle11(float a){
        radi1 = a;
        System.out.println("I am in Circle11's Constructor.");
    }
    public float getRadius1() {
        return radi1;
    }
    public void areaCircle1(){
        System.out.println("The area of the Circle is: " + (Math.PI*this.radi1*this.radi1));
    }
}

class Cylinder11 extends Circle11{
    float height1 = 0.0f;

    public Cylinder11(float a, float b){
        super(a);
        this.height1 = b;
        System.out.println("I am in Cylinder11's Constructor.");
    }
    public float getHeight1() {
        return height1;
    }
    public void areaCylinder1(){
        System.out.println("The area of the Cylinder is: " + (Math.PI*this.radi1*this.radi1*this.height1));
    }
}


public class Oops_Problem5 {
    public static void main(String[] args) {
        Circle11 cir = new Circle11(14.7f);
        Cylinder11 cyl = new Cylinder11(0.9f, 3.6f);
        cir.areaCircle1();
        cyl.areaCircle1();
    }
}
