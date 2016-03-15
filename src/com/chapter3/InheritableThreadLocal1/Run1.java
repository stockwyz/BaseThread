package com.chapter3.InheritableThreadLocal1;


public class Run1 {

	public static void main(String[] args) {
		try {
			//让子线程先从InheritableThreadLocal中取值
			ThreadA a = new ThreadA();
			a.start();
			Thread.sleep(1000);
			//主线程再从InheritableThreadLocal中取值
			System.out.println("在Main线程中取值=" + Tools.tl.get());
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
