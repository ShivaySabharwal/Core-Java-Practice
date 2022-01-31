package OOPs;

class Cylinder{
    private float cradi = 0.0f;
    private float cheig = 0.0f;

//    public void setCheig(float cheig) {
//        this.cheig = cheig;
//    }
    public float getCheig() {
        return cheig;
    }
    // USING CONSTRUCTOR
    public Cylinder(float cheig1, float cradi1){
        cheig = cheig1;
        cradi = cradi1;
    }
//    public void setCradi(float cradi) {
//        this.cradi = cradi;
//    }
    public float getCradi() {
        return cradi;
    }
    public float surfareacyl(){
        return ((2*3.14f*cradi*cheig)+(2*3.14f*cradi*cradi));
    }
    public float volcyl(){
        return (3.14f*cradi*cradi*cheig);
    }
}

public class Oops_Problem2 {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder(23.6f,12.7f);
//        cy.setCradi(23.6f);
//        cy.setCheig(12.7f);
        System.out.println("The Surface Area of the Given Cylinder is: " + cy.surfareacyl());
        System.out.println("The Volume of the Given Cylinder is: " + cy.volcyl());
    }
}
