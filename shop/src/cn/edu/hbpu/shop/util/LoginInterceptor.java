package cn.edu.hbpu.shop.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {

	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {

	}

	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object obj) throws Exception {
		HttpSession session = request.getSession();
		Integer uid = (Integer) session.getAttribute("adminuser");
		String uri = request.getRequestURI();
		if (uri.endsWith("login.jsp") || uri.endsWith("login")
				|| uri.endsWith("Login") || uri.endsWith(".css")) {
			return true;
		} else if (uid != null) {
			return true;
		} else {
			response
					.sendRedirect(request.getContextPath() + "/admin/login.jsp");
		}
		return false;
	}

}
