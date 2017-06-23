package threadDemo;


public class CurrentThreadDemo {

    public static void main(String[] args) {

        Thread t = Thread.currentThread();
        System.out.println("Main thread: " + t);

        t.setName("My current thread");
        System.out.println("Main tread: " + t);

    }
}
