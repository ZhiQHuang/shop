package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class search_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<head>\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t\t<title>商品列表</title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\" />\r\n");
      out.write("\t\t<script src=\"js/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script src=\"js/util.js\"></script>\r\n");
      out.write("\t\t<!-- 引入自定义css文件 style.css -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/style1.css\" type=\"text/css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/zpageNav.css\" type=\"text/css\" />\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- 引入header.jsp -->\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"container\" id=\"plistContainer\"\r\n");
      out.write("\t\t\tstyle=\"width: 100%; background: url('img/regist_bg.jpg');\">\r\n");
      out.write("\t\t\t<div class=\"row plist\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-12\" style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t\t<ol class=\"breadcrumb\">\r\n");
      out.write("\t\t\t\t\t\t<li style=\"font-size: 20px; font-weight: bold;\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><span id=\"catName\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ol>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"plist\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-2\" v-for=\"item in productList\"\r\n");
      out.write("\t\t\t\t\t\t@click=\"showDetail(item.pid)\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"> <img :src=\"item.image\" width=\"200\" height=\"200\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"display: inline-block;\"> </a>\r\n");
      out.write("\t\t\t\t\t\t<p></p>\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" style='font-weight: bold;'>{{item.pname}}</a>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<p></p>\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t<font color=\"#FF0000\">商城价：&yen;{{item.newPrice}}</font>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!--分页 -->\r\n");
      out.write("\t\t\t<div style=\"width: 380px; margin: 0 auto; margin-top: 50px;\">\r\n");
      out.write("\t\t\t\t<zpagenav v-bind:page=\"page\" v-bind:page-size=\"pageSize\"\r\n");
      out.write("\t\t\t\t\tv-bind:total=\"total\" v-bind:max-page=\"maxPage\"\r\n");
      out.write("\t\t\t\t\tv-on:pagehandler=\"pageHandler\">\r\n");
      out.write("\t\t\t\t<zpagenav>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- 分页结束 -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- 引入footer.jsp -->\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("\t<script src=\"js/vue.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/vue-resource.js\"></script>\r\n");
      out.write("\t<script src=\"js/zpageNav.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\tvar vue1 = new Vue( {\r\n");
      out.write("\t\tel : \"#plistContainer\",\r\n");
      out.write("\t\tdata : {\r\n");
      out.write("\t\t\tproductList : [],\r\n");
      out.write("\t\t\tpage : 1,\r\n");
      out.write("\t\t\tpageSize : 10,\r\n");
      out.write("\t\t\ttotal : 100,\r\n");
      out.write("\t\t\tmaxPage : 9\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tmethods : {\r\n");
      out.write("\t\t\tpageHandler : function(page) {\r\n");
      out.write("\t\t\t\tthis.page = page;\r\n");
      out.write("\t\t\t\tvar params = {\r\n");
      out.write("\t\t\t\t\t\"page\" : page,\r\n");
      out.write("\t\t\t\t\t\"row\" : this.pageSize,\r\n");
      out.write("\t\t\t\t\t\"name\" : getQueryString(\"searchContent\")\r\n");
      out.write("\t\t\t\t};\r\n");
      out.write("\t\t\t\tthis.$http.post(\"getProductsByName\", params, {\r\n");
      out.write("\t\t\t\t\temulateJSON : true\r\n");
      out.write("\t\t\t\t}).then(function(res) {\r\n");
      out.write("\t\t\t\t\tthis.productList = res.data.list;\r\n");
      out.write("\t\t\t\t\tthis.total = res.data.total;\r\n");
      out.write("\t\t\t\t\tthis.maxPage = res.data.pages;\r\n");
      out.write("\t\t\t\t}, function(res) {\r\n");
      out.write("\t\t\t\t\tconsole.log(res);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tshowDetail : function(pid) {\r\n");
      out.write("\t\t\t\tlocation.href = \"product_info?pid=\" + pid;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tcreated : function() {\r\n");
      out.write("\t\t\tthis.pageHandler(1);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
