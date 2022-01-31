package Advanced1;

//Question 2: Add a sleep method in the welcome thread of question 1 to delay its execution for 200ms.
class Thread11 extends Thread{
    public void run(){
        try {
            Thread.sleep(200);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Welcome");
    }
}
class Thread22 extends Thread {
    public void run() {
        System.out.println("Good morning");
    }
}

public class Seventh_Thread7_Practice1 {
    public static void main(String[] args) {
        Thread11 t1= new Thread11();
        Thread22 t2= new Thread22();
        t1.start();
        t2.start();
    }
}
