package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class add_005fproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--[if lt IE 7 ]><html lang=\"en\" class=\"ie6 ielt7 ielt8 ielt9\"><![endif]--><!--[if IE 7 ]><html lang=\"en\" class=\"ie7 ielt8 ielt9\"><![endif]--><!--[if IE 8 ]><html lang=\"en\" class=\"ie8 ielt9\"><![endif]--><!--[if IE 9 ]><html lang=\"en\" class=\"ie9\"> <![endif]--><!--[if (gt IE 9)|!(IE)]><!--> \r\n");
      out.write("<html lang=\"en\"><!--<![endif]--> \r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top.jsp", out, false);
      out.write("\t\t\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div class=\"container\" id=\"aContainer\">\r\n");
      out.write("\t\t\te");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "left.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"span9\">\r\n");
      out.write("\t\t\t\t\t<h1>\r\n");
      out.write("\t\t\t\t\t\t新增商品\r\n");
      out.write("\t\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t\t<form id=\"uploadForm\" class=\"form-horizontal\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"control-label\" for=\"input01\">商品所属分类</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select v-model=\"selected\" @change=\"get(this.value)\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option v-for=\"item in categoryList\" :value=\"item.cid\">{{item.cname}}</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"control-label\" for=\"input01\">商品所属二级分类</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option v-for=\"(item,index) in twocategoryList\" :value=\"item.tcid\">{{item.tcname}}</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"control-label\" for=\"input01\">商品名称</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"input-xlarge\" id=\"pname\" name=\"pname\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"control-label\" for=\"input01\">商品价格</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"input-xlarge\" id=\"oldPrice\" name=\"oldPrice\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"control-label\" for=\"fileInput\">商品图片</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"input-file\" multiple=\"multiple\" id=\"imageFile\" name=\"imageFile\" type=\"file\" accept=\"image/*\" onchange=\"javascript:changeImg()\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"controls\" id=\"imgs\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"control-label\" for=\"input01\">商品库存</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"input-xlarge\" id=\"total\" name=\"total\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"control-label\" for=\"textarea\">商品描述</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t <div class=\"controls\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<textarea class=\"input-xlarge\" id=\"pdesc\" rows=\"20\" cols=\"30\" name=\"pdesc\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t \t\r\n");
      out.write("\t\t\t\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"control-label\" for=\"optionsCheckbox\">是否热门商品</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t&nbsp;<input type=\"radio\" name=\"isHot\" id=\"isHot\" value=\"1\"/>&nbsp;是&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t&nbsp;<input type=\"radio\" name=\"isHot\" id=\"isHot\" value=\"0\" checked=\"checked\" />&nbsp;否\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"control-label\" for=\"optionsCheckbox\">是否轮播图商品</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t&nbsp;<input type=\"radio\" name=\"isPic\" id=\"isPic\" value=\"1\"/>&nbsp;是&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t&nbsp;<input type=\"radio\" name=\"isPic\" id=\"isPic\" value=\"0\" checked=\"checked\" />&nbsp;否\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-actions\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\" onclick=\"javascript:addProduct();\">保存</button> \r\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"btn\" onclick=\"javascript:history.back();\">取消</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</body>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t\t//1、建立FckEditor的对象\r\n");
      out.write("\t\t\tvar ofckEditor=new FCKeditor(\"pdesc\");\r\n");
      out.write("\t\t\t//参数：是页面的TextArea的name属性\r\n");
      out.write("\t\t\t//2、设定路径\r\n");
      out.write("\t\t\tofckEditor.BasePath=\"../fckeditor/\";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//3、FckEditor的对象的属性（宽、高）\r\n");
      out.write("\t\t\tofckEditor.Height=800;\r\n");
      out.write("\t\t\tofckEditor.Width=530;\r\n");
      out.write("\t\t\t//4、利用该FckEditor的对象替换掉页面的TextArea\r\n");
      out.write("\t\t\tofckEditor.ReplaceTextarea();\r\n");
      out.write("\t\t\t\r\n");
      out.write("    \t});\r\n");
      out.write("    \t\r\n");
      out.write("    \t\r\n");
      out.write("\r\n");
      out.write("function addProduct(){\r\n");
      out.write("    \t\r\n");
      out.write("    \tvar params=new FormData($(\"#uploadForm\")[0]);\r\n");
      out.write("    \tvar oEditor=FCKeditorAPI.GetInstance(\"pdesc\");\r\n");
      out.write("    \tvar fcontent=oEditor.GetXHTML();\r\n");
      out.write("    \tparams.set(\"pdesc\",fcontent);\r\n");
      out.write("    \t$.ajax({\r\n");
      out.write("    \t\turl:\"/shop/admin/saveProduct\",\r\n");
      out.write("    \t    type:\"post\",\r\n");
      out.write("    \t  \tdata:params,\r\n");
      out.write("    \t   \tasync:false,\r\n");
      out.write("    \t   \tcache:false,\r\n");
      out.write("    \t   \tcontentType:false,\r\n");
      out.write("    \t   \tprocessData:false,\r\n");
      out.write("    \t   \tsuccess:function(data){\r\n");
      out.write("    \t   \t\talert(\"添加商品成功\");\r\n");
      out.write("    \t   }\r\n");
      out.write("    \t\r\n");
      out.write("    \t});\r\n");
      out.write("    \t\r\n");
      out.write("    \t}\r\n");
      out.write("    \t\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"../js/vue.min.js\"></script>\r\n");
      out.write("\t<script src=\"../js/vue-resource.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tvar tvue = new Vue({\r\n");
      out.write("\t\tel:\"#aContainer\",\r\n");
      out.write("\t\tdata:{\r\n");
      out.write("\t\t\tcategoryList:[],\r\n");
      out.write("\t\t\tselected:\"1\",\r\n");
      out.write("\t\t\ttwocategoryList:[]\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tmethods:{\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tcreated:function(){\r\n");
      out.write("\t\t\tthis.$http.get(\"getCategories\").then(\r\n");
      out.write("\t\t\tfunction(res){\r\n");
      out.write("\t\t\t\tthis.categoryList=res.data;\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tfunction(res){\r\n");
      out.write("\t\t\t\tconsole.log(res);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tthis.$http.post(\"getTwoCategoryByCid\",{\"cid\":this.selected},{emulateJSON:true}).then(\r\n");
      out.write("\t        function(res){\r\n");
      out.write("\t        \tthis.twocategoryList=res.data;\r\n");
      out.write("\t          },\r\n");
      out.write("\t          function(res){\r\n");
      out.write("\t          \tconsole.log(res);\r\n");
      out.write("\t          });\r\n");
      out.write("\t     }\r\n");
      out.write("\t});\r\n");
      out.write("</script>\t\r\n");
      out.write("    \r\n");
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
