package com.chapter3.InheritableThreadLocal1;

public class ThreadB extends Thread {

	@Override
	public synchronized void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("在ThreadB线程中取值=" + Tools.tl.get());
				Thread.sleep(100);
				if(i == 5) {
					wait();
					System.out.println("Main线程是ThreadLocal值被改变");
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
