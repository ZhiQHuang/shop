package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class twocategory_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("i\r\n");
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--[if lt IE 7 ]><html lang=\"en\" class=\"ie6 ielt7 ielt8 ielt9\"><![endif]--><!--[if IE 7 ]><html lang=\"en\" class=\"ie7 ielt8 ielt9\"><![endif]--><!--[if IE 8 ]><html lang=\"en\" class=\"ie8 ielt9\"><![endif]--><!--[if IE 9 ]><html lang=\"en\" class=\"ie9\"> <![endif]--><!--[if (gt IE 9)|!(IE)]><!--> \r\n");
      out.write("<html lang=\"en\"><!--<![endif]--> \r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../css/zpageNav.css\" />\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "left.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"span9\"  id=\"tContainer\">\r\n");
      out.write("\t\t\t\t\t<h1>\r\n");
      out.write("\t\t\t\t\t\t商品二级分类列表\r\n");
      out.write("\t\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" v-model=\"searchContent\" placeholder=\"请输入搜索内容\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" style=\"position: absolute;height: -15px;\" @click=\"searchTc()\">搜索</button>\r\n");
      out.write("\t\t\t\t\t<table class=\"table table-bordered table-striped\">\r\n");
      out.write("\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t序号\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t分类名称\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t类型\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t操作\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t<tbody v-for=\"(item,index) in twocategoryList\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t{{index+1}}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t{{item.tcname}}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t{{item.cname}}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"link-update\" href=\"javascript:;\" @click=\"modify(item.tcid)\">修改</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"link-update\" href=\"javascript:;\" @click=\"del(item.tcid)\">删除</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div style=\"width: 380px; margin: 0 auto; margin-top: 50px;\">\r\n");
      out.write("\t\t\t\t\t\t<zpagenav v-bind:page=\"page\" v-bind:page-size=\"pageSize\" v-bind:total=\"total\" v-bind:max-page=\"maxPage\"\r\n");
      out.write("\t\t\t\t\t\tv-on:pagehandler=\"pageHandler\">\r\n");
      out.write("\t\t\t\t\t\t</zpagenav>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<a class=\"toggle-link\" href=\"#form\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-plus\"></i> 新增商品二级分类</a>\r\n");
      out.write("\t\t\t\t\t<form id=\"form\" class=\"form-horizontal hidden\">\r\n");
      out.write("\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t<legend>新增二级商品分类</legend>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"control-label\" for=\"input01\">商品二级分类名称</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\"  v-model=\"tcname\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"control-label\" for=\"input01\">分类类型</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select v-model=\"selected\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option v-for=\"item in categoryList\" :value=\"item.cid\">{{item.cname}}</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-actions\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"btn btn-primary\" href=\"javascript:;\" @click=\"insert()\">创建</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"btn\">取消</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</body>\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"../js/vue.min.js\"></script>\r\n");
      out.write("\t<script src=\"../js/vue-resource.js\"></script>\r\n");
      out.write("\t<script src=\"../js/zpageNav.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tvar tvue = new Vue({\r\n");
      out.write("\t\tel:\"#tContainer\",\r\n");
      out.write("\t\tdata:{\r\n");
      out.write("\t\t\ttwocategoryList:[],\r\n");
      out.write("\t\t\tpage:1,\r\n");
      out.write("\t\t\tpageSize:7,\r\n");
      out.write("\t\t\ttotal:100,\r\n");
      out.write("\t\t\tmaxPage:9,\r\n");
      out.write("\t\t\ttcname:\"\",\r\n");
      out.write("\t\t\tcategoryList:[],\r\n");
      out.write("\t\t\tselected:\"\",\r\n");
      out.write("\t\t\ttcp:[],\r\n");
      out.write("\t\t\tsearchContent:\"\"\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tmethods:{\r\n");
      out.write("\t\t\tpageHandler:function(page){\r\n");
      out.write("\t\t\t\tthis.page=page;\r\n");
      out.write("\t\t\t\tvar params = {\"page\":page, \"row\":this.pageSize};\r\n");
      out.write("\t\t\t\tthis.$http.post(\"getTwoCategories\", params,{emulateJSON:true}).then(\r\n");
      out.write("\t\t\t\t\tfunction(res){\r\n");
      out.write("\t\t\t\t\t\tthis.twocategoryList=res.data.list;\r\n");
      out.write("\t\t\t\t\t\tthis.maxPage=res.data.pages;\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tfunction(res){\r\n");
      out.write("\t\t\t\t\t\tconsole.log(res);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t);\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tdel:function(tcid){\r\n");
      out.write("\t\t\t\tthis.$http.post(\"deleteTwoCategories\",{\"tcid\":tcid},{emulateJSON:true}).then(\r\n");
      out.write("\t\t\t\tfunction(res){\r\n");
      out.write("\t\t\t\t\talert(\"删除成功！\");\r\n");
      out.write("\t\t\t\t\twindow.location.reload(true);\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tfunction(res){\r\n");
      out.write("\t\t\t\t\tconsole.log(res);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tinsert:function(){\r\n");
      out.write("\t\t\t\tvar params = {\"tcname\":this.tcname,\"cid\":this.selected};\r\n");
      out.write("\t\t\t\tthis.$http.post(\"insertTwoCategories\",params,{emulateJSON:true}).then(\r\n");
      out.write("\t\t\t\tfunction(res){\r\n");
      out.write("\t\t\t\t\talert(\"添加成功！\");\r\n");
      out.write("\t\t\t\t\twindow.location.reload(true);\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tfunction(res){\r\n");
      out.write("\t\t\t\t\tconsole.log(res);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tmodify:function(tcid){\r\n");
      out.write("\t\t\t\tlocation.href=\"edit_twocategory?tcid=\"+tcid;\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tsearchTc:function(){\r\n");
      out.write("\t\t\t\tvar content = encodeURI(encodeURI(this.searchContent));\r\n");
      out.write("\t\t\t\tlocation.href=\"searchtc_list?searchContent=\"+content;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tcreated:function(){\r\n");
      out.write("\t\t\tthis.pageHandler(1);\r\n");
      out.write("\t\t\tthis.$http.get(\"getCategories\").then(\r\n");
      out.write("\t\t\tfunction(res){\r\n");
      out.write("\t\t\t\tthis.categoryList=res.data;\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tfunction(res){\r\n");
      out.write("\t\t\t\tconsole.log(res);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tthis.$http.post(\"getTwoCategoryByTcid\",{\"tcid\":getQueryString(\"tcid\")},{emulateJSON:true}).then(\r\n");
      out.write("\t        function(res){\r\n");
      out.write("\t        \tthis.tcp=res.data;\r\n");
      out.write("\t          },\r\n");
      out.write("\t          function(res){\r\n");
      out.write("\t          \tconsole.log(res);\r\n");
      out.write("\t          }\r\n");
      out.write("\t       );\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("</script>\t\r\n");
      out.write("</html>\r\n");
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
