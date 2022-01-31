package OOPs;

class squar1 {
    float side;

    public void SquareSideInit(float side1){
        side = side1;
    }

    public float SquareAreaCalc(){
        return (side*side);
    }

    public float SquarePeriCalc(){
        return (4*side);
    }
}

class rectangl1 {
    float side2, side3;

    public void RectSideInit(float k, float l){
        side2 = k;
        side3 = l;
    }

    public float RectAreaCalc(){
        return (side2*side3);
    }

    public float RectPeriCalc(){
        return 2*(side2+side3);
    }
}

class circl1 {
    float radius;

    public void CirSideInit(float o){
        radius = o;
    }

    public float CirAreaCalc(){
        return (float)(22.7*(radius*radius));
    }

    public float CirPeriCalc(){
        return (float)(22.7*(2*radius));
    }
}
public class Oops_Problem1 {
    public static void main(String[] args) {
        squar1 sq = new squar1();
        circl1 cr = new circl1();
        rectangl1 rt = new rectangl1();

        sq.SquareSideInit(34.3f);
        System.out.println("The Area of the required square is = " + sq.SquareAreaCalc());
        System.out.println("The Perimeter of the required square is = " + sq.SquarePeriCalc());

        cr.CirSideInit(21.9f);
        System.out.println("The Area of the required circle is = " + cr.CirAreaCalc());
        System.out.println("The Perimeter of the required circle is = " + cr.CirPeriCalc());

        rt.RectSideInit(32.7f, 33.3f);
        System.out.println("The Area of the required Rectangle is = " + rt.RectAreaCalc());
        System.out.println("The Perimeter of the required Rectangle is = " + rt.RectPeriCalc());
    }
}
