package com.chapter1.t12;


public class Run3 {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			thread.interrupt();
			System.out.println("是否停止1？"+thread.isInterrupted());
			System.out.println("是否停止2？"+thread.isInterrupted());
			Thread.sleep(10);
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}
}

