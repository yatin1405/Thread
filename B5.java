package com.ThreadPro;

class TestCallRun2 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
	}
}
public class B5 {
	public static void main(String[] args) {
		TestCallRun2 t1=new TestCallRun2();
		TestCallRun2 t2=new TestCallRun2();
		t1.run();
		t2.run();
		
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
	}

}
