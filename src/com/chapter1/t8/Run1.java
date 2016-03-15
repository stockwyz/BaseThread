package com.chapter1.t8;

public class Run1 {
	public static void main(String[] args) {
		MyThread1 mythread = new MyThread1();
		System.out.println("begin =" + System.currentTimeMillis());
		mythread.run();  //直调MyThread中的方法,未启用线程
		System.out.println("end   =" + System.currentTimeMillis());
	}
}
