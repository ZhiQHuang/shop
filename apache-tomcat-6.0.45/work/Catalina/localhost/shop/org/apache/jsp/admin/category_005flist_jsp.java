package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class category_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Stict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-\r\n");
      out.write("strict.dtd\">\r\n");
      out.write("<html lang = \"zh-CN\">\r\n");
      out.write("\r\n");
      out.write("\t<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t<script src=\"../js/jquery-1.11.3.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script src=\"../js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div class=\"container\" id=\"categoryContainer\">\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "left.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"span9\">\r\n");
      out.write("\t\t\t\t\t<h1>\r\n");
      out.write("\t\t\t\t\t\t商品分类列表\r\n");
      out.write("\t\t\t\t\t</h1>\r\n");
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
      out.write("\t\t\t\t\t\t\t\t\t操作\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr >\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr v-for=\"(item,index) in categoryList\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t{{index+1}}\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t{{item.cname}}\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t  \t<a class=\"link-update\" @click=\"javascript:modify(item.cid)\">修改</a>\r\n");
      out.write("\t\t\t\t\t\t\t     <a class=\"link-del\"  @click=\"javascript:del(item.cid)\"> 删除</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr >\r\n");
      out.write("\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"keyname\" v-model=\"name\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\" @click=\"javascript:find();\">一级分类查找</button>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"pagination\">\r\n");
      out.write("\t\t\t\t\t\t<ul id=\"pagination1\"></ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<a class=\"toggle-link\" href=\"#form\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-plus\"></i> 新增商品分类</a>\r\n");
      out.write("\t\t\t\t\t<form id=\"form\" class=\"form-horizontal hidden\">\r\n");
      out.write("\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t<legend>新增商品分类</legend>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"control-label\" for=\"input01\">商品分类名称</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"input-xlarge\" id=\"cname\" v-model=\"cname\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-actions\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\" @click=\"javascript:insert();\">创建</button> \r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"btn\">取消</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</body>\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"../js/vue.min.js\"></script>\r\n");
      out.write("<script src=\"../js/vue-resource.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var pinfovue=new Vue({\r\n");
      out.write("\tel:'#categoryContainer',\r\n");
      out.write("\tdata:{\r\n");
      out.write("\tcategoryList:[],\r\n");
      out.write("\tcname:\"\",\r\n");
      out.write("\tname:\"\",\r\n");
      out.write("\tselectList:[],\r\n");
      out.write("\tbeforecname:\"\"\r\n");
      out.write("},\r\n");
      out.write("methods:{\r\n");
      out.write("\tdel:function(cid){\r\n");
      out.write("\t this.$http.post(\"deleteCategories\",{\"cid\":cid},{emulateJSON:true}).then(\r\n");
      out.write("   \t\t  function(res){\r\n");
      out.write("   \t\t\t alert(\"删除成功！\");\r\n");
      out.write("\t           window.location.reload(true);\r\n");
      out.write("                 \r\n");
      out.write("                 },\r\n");
      out.write("             function(res){\r\n");
      out.write("                     console.log(res);\r\n");
      out.write("                 }); \r\n");
      out.write("\r\n");
      out.write("},\r\n");
      out.write("insert:function(){\r\n");
      out.write("\t this.$http.post(\"insertCategories\",{\"cname\":this.cname},{emulateJSON:true}).then(\r\n");
      out.write("\t   \t\t  function(res){\r\n");
      out.write("\t   \t\t\t alert(\"添加成功！\");\r\n");
      out.write("\t\t           window.location.reload(true);\r\n");
      out.write("\t                 \r\n");
      out.write("\t                 },\r\n");
      out.write("\t             function(res){\r\n");
      out.write("\t                     console.log(res);\r\n");
      out.write("\t                 }); \r\n");
      out.write("\r\n");
      out.write("\t},\r\n");
      out.write("\tfind:function(){\r\n");
      out.write("\t\t this.$http.post(\"findCategories\",{\"cname\":this.name},{emulateJSON:true}).then(\r\n");
      out.write("\t\t   \t\t  function(res){\r\n");
      out.write("\t\t   \t\t\tthis.selectList=res.data;\r\n");
      out.write("\t\t   \t\t\tif(this.selectList.length>0){\r\n");
      out.write("\t\t   \t\t\t\twindow.location.reload(true);\r\n");
      out.write("\t\t   \t\t\t\talert(\"查找成功！\");\r\n");
      out.write("\t\t                var truename=encodeURI(encodeURI(this.name));\r\n");
      out.write("\t\t   \t\t\t location.href=\"search_category?cname=\"+truename;\r\n");
      out.write("\t\t\t   \t\t\t}else{\r\n");
      out.write("\t\t\t   \t\t\t\talert(\"没有匹配的目录！\");\r\n");
      out.write("\t\t\t\t   \t\t\t}\r\n");
      out.write("\t\t          \r\n");
      out.write("\t\t                 \r\n");
      out.write("\t\t                 },\r\n");
      out.write("\t\t             function(res){\r\n");
      out.write("\t\t                     console.log(res);\r\n");
      out.write("\t\t                 }); \r\n");
      out.write("\r\n");
      out.write("\t\t},\r\n");
      out.write("modify:function(cid){\r\n");
      out.write("\r\n");
      out.write("\t\t\t  location.href=\"edit_category?cid=\"+cid;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t \r\n");
      out.write("\r\n");
      out.write("}     \r\n");
      out.write("},\r\n");
      out.write("created:function(){\r\n");
      out.write("\r\n");
      out.write("\t//created代表当页面加载完成，立刻执行后面的方法\r\n");
      out.write("\t//发生Ajax请求\r\n");
      out.write("\tthis.$http.get(\"getCategories\").then(\r\n");
      out.write("\t\t\tfunction(res){\r\n");
      out.write("\t\t\t\t//请求成功\r\n");
      out.write("\t\t\t\tthis.categoryList=res.data;\r\n");
      out.write("},\r\n");
      out.write("function(res){\r\n");
      out.write("\t//请求失败\r\n");
      out.write("\tconsole.log(res);\r\n");
      out.write("});\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("}\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
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
