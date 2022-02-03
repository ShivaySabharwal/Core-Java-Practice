package Advanced2;

import java.io.FileWriter;
import java.io.IOException;

class MyDeprecated{
    @Deprecated
    void meth1(){
        System.out.println("Hello Java");
    }
}

interface MyInt{
    void display();
}

public class PracticeSet {
    public static void main(String[] args) {
        @SuppressWarnings("Deprecation")
        MyDeprecated a = new MyDeprecated();
        a.meth1();

        MyInt obj = new MyInt() {
            @Override
            public void display() {
                System.out.println("I am in Display Method.");
            }
        };

        String table = "";
        for(int i = 0; i <= 10; i++){
            for (int j = 0; j < 10; j++) {
                table += i + " X "+(j+1) + " = " + i*(j+1);
                table += "\n";
            }
            try {
                FileWriter fileWriter = new FileWriter("MultiplicationTable.txt");
                fileWriter.write(table);
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
