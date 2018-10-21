package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("\t<div style=\"margin-top:50px;\">\r\n");
      out.write("\t\t<img src=\"img/footer.jpg\" width=\"100%\" height=\"78\" alt=\"我们的优势\" title=\"我们的优势\" />\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div style=\"text-align: center;margin-top: 5px;\">\r\n");
      out.write("\t\t<ul class=\"list-inline\">\r\n");
      out.write("\t\t\t<li><a href=\"info.jsp\">关于我们</a></li>\r\n");
      out.write("\t\t\t<li><a>联系我们</a></li>\r\n");
      out.write("\t\t\t<li><a>招贤纳士</a></li>\r\n");
      out.write("\t\t\t<li><a>法律声明</a></li>\r\n");
      out.write("\t\t\t<li><a>友情链接</a></li>\r\n");
      out.write("\t\t\t<li><a>支付方式</a></li>\r\n");
      out.write("\t\t\t<li><a>配送方式</a></li>\r\n");
      out.write("\t\t\t<li><a>服务声明</a></li>\r\n");
      out.write("\t\t\t<li><a>广告声明</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"text-align: center;margin-top: 5px;margin-bottom:20px;\">\r\n");
      out.write("\t\tCopyright &copy; 2005-2018 湖北理工商城 版权所有\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
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
