package Begin;

public class Method1 {

    static int logic(int x, int y){
        int z;
        if(x > y){
            z = x + y;
        }
        else{
            z = (x + y) * 5;
        }
        return z;
    }

    int logic1(int g, int h){
        int i;
        if(g > h){
            i = g + h;
        }
        else{
            i = (g + h) * 5;
        }
        return i;
    }

    static void tellJoke(){
        System.out.println("I invented a new word! " + "Plagiarism\n");
    }

//    static void change(int a){
//        a = 98;
//    }

    void changearr(int [] arr){
        arr[1] = 98;
    }

    //Method Overloading
    static void foo(){
        System.out.println("Good morning Bro!!!");
    }

    static void foo(int a){
        System.out.println("Good morning " + a + " bro!!!");
    }

    public static void main(String[] args) {
        int a = 5, b = 7;
        int c = logic(a, b);
        System.out.println(c);

        Method1 obj1 = new Method1(); // Method invocation using object
        int d = obj1.logic1(a, b);
        System.out.println(d);

        tellJoke();

        int [] arr = {1,2,3,4,5};
//        int x = 45;
//        change(x);
//        System.out.println("The value of x after running change is: " + x);

        System.out.println("The values of arr before function invocation:- ");
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        Method1 obj2 = new Method1();
        System.out.println("The values of arr after function invocation:- ");
        obj2.changearr(arr);
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        //Method Overloading
        foo();
        foo(1000); //Arguments are actual!
        //Method Overloading can not be performed by simple changing the return type
        //and not changing the number of parameters.
    }
}
