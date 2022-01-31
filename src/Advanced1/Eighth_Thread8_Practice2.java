package Advanced1;

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
