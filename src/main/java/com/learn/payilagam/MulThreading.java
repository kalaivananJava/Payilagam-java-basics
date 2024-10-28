package com.learn.payilagam;

class Book extends Thread{

    public void run(){
        for(int i=0;i<5;i++)
        {
        System.out.println("book");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
        }
    }
    
    
}

class Note extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
        System.out.println("Note");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        }
    }
}
public class MulThreading {

    public static void main(String[] args) throws InterruptedException {
        Book b=new Book();
        Note n= new Note();
        System.out.println("bookss"+b.isAlive());
        b.start();
        System.out.println("bookss"+b.isAlive());
        b.join();
       // b.join();
       System.out.println("bookss"+b.isAlive());
System.out.println("start");
       
        n.start();
         n.join();
        System.out.println("last");


    }
    
}
