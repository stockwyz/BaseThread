package com.chapter3.joinTest1;


public class Test {

	public static void main(String[] args) {

		MyThread threadTest = new MyThread();
		threadTest.start();
//		try {
//			threadTest.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		// Thread.sleep(?)
		System.out.println("我想当threadTest对象执行完毕后我再执行");
		System.out.println("但上面代码中的sleep()中的值应该写多少呢？");
		System.out.println("答案是：根据不能确定:)");
	}

}
