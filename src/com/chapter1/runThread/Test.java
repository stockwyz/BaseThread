package com.chapter1.runThread;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread runThread = Thread.currentThread();
		System.out.println(runThread.getName() + " " + runThread.getId());
	}
}
