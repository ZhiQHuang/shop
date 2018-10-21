package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class info_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t\t<title>商城信息展示</title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\" />\r\n");
      out.write("\t\t<script src=\"js/jquery-1.11.3.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- 引入header.jsp -->\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"container-fluid\" style=\"width: 100%; background: url('img/regist_bg.jpg');\">\r\n");
      out.write("\t\t\t\t<div class=\"main_con\">\r\n");
      out.write("\t\t\t\t\t<h2>公司简介</h2>\r\n");
      out.write("\t\t\t\t\t<hr/>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t<h2>湖北理工学院计算机学院</h2>\r\n");
      out.write("\t\t\t\t\t\t\t湖北理工学院计算机学院创建于1995年，现有教师64人，具有硕士及以上学历学位的教师占教师总人数的80%；拥有教授7人，副教授17人；博士13人，形成了一支学术造诣较高、科研能力较强、年龄与知识结构合理的师资队伍。现开设有计算机科学与技术、网络工程、软件工程、物联网工程4个本科专业和计算机应用技术、计算机网络技术2个专科专业，本、专科在校学生1184人。 \r\n");
      out.write("\r\n");
      out.write("学院建设有信息技术及应用省级重点实验教学示范中心和湖北省服务外包人才培养（训）基地。办学条件优良，拥有网络工程实验室、软件综合实验室、硬件综合实验室、多媒体实验室、物联网实验室、计算机基础实验室6类共20个实验室，其中计算机基础实验室为省级合格实验室；拥有各类计算机800多台套，各类网络设备100台余套，ARM、EDA、DSP、接口及组成原理等各类硬件开发设备120多台套，实验设备总资产达800余万元，能充分满足师生各类教学实验及科研的需要。\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- 引入footer.jsp -->\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
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
