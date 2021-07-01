package egovframework.sample.service;

import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import egovframework.sample.service.impl.CollectionBean;

public class CollectionBeanClient {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext(
				"egovframework/spring/context-common.xml");
		
		CollectionBean bean = (CollectionBean)factory.getBean("collectionBean");
		
		Properties addrList = bean.getAddrList();
		System.out.println("<주소 목록>");
		
		Set<Object> keys = addrList.keySet();
		
		for(Object key : keys) {
			System.out.println(key + "의 주소: " + addrList.get(key));
		}
		
		factory.close();
	}
}
