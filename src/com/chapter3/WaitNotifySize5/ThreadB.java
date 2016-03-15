package com.chapter3.WaitNotifySize5;

public class ThreadB extends Thread {
	private Object lock;

	public ThreadB(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		try {

			for (int i = 0; i < 10; i++) {
				synchronized (lock) {
					MyList.add();
					System.out.println("添加了第" + (i + 1) + "个元素");
					if (MyList.size() == 5) {
						lock.notify();
						System.out.println("已发出通知");
					}
				}
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
