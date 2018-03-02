package com.test.www;

import com.test.factory1.TV;
import com.test.factory1.TVFactory;
import com.test.factory1.XMLUtilTV;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//单例-饥饿模式
		/*
		MySingletonThread[] mst = new MySingletonThread[20];
		for(int i=0;i<mst.length;i++) {
			mst[i] = new MySingletonThread();
			mst[i].start();
		}
		*/
		//单例-饱汉模式
		/*
		MySingletonDCLThread[] msdcl = new MySingletonDCLThread[10];
		for(int i=0;i<msdcl.length;i++) {
			msdcl[i] = new MySingletonDCLThread();
			msdcl[i].start();
		}
		*/
		//工厂模式1
		TV tv;
		String brandName = XMLUtilTV.getBrandName();
		try {
			tv = TVFactory.produceTV(brandName);
			tv.play();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
