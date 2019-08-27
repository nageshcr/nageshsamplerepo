package com.threads;

public class ChildThread extends Thread {

	static Thread mt;
	@Override
	public void run() {
		//child thread has to wait until the main thread completes its task
		
		try {
			mt.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		for (int i = 0; i < 2; i++) {
			System.out.println("this is child thread" );
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
