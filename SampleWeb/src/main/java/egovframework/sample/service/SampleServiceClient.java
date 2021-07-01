package egovframework.sample.service;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SampleServiceClient {

	public static void main(String[] args) throws Exception {

		String[] configurations = { "egovframework/spring/context-common.xml",
				"egovframework/spring/context-datasource.xml", "egovframework/spring/context-transaction.xml",
				"egovframework/spring/context-idgen.xml" };
		AbstractApplicationContext container = new GenericXmlApplicationContext(configurations);

		SampleService sampleService = (SampleService) container.getBean("sampleService");
		SampleVO vo = new SampleVO();

		vo.setTitle("제목");
		vo.setRegUser("테스트");
		vo.setContent("내용");

		sampleService.insertSample(vo);

		List<SampleVO> sampleList = sampleService.selectSampleList(vo);

		System.out.println("[Sample LIST]");

		for (SampleVO sample : sampleList) {
			System.out.println("---> " + sample.toString());
		}
		container.close();
	}
}