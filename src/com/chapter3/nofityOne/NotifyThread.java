package com.chapter3.nofityOne;


public class NotifyThread extends Thread {
	private Object lock;

	public NotifyThread(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		synchronized (lock) {
			//notify通知,只会随机唤醒一个wait状态的线程
			//要想唤醒所有wait状态的线程,要调用notifyAll
			lock.notify();
//			lock.notify();
//			lock.notify();
//			lock.notify();
//			lock.notify();
//			lock.notify();
//			lock.notify();
//			lock.notify();
//			lock.notify();
		}
	}

}
