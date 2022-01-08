package com.ThreadPro;

class Th extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}

public class B3 {
	public static void main(String[] args) {
		
		Th th = new Th();
		th.start();
		
		for(int j=11;j<=15; j++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(j);
		}
	}
}
