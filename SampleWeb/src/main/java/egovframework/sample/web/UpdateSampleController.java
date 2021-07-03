//package egovframework.sample.web;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import egovframework.sample.service.SampleVO;
//import egovframework.sample.service.impl.SampleDAOJDBC;
//
//@Controller
//public class UpdateSampleController {
//
//	@RequestMapping("/updateSample.do")
//	public String updateSample(SampleVO vo, SampleDAOJDBC sampleDAO) throws Exception {
//
//		sampleDAO.updateSample(vo);
//
//		return "forward:selectSampleList.do";
//	}
//}
