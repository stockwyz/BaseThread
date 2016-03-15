package com.chapter3.ThreadLocal11;

public class Run {
	public static ThreadLocal<String> tl = new ThreadLocal<String>();

	public static void main(String[] args) {
		if (tl.get() == null) {
			System.out.println("从未放过值");
			tl.set("我的值");
		}
		System.out.println(tl.get());
		System.out.println(tl.get());
	}

}
