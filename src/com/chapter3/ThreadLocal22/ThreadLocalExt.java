package com.chapter3.ThreadLocal22;

public class ThreadLocalExt extends ThreadLocal<String> {
	@Override
	protected String initialValue() {
		return "我是默认值 第一次get不再为null";
	}
}
