package com.test.www;

public class MySingletonDCL {
	//使用volatile关键字保其可见性
	volatile private static MySingletonDCL instance = null;
	
	private MySingletonDCL() {}
	
	public static MySingletonDCL getInstance() {
		try {
			if(instance != null) {
				
			}else {
				Thread.sleep(300);
				synchronized (MySingletonDCL.class) {
					if(instance == null) {//二次检查
						instance = new MySingletonDCL();
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return instance;
	}
}
