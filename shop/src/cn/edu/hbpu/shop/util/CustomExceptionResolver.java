package cn.edu.hbpu.shop.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerExceptionResolverComposite;

public class CustomExceptionResolver extends HandlerExceptionResolverComposite {
	@Override
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object obj, Exception exception){
		
		ModelAndView modelAndView = new ModelAndView();
		String msg = "";
		if (exception instanceof MyException) {
			msg=exception.getMessage();
		} else {
			msg="服务器正忙，请稍后再试！";
		}
		modelAndView.addObject("msg", msg);
		modelAndView.setViewName("error");
		return modelAndView;
		
	}
}
