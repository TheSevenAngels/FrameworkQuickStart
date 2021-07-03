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
//public class SelectSampleListController {
//
//	@RequestMapping(value="/selectSampleList.do")
//	public ModelAndView selectSampleList(SampleVO vo, SampleDAOJDBC sampleDAO, ModelAndView mav) throws Exception {
//
//		mav.addObject("sampleList", sampleDAO.selectSampleList(vo));
//		mav.setViewName("selectSampleList");
//
//		return mav;
//	}
//}