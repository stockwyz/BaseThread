package com.chapter3.ThreadLocal33;

import java.util.Date;

public class ThreadLocalExt extends ThreadLocal<Long> {
	@Override
	protected Long initialValue() {
		return new Date().getTime();
	}
}
