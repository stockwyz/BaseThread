package com.chapter4.lockMethodTest1.test1;

import java.util.concurrent.locks.ReentrantLock;

public class Service {

	private ReentrantLock lock = new ReentrantLock();

	public void serviceMethod1() {
		try {
			lock.lock();
			System.out.println("serviceMethod1 getHoldCount="
					+ lock.getHoldCount());
			serviceMethod2();
			System.out.println("serviceMethod2 end getHoldCount=" + lock.getHoldCount());
		} finally {
			lock.unlock();
			System.out.println("serviceMethod1 end getHoldCount=" + lock.getHoldCount());
		}
	}

	public void serviceMethod2() {
		try {
			lock.lock();
			System.out.println("serviceMethod2 getHoldCount="
					+ lock.getHoldCount());
		} finally {
			lock.unlock();
		}
	}

}
