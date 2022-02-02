package Advanced2;

import java.util.ArrayList;

class MyGeneric<T1, T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public MyGeneric(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2= t2;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}

public class Generics {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(23);
        arrayList.add(189);
//      ArrayList<int> arrayList = new ArrayList(); -- this will produce an error
        //Object j = arrayList.get(2);
        int j = arrayList.get(2);
        System.out.println(j);

        MyGeneric<Integer, String> g1 = new MyGeneric(11,12,"String is MyString");
        System.out.println(g1.getT1());
        System.out.println(g1.getT2());
    }
}
