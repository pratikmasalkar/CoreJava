class DemoThread extends Thread{
    public void run(){
        System.out.println("THread 1");
    }
    public static void main(String[] args) {
        DemoThread t = new DemoThread();
        t.start();
        System.out.println(Thread.currentThread());
        Thread.currentThread().setName("Pratik");
        System.out.println(Thread.currentThread().getName());
    }
}