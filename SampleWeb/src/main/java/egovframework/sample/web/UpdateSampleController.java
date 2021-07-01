package egovframework.sample.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import egovframework.sample.service.SampleVO;
import egovframework.sample.service.impl.SampleDAOJDBC;

public class UpdateSampleController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		System.out.println("샘플 수정 처리");

		/* 사용자 입력 정보 추출 */
		String id = request.getParameter("id");
		String title = request.getParameter("title");
		String regUser = request.getParameter("regUser");
		String content = request.getParameter("content");

		/* DB 연동 처리 */
		SampleVO vo = new SampleVO();
		vo.setId(id);
		vo.setTitle(title);
		vo.setRegUser(regUser);
		vo.setContent(content);

		SampleDAOJDBC sampleDAO = new SampleDAOJDBC();
		sampleDAO.updateSample(vo);

		/* 화면 네비게이션 */
		ModelAndView mav = new ModelAndView();
		mav.setViewName("forward:selectSampleList.do");

		return mav;
	}
}
