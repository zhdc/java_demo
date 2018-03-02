package com.test.www;

public class MySingletonDCLThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(MySingletonDCL.getInstance().hashCode());
	}
}
