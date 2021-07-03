package egovframework.sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import egovframework.sample.service.SampleVO;
import egovframework.sample.service.impl.SampleDAOJDBC;

@Controller
public class SampleController {

	@RequestMapping(value = "/insertSample.do", method=RequestMethod.GET)
	public String insertSampleView() throws Exception {
		System.out.println("등록 화면으로 이동");

		return "insertSample";
	}
	
	@RequestMapping(value = "/insertSample.do", method=RequestMethod.POST)
	public String insertSample(SampleVO vo, SampleDAOJDBC sampleDAO) throws Exception {
		System.out.println("등록 처리");

		sampleDAO.insertSample(vo);

		return "forward:selectSampleList.do";
	}

	@RequestMapping("/updateSample.do")
	public String updateSample(SampleVO vo, SampleDAOJDBC sampleDAO) throws Exception {

		sampleDAO.updateSample(vo);

		return "forward:selectSampleList.do";
	}

	@RequestMapping(value = "/deleteSample.do")
	public String deleteSample(SampleVO vo, SampleDAOJDBC sampleDAO) throws Exception {

		sampleDAO.deleteSample(vo);

		return "forward:selectSampleList.do";
	}

	@RequestMapping(value = "/selectSample.do")
	public ModelAndView selectSample(SampleVO vo, SampleDAOJDBC sampleDAO, ModelAndView mav) throws Exception {

		mav.addObject("sample", sampleDAO.selectSample(vo));
		mav.setViewName("selectSample");

		return mav;
	}

	@RequestMapping(value = "/selectSampleList.do")
	public ModelAndView selectSampleList(SampleVO vo, SampleDAOJDBC sampleDAO, ModelAndView mav) throws Exception {

		mav.addObject("sampleList", sampleDAO.selectSampleList(vo));
		mav.setViewName("selectSampleList");

		return mav;
	}

}
