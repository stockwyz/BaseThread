package com.chapter3.join_sleep_2;

public class ThreadA extends Thread {

	private ThreadB b;

	public ThreadA(ThreadB b) {
		super();
		this.b = b;
	}

	@Override
	public void run() {
		try {
			synchronized (b) {
				b.start();
				//Thread.sleep(6000);
				b.join();
			}
			System.out.println("ThreadA end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
