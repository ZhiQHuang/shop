package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- 登录 注册 购物车... -->\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t<img src=\"img/logo2.png\" />\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"col-md-5\">\r\n");
      out.write("\t\t<img src=\"img/header.png\" />\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"col-md-3\" style=\"padding-top:20px\">\r\n");
      out.write("\t\t<ol class=\"list-inline\">\r\n");
      out.write("\t\t\t<li><a href=\"login\">登录</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"register\">注册</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"cart\">购物车</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"order_list\">我的订单</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"my_info\">会员中心</a></li>\r\n");
      out.write("\t\t</ol>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- 导航条 -->\r\n");
      out.write("<div class=\"container-fluid\" id=\"headContainer\">\r\n");
      out.write("\t<nav class=\"navbar navbar-inverse\">\r\n");
      out.write("\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t<!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"index\">首页</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav\" id=\"catList\">\r\n");
      out.write("\t\t\t\t\t<li :class=\"{'active':index==0}\" v-for=\"(item,index) in categoryList\"\r\n");
      out.write("\t\t\t\t\t@click=\"getCatProduct(item.cid)\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">{{item.cname}}</a></li>\t\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<form class=\"navbar-form navbar-right\" role=\"search\">\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" v-model=\"searchContent\" placeholder=\"请输入搜索内容\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\"  @click=\"searchProduct()\">提交</button>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/vue.min.js\"></script>\r\n");
      out.write("<script src=\"js/vue-resource.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("    var headvue=new Vue({\r\n");
      out.write("        el:'#headContainer',\r\n");
      out.write("        data:{\r\n");
      out.write("    \tcategoryList:[],\r\n");
      out.write("    \tsearchContent:\"\"\r\n");
      out.write("        },\r\n");
      out.write("        methods:{\r\n");
      out.write("            getCatProduct:function(cid){\r\n");
      out.write("           location.href=\"product_list?cid=\"+cid+\"&tcid=0\";\r\n");
      out.write("            },\r\n");
      out.write("            searchProduct:function(){\r\n");
      out.write("               var content=encodeURI(encodeURI(this.searchContent));\r\n");
      out.write("               location.href=\"serach_list?searchContent=\"+content;\r\n");
      out.write("                }\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("          },\r\n");
      out.write("            created:function(){\r\n");
      out.write("            \t//created代表当页面加载完成，立刻执行后面的方法\r\n");
      out.write("            \t//发生Ajax请求\r\n");
      out.write("            \tthis.$http.get(\"getcategories\").then(\r\n");
      out.write("            \t\t\tfunction(res){\r\n");
      out.write("            \t\t\t\t//请求成功\r\n");
      out.write("            \t\t\t\tthis.categoryList=res.data;\r\n");
      out.write("            },\r\n");
      out.write("            function(res){\r\n");
      out.write("            \t//请求失败\r\n");
      out.write("            \tconsole.log(res);\r\n");
      out.write("            });\r\n");
      out.write("            }\r\n");
      out.write("        \r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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
