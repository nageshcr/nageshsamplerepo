package com.threads;

public class Main {

	public static void main(String[] args) {

		ChildThread.mt = Thread.currentThread();
		ChildThread t1 = new ChildThread();
		t1.start();
		for(int i = 0; i< 2; i++)
		{
			System.out.println("this is main thread" + Thread.currentThread().getName());
			
		}
	}
	
}
