package com.ThreadPro;

class T2 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
public class B2 {
	public static void main(String[] args) {
		T2 t2= new T2();
		t2.start();
	}

}
