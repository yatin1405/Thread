package com.ThreadPro;

class ThreadGroupDemo implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}
}

public class A1 {
	public static void main(String[] args) {
		ThreadGroupDemo r1 = new ThreadGroupDemo();
		ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");
		
		Thread t1 = new Thread(tg1,r1,"one");
		t1.start();
		Thread t2 = new Thread(tg1,r1,"two");
		t2.start();
		Thread t3 = new Thread(tg1,r1,"three");
		t3.start();
		
		System.out.println("Thread group name: "+tg1.getName());
		tg1.list();
	}

}
