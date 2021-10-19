package com.ust.test;

public class ThreadExample1 implements Runnable{
	public void run() {
	}

	public static void main(String[] args) {
		Thread guruthread1=new Thread();
		guruthread1.start();
		try {
			guruthread1.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		guruthread1.setPriority(1);
		int gurupriority=guruthread1.getPriority();
		System.out.println(gurupriority);
		System.out.println("Thread Running");
		// TODO Auto-generated method stub

	}

}
