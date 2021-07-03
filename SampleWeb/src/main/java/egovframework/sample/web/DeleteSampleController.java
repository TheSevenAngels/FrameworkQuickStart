//package egovframework.sample.web;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import egovframework.sample.service.SampleVO;
//import egovframework.sample.service.impl.SampleDAOJDBC;
//
//@Controller
//public class DeleteSampleController {
//
//	@RequestMapping(value="/deleteSample.do")
//	public String deleteSample(SampleVO vo, SampleDAOJDBC sampleDAO) throws Exception {
//		
//		sampleDAO.deleteSample(vo);
//
//		return "forward:selectSampleList.do";
//	}
//}
