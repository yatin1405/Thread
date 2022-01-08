package com.ThreadPro;

class First{
	public void display(String mes) {
		System.out.print(" [ "+mes);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(" ] ");
	}
}
class Second extends Thread{
	String mes;
	First f1;
	public Second(String mes, First f1) {
		this.mes=mes;
		this.f1=f1;
	}
	@Override
	public void run() {
		synchronized (f1) {
			f1.display(mes);
		}
	}
	
}

public class A2 {
	public static void main(String[] args) {
		First f1 = new First();
		Second s1 = new Second("Hello", f1);
		Second s2 = new Second("How R U", f1);
		Second s3 = new Second("All", f1);
		s1.start();
		s2.start();
		s3.start();
		
	}

}
