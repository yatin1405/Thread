package com.ThreadPro;

class T implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println(i);
		}
		
	}
}
public class B1 {
	public static void main(String[] args) {
		T t = new T();
		Thread t2 = new Thread(t);
		t2.start();
		
	}

}
