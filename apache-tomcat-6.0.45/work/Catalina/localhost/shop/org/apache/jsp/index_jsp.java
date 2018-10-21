package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t<title>商城首页</title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" />\r\n");
      out.write("\t\t<script src=\"js/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div class=\"container-fluid\"\r\n");
      out.write("\t\t\tstyle=\"width: 100%; background: url('img/regist_bg.jpg');\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- 引入header.jsp -->\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "daohang.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t<div id=\"indexContainer\" style=\"width: 83%;float:right;display:inline;\">\r\n");
      out.write("\t\t\t\t<!-- 轮播图 -->\r\n");
      out.write("\t\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t\t\t<div id=\"carousel-example-generic\" class=\"carousel slide\"\r\n");
      out.write("\t\t\t\t\t\tdata-ride=\"carousel\">\r\n");
      out.write("\t\t\t\t\t\t<!-- 轮播图的中的小点 -->\r\n");
      out.write("\t\t\t\t\t\t<ol class=\"carousel-indicators\">\r\n");
      out.write("\t\t\t\t\t\t\t<li data-target=\"#carousel-example-generic\" data-slide-to=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"active\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li data-target=\"#carousel-example-generic\" data-slide-to=\"1\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li data-target=\"#carousel-example-generic\" data-slide-to=\"2\"></li>\r\n");
      out.write("\t\t\t\t\t\t</ol>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- 轮播图的轮播图片 -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-inner\" role=\"listbox\" id=\"pics\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"text-align: center;\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"item\" :class=\"{'active':index==0}\"\r\n");
      out.write("\t\t\t\t\t\t\t\tv-for=\"(item,index) in picProducts\" align=\"center\"\r\n");
      out.write("\t\t\t\t\t\t\t\t@click=\"showDetail(item.pid)\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img :src=\"item.image\" style=\"width: auto\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"carousel-caption\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t{{item.pname}}\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- 上一张 下一张按钮 -->\r\n");
      out.write("\t\t\t\t\t\t<a class=\"left carousel-control\" href=\"#carousel-example-generic\"\r\n");
      out.write("\t\t\t\t\t\t\trole=\"button\" data-slide=\"prev\"> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sr-only\">Previous</span> </a>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"right carousel-control\" href=\"#carousel-example-generic\"\r\n");
      out.write("\t\t\t\t\t\t\trole=\"button\" data-slide=\"next\"> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sr-only\">Next</span> </a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- 热门商品 -->\r\n");
      out.write("\t\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\t热门商品&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"img/title2.jpg\" />\r\n");
      out.write("\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-2\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"border: 1px solid #E7E7E7; border-right: 0; padding: 0;\">\r\n");
      out.write("\t\t\t\t\t\t<img v-if=\"hotProducts.length>0\" :src=\"hotProducts[0].image\"\r\n");
      out.write("\t\t\t\t\t\t\t@click=\"showDetail(hotProducts[0].pid)\" width=\"205\" height=\"404\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: inline-block;\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-10\" id=\"hotProducts\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-6 image-item1\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t<img v-if=\"hotProducts.length>0\" :src=\"hotProducts[1].image\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t@click=\"showDetail(hotProducts[1].pid)\" width=\"516px\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\theight=\"200px\" style=\"display: inline-block;\"> </a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div v-for=\"(item,index) in hotProducts\" v-if=\"index>1\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"col-md-2 image-item2\"\r\n");
      out.write("\t\t\t\t\t\t\t:class=\"{'yes-right-border':index==4||index==10}\"\r\n");
      out.write("\t\t\t\t\t\t\t@click=\"showDetail(item.pid)\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"> <img :src=\"item.image\" width=\"130\" height=\"130\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"display: inline-block;\"> </a>\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"image-item2-title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">{{item.pname}}</a>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"image-item2-price\">\r\n");
      out.write("\t\t\t\t\t\t\t\t&yen;{{item.newPrice}}\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- 广告条 -->\r\n");
      out.write("\t\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t\t\t<img src=\"img/products/hao/ad.jpg\" width=\"100%\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- 最新商品 -->\r\n");
      out.write("\t\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\t最新商品&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"img/title2.jpg\" />\r\n");
      out.write("\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-2\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"border: 1px solid #E7E7E7; border-right: 0; padding: 0;\">\r\n");
      out.write("\t\t\t\t\t\t<img v-if=\"newProducts.length>0\"\r\n");
      out.write("\t\t\t\t\t\t\t@click=\"showDetail(newProducts[0].pid)\"\r\n");
      out.write("\t\t\t\t\t\t\t:src=\"newProducts[0].image\" width=\"205\" height=\"404\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: inline-block;\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-10\" id=\"newProducts\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-6\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"text-align: center; height: 200px; padding: 0px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"> <img v-if=\"newProducts.length>0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t@click=\"showDetail(newProducts[1].pid)\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t:src=\"newProducts[1].image\" width=\"516px\" height=\"200px\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"display: inline-block;\"> </a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div v-for=\"(item,index) in newProducts\" v-if=\"index>1\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"col-md-2 image-item2\"\r\n");
      out.write("\t\t\t\t\t\t\t:class=\"{'yes-right-border':index==4||index==10}\"\r\n");
      out.write("\t\t\t\t\t\t\t@click=\"showDetail(item.pid)\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"> <img :src=\"item.image\" width=\"130\" height=\"130\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"display: inline-block;\"> </a>\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"image-item2-title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">{{item.pname}}</a>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"image-item2-price\">\r\n");
      out.write("\t\t\t\t\t\t\t\t&yen;{{item.newPrice}}\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- 引入footer.jsp -->\r\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"js/vue.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/vue-resource.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\tvar headvue = new Vue( {\r\n");
      out.write("\t\tel : '#indexContainer',\r\n");
      out.write("\t\tdata : {\r\n");
      out.write("\t\t\tpicProducts : [],\r\n");
      out.write("\t\t\thotProducts : [],\r\n");
      out.write("\t\t\tnewProducts : []\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tmethods : {\r\n");
      out.write("\t\t\tshowDetail : function(pid) {\r\n");
      out.write("\t\t\t\tlocation.href = \"product_info?pid=\" + pid;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t},\r\n");
      out.write("\r\n");
      out.write("\t\tcreated : function() {\r\n");
      out.write("\t\t\tthis.$http.get(\"getPicProducts\").then(\r\n");
      out.write("\t\t\tfunction(res) {\r\n");
      out.write("\t\t\t\tthis.picProducts = res.data.list;\r\n");
      out.write("\t\t\t}, function(res) {\r\n");
      out.write("\t\t\t\tconsole.log(res);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\tthis.$http.get(\"getHotProducts\").then(\r\n");
      out.write("\t\t\tfunction(res) {\r\n");
      out.write("\t\t\t\tthis.hotProducts = res.data.list;\r\n");
      out.write("\t\t\t}, function(res) {\r\n");
      out.write("\t\t\t\tconsole.log(res);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\tthis.$http.get(\"getNewProducts\").then(function(res) {\r\n");
      out.write("\t\t\t\tthis.newProducts = res.data.list;\r\n");
      out.write("\t\t\t}, function(res) {\r\n");
      out.write("\t\t\t\tconsole.log(res);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
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
