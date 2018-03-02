package com.test.www;

public class MySingletonDCL {
	//ʹ��volatile�ؼ��ֱ���ɼ���
	volatile private static MySingletonDCL instance = null;
	
	private MySingletonDCL() {}
	
	public static MySingletonDCL getInstance() {
		try {
			if(instance != null) {
				
			}else {
				Thread.sleep(300);
				synchronized (MySingletonDCL.class) {
					if(instance == null) {//���μ��
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
