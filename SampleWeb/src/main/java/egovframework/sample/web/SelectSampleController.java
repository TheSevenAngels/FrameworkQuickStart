//package egovframework.sample.web;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//import egovframework.sample.service.SampleVO;
//import egovframework.sample.service.impl.SampleDAOJDBC;
//
//@Controller
//public class SelectSampleController {
//
//	@RequestMapping(value="/selectSample.do")
//	public ModelAndView selectSample(SampleVO vo, SampleDAOJDBC sampleDAO, ModelAndView mav) throws Exception {
//
//		mav.addObject("sample", sampleDAO.selectSample(vo));
//		mav.setViewName("selectSample");
//
//		return mav;
//	}
//}