package com.chapter3.InheritableThreadLocal1;


public class Run2 {

	public static void main(String[] args) {
		try {
			System.out.println("在Main线程中第一次取值=" + Tools.tl.get());

			ThreadB b = new ThreadB();
			b.start();
			Thread.sleep(100);
			synchronized(b) {
				//主线程将ThreadLocal中的值改变
				Tools.tl.set(222222L);
				b.notify();
			}
			b.join();
			System.out.println("在Main线程中取值=" + Tools.tl.get());
			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
