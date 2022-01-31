package Begin;

public class Array1 {
    public static void main(String[] args) {
        int [] marks = new int[5]; //Declaration + Memory Allocation
        marks[0] = 100;
        marks[1] = 40;
        marks[2] = 80;
        marks[3] = 60;
        marks[4] = 10;
        System.out.println(marks[4]);

        int [] Vals = {1,2,3,3,5}; //Declaration + Initialization
        for(int i=0; i<Vals.length; i++){
            System.out.println(Vals[i]);
        }

        float [] marks1 = {23.5f, 45.5f, 78.6f};
        String [] names = {"Shivay", "Pranav", "Satvik"};
        System.out.println(names[1]);

        for(int j= names.length - 1; j>=0; j--){
            System.out.println(names[j]);
        }

        for(int element: marks){
            System.out.println(element);
        }
    }
}
