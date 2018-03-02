package com.test.www;

public class MySingletonThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(MySingleton.getInstance().hashCode());
	}
}
