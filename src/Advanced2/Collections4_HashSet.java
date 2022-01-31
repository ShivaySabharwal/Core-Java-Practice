package Advanced2;

import java.util.HashSet;

public class Collections4_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11); // This element will be ignored

        System.out.println(myHashSet);

        System.out.println("myHashSet before removing any element : " + myHashSet);
        myHashSet.remove(3); //deletes 3 from the hashset
        System.out.println("myHashSet after removing a element : " + myHashSet);

        HashSet<Integer> myHashSet1 = new HashSet<>();

        System.out.println(myHashSet.isEmpty());
        System.out.println(myHashSet1.isEmpty());

        System.out.println("myHashSet before : " + myHashSet);
        myHashSet.clear(); //deletes all the elements from the hashset
        System.out.println("myHashSet after  : " + myHashSet);

        System.out.println("The size of myHashSet is : " + myHashSet.size());

    }
}
