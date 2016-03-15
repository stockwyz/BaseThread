package com.chapter2.synchronizedUpdateNewValue;

public class Service {

	private boolean isContinueRun = true;

	public void runMethod() {
		String anyString = new String();
		while (isContinueRun) {
			//System.out.println(isContinueRun);
			synchronized (anyString) {
			}
		}
		System.out.println("线程停止了");
	}

	public void stopMethod() {
		isContinueRun = false;
	}
}
