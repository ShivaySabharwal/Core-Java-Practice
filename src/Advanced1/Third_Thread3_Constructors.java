package Advanced1;

/**
 * This class is to demonstrate what Thread is and how it is used in the java industry
 * This is <i>italic</i> word<p>this is a new paragraph</p>
 * @author Shivay Sabharwal
 * @version 1.0
 * @since 2021
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html" target="_blank">Java Docs</a>
 */

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 34;
        System.out.println("Hi! There...");
//        while(true){
//            System.out.println("I am a thread");
//        }
    }
}

public class Third_Thread3_Constructors {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Hardik");
        MyThr t2 = new MyThr("Satvik");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t is " + t1.getId());
        System.out.println("The name of the thread t is " + t1.getName());
        System.out.println("The id of the thread t is " + t2.getId());
        System.out.println("The name of the thread t is " + t2.getName());

    }
}
