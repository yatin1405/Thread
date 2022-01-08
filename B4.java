package com.ThreadPro;

class TestThreadTwice1 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Twice thread is: "+i);
		}
	}
}
public class B4 {
	public static void main(String[] args) {
		TestThreadTwice1 t1 = new TestThreadTwice1();
		t1.start();
		t1.start();
	}
}
