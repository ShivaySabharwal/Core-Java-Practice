package Advanced1;

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
