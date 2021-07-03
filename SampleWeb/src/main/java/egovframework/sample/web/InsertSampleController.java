//package egovframework.sample.web;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import egovframework.sample.service.SampleVO;
//import egovframework.sample.service.impl.SampleDAOJDBC;
//
//@Controller
//public class InsertSampleController {
//
//	@RequestMapping(value="/insertSample.do")
//	public String insertSample(SampleVO vo, SampleDAOJDBC sampleDAO) throws Exception {
//
//		sampleDAO.insertSample(vo);
//		
//		return "forward:selectSampleList.do";
//	}
//}
