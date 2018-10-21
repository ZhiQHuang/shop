package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class daohang_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=utf-8");
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

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t<title>侧栏弹出导航</title>\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("* {\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\tlist-style: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("\tbackground: #fff;\r\n");
      out.write("\tfont: normal 16px/ 22px 宋体;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("img {\r\n");
      out.write("\tborder: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tcolor: #333;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a:hover {\r\n");
      out.write("\tcolor: #1974A1;\r\n");
      out.write("\ttext-decoration: underline;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".banner {\r\n");
      out.write("\tpadding-left: 15px;\r\n");
      out.write("\twidth: 250px;\r\n");
      out.write("\tdisplay: inline;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav {\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\tz-index: 1;\r\n");
      out.write("\twidth: 250px;\r\n");
      out.write("\tbackground: #F1F1F1;\r\n");
      out.write("\theight:650px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav .mainCate {\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\tpadding: 10px 20px;\r\n");
      out.write("\tzoom: 1;\r\n");
      out.write("\theight:80px;\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav .evenLeval {\r\n");
      out.write("\tbackground: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav h3 {\r\n");
      out.write("\theight: 28px;\r\n");
      out.write("\tline-height: 28px;\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav h3 span {\r\n");
      out.write("\twidth: 18px;\r\n");
      out.write("\theight: 15px;\r\n");
      out.write("\tline-height: 32px;\r\n");
      out.write("\tfont-weight: 200;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tfloat: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav p {\r\n");
      out.write("\theight: 20px;\r\n");
      out.write("\tline-height: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav p a {\r\n");
      out.write("\tmargin-right: 10px;\r\n");
      out.write("\tcolor: #666;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav .subCate {\r\n");
      out.write("\tdisplay: none;\r\n");
      out.write("\tbackground: url(images/nav_div_bg.jpg) 0 0 repeat-y #fff;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tleft: 250px;\r\n");
      out.write("\ttop: 0;\r\n");
      out.write("\twidth: 750px;\r\n");
      out.write("\tpadding: 0 0 20px 20px;\r\n");
      out.write("\tcolor: #333;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav .subCate h4 {\r\n");
      out.write("\theight: 26px;\r\n");
      out.write("\tline-height: 26px;\r\n");
      out.write("\tmargin: 0 0 10px 0;\r\n");
      out.write("\tborder-bottom: 1px solid #ccc;\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("\tcolor: #333;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav .subCate ul {\r\n");
      out.write("\twidth: 230px;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("\tpadding-top: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav .subCate li {\r\n");
      out.write("\twidth: 230px;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tdisplay: inline;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav .subCate li a {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tpadding: 0 5px;\r\n");
      out.write("\tline-height: 25px;\r\n");
      out.write("\tcolor: #666;\r\n");
      out.write("\tword-break: keep-all;\r\n");
      out.write("\twhite-space: nowrap;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav .subCate #sub-ul-1 {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav .on {\r\n");
      out.write("\tbackground: #88766E;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav .on h3 a,#nav .on p a {\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav .on .subCate {\r\n");
      out.write("\tdisplay: block !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#mainCate-1 {\r\n");
      out.write("\tfont-size:13px\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#mainCate-4 .subCate {\r\n");
      out.write("\ttop: -100px\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#mainCate-5 .subCate {\r\n");
      out.write("\ttop: -164px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#mainCate-6 .subCate {\r\n");
      out.write("\ttop: auto;\r\n");
      out.write("\tbottom: 0;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"banner\" id=\"leftContainer\">\r\n");
      out.write("\t\t<ul id=\"nav\">\r\n");
      out.write("\t\t\t<li class=\"mainCate\"\r\n");
      out.write("\t\t\t\tv-for=\"(item,index) in categoryList\" @click=\"show(item)\">\r\n");
      out.write("\t\t\t\t<a href=\"#\" @click=\"getCatProduct(item.cid)\">{{item.cname}}</a>\r\n");
      out.write("\t\t\t\t<p v-show=\"!item.sub\"  id=\"mainCate-1\">\r\n");
      out.write("\t\t\t\t\t<li2 v-for=\"(t,index) in twocategoryList\" style=\"font-size:14px\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" @click=\"getTwoCatProduct(item.cid,t.tcid)\" v-if=\"t.cid==item.cid\">{{t.tcname}}</a>\r\n");
      out.write("\t\t\t\t\t</li2>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"js/vue.min.js\"></script>\r\n");
      out.write("<script src=\"js/vue-resource.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tvar leftvue = new Vue( {\r\n");
      out.write("\t\tel : '#leftContainer',\r\n");
      out.write("\t\tdata : {\r\n");
      out.write("\t\t\tcategoryList : [],\r\n");
      out.write("\t\t\ttwocategoryList : []\r\n");
      out.write("\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tmethods : {\r\n");
      out.write("\t\t\tgetCatProduct : function(cid) {\r\n");
      out.write("\t\t\t\tlocation.href = \"product_list?cid=\" + cid+\"&tcid=0\";\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tgetTwoCatProduct : function(cid,tcid) {\r\n");
      out.write("\t\t\t\tlocation.href = \"product_list?tcid=\"+tcid+\"&cid=\"+cid;\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tshow:function(item){\r\n");
      out.write("\t\t\t\titem.sub=!item.sub;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tcreated : function() {\r\n");
      out.write("\t\t\t//created代表当页面加载完成，立刻执行后面的方法\r\n");
      out.write("\t\t//发生Ajax请求\r\n");
      out.write("\t\tthis.$http.get(\"getcategories\").then(function(res) {\r\n");
      out.write("\t\t\t//请求成功\r\n");
      out.write("\t\t\t\tthis.categoryList = res.data;\r\n");
      out.write("\t\t\t}, function(res) {\r\n");
      out.write("\t\t\t\t//请求失败\r\n");
      out.write("\t\t\t\tconsole.log(res);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tthis.$http.get(\"getTwocategories\").then(\r\n");
      out.write("\r\n");
      out.write("\t\tfunction(res) {\r\n");
      out.write("\t\t\t\tthis.twocategoryList = res.data;\r\n");
      out.write("\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\r\n");
      out.write("\t\t\tfunction(res) {\r\n");
      out.write("\t\t\t\t//请求失败\r\n");
      out.write("\t\t\t\tconsole.log(res);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
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
