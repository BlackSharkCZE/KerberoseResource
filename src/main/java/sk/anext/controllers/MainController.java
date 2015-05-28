package sk.anext.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * <strong>Created with IntelliJ IDEA</strong><br/>
 * User: Jiri Pejsa<br/>
 * Date: 26.5.15<br/>
 * Time: 12:46<br/>
 * <p>To change this template use File | Settings | File Templates.</p>
 */
@Controller
public class MainController {

	@RequestMapping("hello")
	public ModelAndView processHello(final HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("hello");
		mv.addObject("message", "Hello World!");
		mv.addObject("httpServletRequest", request);
		return mv;
	}

	@RequestMapping("home")
	public ModelAndView processHome(final HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("httpServletRequest", request);
		return mv;
	}

	@RequestMapping("login")
	public ModelAndView processLogin(final HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("httpServletRequest", request);
		return mv;
	}

}
