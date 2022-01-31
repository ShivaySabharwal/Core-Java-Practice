package Advanced1;

/**
 * This class is to demonstrate what Thread is and how it is used in the java industry
 * @author Shivay Sabharwal
 * @version 1.0
 * @since 2021
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html" target="_blank">Java Docs</a>
 */

//Question 3: Demonstrate gerPriority() and setPriority() methods in Java threads.
class Thread3 extends Thread{
    public void run(){
        System.out.println("Welcome");
    }
}
class Thread4 extends Thread {
    public void run() {
        System.out.println("Good morning");
    }
}
public class Eighth_Thread8_Practice2 {
    public static void main(String[] args) {
        Thread3 t1= new Thread3();
        Thread4 t2= new Thread4();
        t1.start();
        t2.start();
        t1.setPriority(5);
        t2.setPriority(1);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
    }
}
