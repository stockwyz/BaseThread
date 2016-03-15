package com.chapter3.waitOld;

public class Subtract {

	private String lock;

	public Subtract(String lock) {
		super();
		this.lock = lock;
	}

	public void subtract() {
		try {
			synchronized (lock) {
				while (ValueObject.list.size() == 0) {   
					//if(ValueObject.list.size() == 0) {    
					//改成这样会报错,两个subtract线程在wait, 一个add线程向list增加一个元素后,调用notifyAll,
					//两个subtract线程分别被唤醒,第一个会成功删除list中的唯一元素,第二个在执行remove(0)时会报错
					System.out.println("wait begin ThreadName="
							+ Thread.currentThread().getName());
					lock.wait();
					System.out.println("wait   end ThreadName="
							+ Thread.currentThread().getName());
				}
				ValueObject.list.remove(0);
				System.out.println("list size=" + ValueObject.list.size());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
