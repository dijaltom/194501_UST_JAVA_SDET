package com.ust.test;
class NewThread implements Runnable{
	String name;
	Thread thread;
	NewThread(String name){
		this.name=name;
		thread=new Thread(this, name);
		thread.start();
		
		
	}
	public void run() {
		try {
			for(int j=5;j>0;j--) {
				System.out.println(name +" : " +j);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			System.out.println(name + "thread interrupted");
		}
		System.out.println(name + "thread existing");
	}
}

public class ThreadExample2 {

	public static void main(String[] args) {
		new NewThread("1st");
		new NewThread("2nd");
		new NewThread("3rd");
		try {
			Thread.sleep(8000);
			
		}catch(InterruptedException exception) {
			System.out.println("Interruption occurs in main thread");
		}
		System.out.println("We are exiting from the main thread");
		// TODO Auto-generated method stub

	}

}
