package com.ThreadPro;

class TestMultiPriority extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
	}
}
public class I1 {
	public static void main(String[] args) {
		TestMultiPriority m1 = new TestMultiPriority();
		TestMultiPriority m2 = new TestMultiPriority();
		
		m1.setName("myThread-1");
		m2.setName("myThread-2");
		
		m1.setPriority(Thread.MIN_PRIORITY);
		m2.setPriority(Thread.NORM_PRIORITY);
		
		m1.getName();
		m2.getName();
		
		m1.getPriority();
		m2.getPriority();
		
		m1.start();
		m2.start();
		
		System.out.println(m1);
		System.out.println(m2);
	}

}
