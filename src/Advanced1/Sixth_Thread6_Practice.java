package Advanced1;

//Question 1: Write a program to print "Good morning" and "Welcome" continuously on the screen in Java using threads.
class Thread1 extends Thread{
    public void run(){
        while (true){
            System.out.println("Welcome");
        }
    }
}
class Thread2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good morning");
        }
    }
}

public class Sixth_Thread6_Practice {
    public static void main(String[] args) {
        Thread1 t1= new Thread1();
        Thread2 t2= new Thread2();
        t1.start();
        t2.start();
    }
}
