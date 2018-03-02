package com.test.factory1;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.*;

public class XMLUtilTV {
	//该方法用于从xml配置文件中提取品牌名称，并返回该品牌名称
	public static String getBrandName() {
		try {
			//创建文档对象
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("C:/zhdc/project/java_demo/bin/com/test/factory1/configTV.xml"));
			
			//获取包含品牌名称的文本节点
			NodeList nl = doc.getElementsByTagName("brandName");
			Node classNode = (Node) nl.item(0).getFirstChild();
			String brandName = classNode.getNodeValue().trim();
			return brandName;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "";
		}
	}
}
