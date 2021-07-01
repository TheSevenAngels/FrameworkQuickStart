package egovframework.sample.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import egovframework.sample.service.SampleVO;
import egovframework.sample.service.impl.SampleDAOJDBC;

public class SelectSampleController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		System.out.println("샘플 상세 조회 처리");

		/* 검색할 아이디 추출 */
		String id = request.getParameter("id");

		/* DB 연동 처리 */
		SampleVO vo = new SampleVO();
		vo.setId(id);

		SampleDAOJDBC sampleDAO = new SampleDAOJDBC();
		SampleVO sample = sampleDAO.selectSample(vo);

		/* 검색 결과를 ModelAndView에 저장하여 리턴 */
		ModelAndView mav = new ModelAndView();
		mav.addObject("sample", sample);
		mav.setViewName("selectSample");

		return mav;
	}
}