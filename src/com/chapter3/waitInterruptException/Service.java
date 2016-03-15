package com.chapter3.waitInterruptException;

public class Service {

	public void testMethod(Object lock) {
		try {
			synchronized (lock) {
				System.out.println("begin wait()");
				lock.wait();
				System.out.println("  end wait()");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("在wait方法中的线程,被其他线程调用了interrupt方法,收到了一个interruptException");
		}
	}

}
