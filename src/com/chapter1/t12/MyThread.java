package com.chapter1.t12;

public class MyThread extends Thread {
	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 500000; i++) {
			//System.out.println();
		}
		System.out.println("");
		System.out.println("MyThread is end!");
	}
}
