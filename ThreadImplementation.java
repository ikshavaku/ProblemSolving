import java.lang.*;

class PracticeThreads extends Thread {
    public void run(){
        System.out.println("The thread has started.");
    }
}

class ThreadImplementation {
    public static void main(String[] args) throws Exception{
        PracticeThreads t1 = new PracticeThreads();
        PracticeThreads t2 = new PracticeThreads();
        PracticeThreads t3 = new PracticeThreads();
        PracticeThreads t4 = new PracticeThreads();

        /*System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
        System.out.println(t4.getPriority());*/

        t1.setPriority(3);
        t2.setPriority(8);
        t3.setPriority(9);
        t4.setPriority(1);
        
        /*System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
        System.out.println(t4.getPriority());*/

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        //t4.sleep(2);
        //t1.sleep(3);

        t1.getState();
        t2.getState();
        t3.getState();
        t4.getState();
    }
}