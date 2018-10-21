package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>商品列表</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\" />\r\n");
      out.write("<script src=\"js/jquery-1.11.3.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/util.js\"></script>\r\n");
      out.write("<!-- 引入自定义css文件 style.css -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style1.css\" type=\"text/css\" />\r\n");
      out.write("<link href=\"css/zpageNav.css\" rel=\"stylesheet\"/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- 引入header.jsp -->\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "daohang.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\" id=\"plistContainer\" style=\"width: 100%; background: url('img/regist_bg.jpg');\">\r\n");
      out.write("    \r\n");
      out.write("\t<div class=\"row plist\" style=\"width: 83%; float:right;background: url('img/regist_bg.jpg');\">\r\n");
      out.write("\t\t<div class=\"col-md-12\" style=\"text-align: left;\">\r\n");
      out.write("\t\t\t<ol class=\"breadcrumb\">\r\n");
      out.write("\t\t\t\t<li style=\"font-size: 20px;font-weight: bold;\">\r\n");
      out.write("\t\t\t\t\t<a href=\"index\" >首页</a>/\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" ><span >{{cname}}</span></a>/\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" ><span >{{scname}}</span></a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ol>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"plist\">\r\n");
      out.write("\t\t<div class=\"col-md-2\" v-for=\"item in productList\" @click=\"showDetail(item.pid)\">\r\n");
      out.write("\t\t\t<a href=\"#\"> <img :src=\"item.image\"\r\n");
      out.write("\t\t\t\twidth=\"200\" height=\"200\" style=\"display: inline-block;\">\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<p></p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t<a href=\"#\" style='font-weight: bold;'>{{item.pname}}</a>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p></p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t<font color=\"#FF0000\">商城价：&yen;{{item.newPrice}}</font>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!--分页 -->\r\n");
      out.write("\t<div style=\"width: 380px; margin: 0 auto; margin-top: 50px;\">\r\n");
      out.write("\t\t<zpagenav v-bind:page=\"page\" v-bind:page-size=\"pageSize\" v-bind:total=\"total\" v-bind:max-page=\"maxPage\" v-on:pagehandler=\"pageHandler\"><zpagenav>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 分页结束 -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 引入footer.jsp -->\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/vue.min.js\"></script>\r\n");
      out.write("<script src=\"js/vue-resource.js\"></script>\r\n");
      out.write("<script src=\"js/zpageNav.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    var headvue=new Vue({\r\n");
      out.write("      el:'#plistContainer',\r\n");
      out.write("      data:{\r\n");
      out.write("         productList:[],\r\n");
      out.write("         page:1,\r\n");
      out.write("         pageSize:10,\r\n");
      out.write("         total:100,\r\n");
      out.write("         maxPage:9,\r\n");
      out.write("         cname:\"\",\r\n");
      out.write("         scname:\"\"\r\n");
      out.write("      },\r\n");
      out.write("      methods:{\r\n");
      out.write("         pageHandler:function(page){\r\n");
      out.write("           this.page=page;\r\n");
      out.write("           var params={\"page\":page,\"row\":this.pageSize,\"cid\":getQueryString(\"cid\"),\"tcid\":getQueryString(\"tcid\")};\r\n");
      out.write("           this.$http.post(\"getCatProducts\",params,{emulateJSON:true}).then(\r\n");
      out.write("              function(res){\r\n");
      out.write("                this.productList=res.data.list;\r\n");
      out.write("                this.total=res.data.total;\r\n");
      out.write("                this.maxPage=res.data.pages;\r\n");
      out.write("              },\r\n");
      out.write("              function(res){\r\n");
      out.write("              \r\n");
      out.write("               console.log(res);\r\n");
      out.write("               \r\n");
      out.write("              } );\r\n");
      out.write("         },\r\n");
      out.write("         showDetail:function(pid){\r\n");
      out.write("            location.href=\"product_info?pid=\"+pid;\r\n");
      out.write("         }\r\n");
      out.write("      },\r\n");
      out.write("      created:function(){\r\n");
      out.write("         this.pageHandler(1);\r\n");
      out.write("         var tcid=parseInt(getQueryString(\"tcid\"));\r\n");
      out.write("          var params={\"cid\":getQueryString(\"cid\"),\"tcid\":tcid};\r\n");
      out.write("         this.$http.post(\"getCnameAndScname\",params,{emulateJSON:true}).then(\r\n");
      out.write("\t\t\tfunction(res) {\r\n");
      out.write("\t\t\t\tthis.cname = res.data.cname;\r\n");
      out.write("\t\t\t\tif(tcid!=0){\r\n");
      out.write("\t\t\t\t\tthis.scname = res.data.scname;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}, function(res) {\r\n");
      out.write("\t\t\t\tconsole.log(res);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("      }\r\n");
      out.write("    });\r\n");
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
