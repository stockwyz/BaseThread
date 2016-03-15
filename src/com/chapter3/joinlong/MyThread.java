package com.chapter3.joinlong;

public class MyThread extends Thread {

	@Override
	public void run() {
		try {
			System.out.println("MyThread begin Timer=" + System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("MyThread end timer=" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
