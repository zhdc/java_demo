package com.test.factory1;

public class TVFactory {
	public static TV produceTV(String brand) throws Exception{
		if(brand.equalsIgnoreCase("Haier")) {
			System.out.println("����������������");
			return new HaierTV();
		}else {
			return null;
		}
		
	}
}
