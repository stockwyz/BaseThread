package com.chapter3.InheritableThreadLocal2;

import java.util.Date;

public class InheritableThreadLocalExt extends InheritableThreadLocal<Object> {
	@Override
	protected Object initialValue() {
		return new Date().getTime();
	}

	@Override
	protected Object childValue(Object parentValue) {
		// TODO Auto-generated method stub
		return parentValue + "+childValue";
	}
	
	
}
