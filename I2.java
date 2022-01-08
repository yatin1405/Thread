package com.ThreadPro;

class TestDaemonThread extends Thread{
	@Override
	public void run() {
		System.out.println("Name of threads: "+Thread.currentThread().getName());
		System.out.println("Daemon: "+Thread.currentThread().isDaemon());
	}
}
public class I2 {
	public static void main(String[] args) {
		TestDaemonThread a1 = new TestDaemonThread();
		TestDaemonThread a2 = new TestDaemonThread();
		
		a1.setDaemon(true);
		a1.start();
		a2.start();	
	}

}
