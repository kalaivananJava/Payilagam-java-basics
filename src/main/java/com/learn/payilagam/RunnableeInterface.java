package com.learn.payilagam;

// class A implements Runnable {
//     @Override
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("run is A");
//         }
//     }
// }

public class RunnableeInterface {
    public static void main(String[] args) throws InterruptedException
     {
        // Runnable a = new A();
        Thread t = new Thread(() ->{
            System.out.println("thread"); 
        });
        // System.out.println("main 1");
        t.start();
    }
}
