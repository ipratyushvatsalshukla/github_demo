package spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {

		String n=req.getParameter("un");
		
				ModelAndView mv;
		if(checkun and pa)
		{
			mv=new ModelAndView("success");
		}
		else
		{
			mv=new ModelAndView("fail");
		}
		return mv;
	}

}
