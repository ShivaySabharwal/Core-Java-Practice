package Advanced2;

class MyDeprecated{
    @Deprecated
    void meth1(){
        System.out.println("Hello Java");
    }
}
public class PracticeSet {
    public static void main(String[] args) {
        @SuppressWarnings("Deprecation")
        MyDeprecated a = new MyDeprecated();
        a.meth1();
    }
}
