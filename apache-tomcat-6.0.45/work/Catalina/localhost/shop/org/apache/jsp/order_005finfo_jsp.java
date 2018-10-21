package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class order_005finfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/isLogin.jsp");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');

String user = (String) session.getAttribute("user");
if(user==null){
	response.sendRedirect("login.jsp");
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>订单详情</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\" />\r\n");
      out.write("<script src=\"js/jquery-1.11.3.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/util.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<!-- 引入自定义css文件 style.css -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" />\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("\tmargin-top: 20px;\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".carousel-inner .item img {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 300px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- 引入header.jsp -->\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"container\" style=\"width: 100%; background: url('img/regist_bg.jpg');\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div style=\"margin: 0 auto; margin-top: 10px; width: 950px;\">\r\n");
      out.write("\t\t\t\t<h3><strong>订单详情</strong></h3>\r\n");
      out.write("\t\t\t\t<table class=\"table table-bordered\">\r\n");
      out.write("\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t<tr style=\"background-color:#EDEDED;\">\r\n");
      out.write("\t\t\t\t\t\t\t<th colspan=\"5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4 style=\"font-weight: bold;\">订单编号:<span id=\"oid\"></span></h4>\r\n");
      out.write("\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr style=\"background-color:#EDEDED;\">\r\n");
      out.write("\t\t\t\t\t\t\t<th width=\"30%\">图片</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th width=\"30%\">商品</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th width=\"20%\">价格</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th width=\"10%\">数量</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th width=\"15%\">小计</th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t<tr class=\"active\">\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"hidden\" name=\"id\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"22\"> <img src=\"img/shubiao.jpg\" width=\"70\"\r\n");
      out.write("\t\t\t\t\t\t\t\theight=\"60\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><a target=\"_blank\">鼠标</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>￥98.00</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>5</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><span class=\"subtotal\">￥490.00</span></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div style=\"text-align: right; margin-right: 220px;font-size:18px; font-weight: bold;\">\r\n");
      out.write("\t\t\t\t<p>商品总金额: \r\n");
      out.write("\t\t\t\t￥<span style=\"color: #ff6600;\" id=\"amount\"></span>元</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div style=\"margin: 0 auto; margin-top: 10px; width: 950px;\">\r\n");
      out.write("\t\t\t<hr />\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div style=\"margin-top: 5px; margin-left: 50px;font-size:18px; font-weight: bold;\">\r\n");
      out.write("\t\t\t\t<p>选择支付方式：</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<br /> <input type=\"radio\" name=\"pd_FrpId\" value=\"weixin\" checked=\"checked\" />微信<br/>\r\n");
      out.write("\t\t\t\t    <br/><input type=\"radio\" name=\"pd_FrpId\" value=\"zhifubao\"/>支付宝\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<hr />\r\n");
      out.write("\t\t\t\t<p style=\"text-align: right; margin-right: 100px;\">\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:;\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" width=\"150\" value=\"确认付款\" name=\"submit\" id=\"login\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"background: url('img/login.gif') no-repeat scroll 0 0 rgba(0, 0, 0, 0); height: 35px; width: 100px; color: white;\">\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<hr />\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- 引入footer.jsp -->\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
