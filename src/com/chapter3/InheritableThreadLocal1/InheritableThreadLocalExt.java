package com.chapter3.InheritableThreadLocal1;

import java.util.Date;

public class InheritableThreadLocalExt extends InheritableThreadLocal<Long> {
	@Override
	protected Long initialValue() {
		return new Date().getTime();
	}
}
