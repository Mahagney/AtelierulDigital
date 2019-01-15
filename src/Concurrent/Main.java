package Concurrent;

public class Main {
    public static int v=0;
    public static void main(String[] args){
        System.out.println("before: "+v);
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                       v++;
            }};
        for(int i=0;i<500;i++){
            (new Thread(runnable)).start();
        }
        System.out.println("after:"+v);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("after:"+v);
        //ReentrantExample r=new ReentrantExample();
       // r.m();
    }
}
