package Advanced1;

//Question 4: How do you get the state of a given thread in Java?
//
//Answer 4: getState() method is used to get the state of a given thread in Java.
//
//Question 5: How do you get the reference to the current thread in Java?
//
//Answer 5: currentThread() method is used to reference the current thread in Java.

/**
 * This class is to demonstrate what Thread is and how it is used in the java industry
 * @author Shivay Sabharwal
 * @version 1.0
 * @since 2021
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html" target="_blank">Java Docs</a>
 */

class PracticeThread extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning!");
        }
    }
}
class PracticeThread1 extends Thread{
    public void run(){
//        while(false){
//            try {
//                Thread.sleep(200);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
//            System.out.println("Welcome");
//        }
    }
}

public class Ninth_Thread9_Practice3 {
    public static void main(String[] args) {
        PracticeThread p1 = new PracticeThread();
        PracticeThread1 p2 = new PracticeThread1();
        // p1.setPriority(6);
        // p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());
//        p1.start();
        p2.start();
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
