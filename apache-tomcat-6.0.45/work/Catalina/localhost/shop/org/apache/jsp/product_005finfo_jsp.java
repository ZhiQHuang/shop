package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_005finfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>商品详情</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\" />\r\n");
      out.write("<script src=\"js/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/util.js\"></script>\r\n");
      out.write("<!-- 引入自定义css文件 style.css -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("\tmargin-top: 20px;\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".carousel-inner .item img {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 300px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- 引入header.jsp -->\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "daohang.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"pinfoContainer\" class=\"container\" style=\"width: 83%; float:right; background: url('img/regist_bg.jpg');\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"info-header\">\r\n");
      out.write("\t\t\t\t <ol class=\"breadcrumb info-header1\">\r\n");
      out.write("\t\t\t\t\t\t<li style=\"font-size: 18px;font-weight: bold;\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"index\" >首页</a>&nbsp;/&nbsp;\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" >{{pInfo.cname}}</a>&nbsp;/&nbsp;\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" >{{pInfo.pname}}</a></li>\r\n");
      out.write("\t\t\t\t\t</ol>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"info-body\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t<div id=\"carousel-example-generic\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("\t\t\t\t\t<!-- 轮播图的中的小点 -->\r\n");
      out.write("\t\t\t\t\t<ol class=\"carousel-indicators\" >\r\n");
      out.write("\t\t\t\t\t\t<li data-target=\"#carousel-example-generic\" v-for=\"(item,index) in images\" \r\n");
      out.write("\t\t\t\t\t\t   :class=\"{'active':index==0}\" :data-silde-to=\"index\"></li>\r\n");
      out.write("\t\t\t\t\t</ol>\r\n");
      out.write("\t\t\t\t\t<!-- 轮播图的轮播图片 -->\r\n");
      out.write("\t\t\t\t\t<div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"item\" :class=\"{'active pro-img-item':index==0}\" v-for=\"(item,index) in images\">\r\n");
      out.write("\t\t\t\t\t\t\t<img :src=\"item\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- 上一张 下一张按钮 -->\r\n");
      out.write("\t\t\t\t\t<a class=\"left carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"prev\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"sr-only\">Previous</span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<a class=\"right carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"next\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"sr-only\">Next</span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6 info-right\">\r\n");
      out.write("\t\t\t\t\t<div class=\"info-desc\">\r\n");
      out.write("\t\t\t\t\t\t<h4>{{pInfo.pname}}</h4>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"info-desc\">\r\n");
      out.write("\t\t\t\t\t\t现价: <strong style=\"color: #ef0101;\">\r\n");
      out.write("\t\t\t\t\t\t￥：{{pInfo.newPrice}}元</strong>\r\n");
      out.write("\t\t\t\t\t\t&nbsp; &nbsp;\r\n");
      out.write("\t\t\t\t\t\t原价：<del>\r\n");
      out.write("\t\t\t\t\t\t￥{{pInfo.oldPrice}}元</del>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"info-desc\">\r\n");
      out.write("\t\t\t\t\t\t<div>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t销量：{{pInfo.volume}}\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"info-desc\">\r\n");
      out.write("\t\t\t\t\t\t<div>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t库存：{{pInfo.total}}\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"info-desc\">\r\n");
      out.write("\t\t\t\t\t\t商品上市时间:{{pInfo.pdate}}\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"info-desc\">\r\n");
      out.write("\t\t\t\t\t\t购买数量: <input id=\"quantity\" name=\"quantity\" v-model=\"quantity\" min=\"1\"\r\n");
      out.write("\t\t\t\t\t\ttype=\"number\" value=\"1\" maxlength=\"4\" size=\"10\" type=\"text\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"info-desc-1\">\r\n");
      out.write("\t\t\t\t\t\t <img src=\"img/btn_cart.png\" @click=\"addCart()\"/>\r\n");
      out.write("\t\t\t\t\t\t &nbsp;\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t<div class=\"info-body\">\r\n");
      out.write("\t\t\t\t<div class=\"info-body-desc\">\r\n");
      out.write("\t\t\t\t\t<h3>商品介绍</h3>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"pro_desc\">\r\n");
      out.write("\t\t\t\t\t<h3>商品详情</h3>\r\n");
      out.write("\t\t\t\t\t{{pInfo.pdesc}}\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"info-body-desc\">\r\n");
      out.write("\t\t\t\t\t<h3>商品评论</h3>\r\n");
      out.write("\t\t\t\t\t<table class=\"table\">\r\n");
      out.write("\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t<tr class=\"active\" v-for=\"item in commentList\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>{{item.username}}</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>{{item.created}}</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>{{item.content}}</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- 引入footer.jsp -->\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"js/vue.min.js\"></script>\r\n");
      out.write("<script src=\"js/vue-resource.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("  var pinfovue=new Vue({\r\n");
      out.write("     el:'#pinfoContainer',\r\n");
      out.write("     data:{\r\n");
      out.write("       pInfo:{\r\n");
      out.write("         pname:\"\",\r\n");
      out.write("         cname:\"\",\r\n");
      out.write("         newPrice:0,\r\n");
      out.write("         oldPrice:0,\r\n");
      out.write("         total:0,\r\n");
      out.write("         volume:0,\r\n");
      out.write("         pdesc:\"\",\r\n");
      out.write("         pdate:\"\",\r\n");
      out.write("         image:\"\"\r\n");
      out.write("       },\r\n");
      out.write("       images:[],\r\n");
      out.write("       quantity:1,\r\n");
      out.write("       commentList:[]\r\n");
      out.write("       \r\n");
      out.write("     },\r\n");
      out.write("     methods:{\r\n");
      out.write("     addCart:function(){\r\n");
      out.write("        if (this.pInfo.total<=0) {\r\n");
      out.write("\t\t\talert(\"该商品已经卖光！\");\r\n");
      out.write("\t\t}else if(this.pInfo.total-this.quantity<0){\r\n");
      out.write("\t\t   alert(\"库存不足，请重新选择购买的数量！\");\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t  var subtotal=this.quantity*(this.pInfo.newPrice);\r\n");
      out.write("\t\t  var params={\r\n");
      out.write("\t\t     \"pid\":getQueryString(\"pid\"),\r\n");
      out.write("\t\t     \"count\":this.quantity,\r\n");
      out.write("\t\t     \"subtotal\":subtotal\r\n");
      out.write("\t\t  };\r\n");
      out.write("\t\t  this.$http.post(\"addCart\",params,{emulateJSON:true}).then(\r\n");
      out.write("\t\t      function(res){\r\n");
      out.write("\t\t        if(res.data.result==\"error\"){\r\n");
      out.write("\t\t           alert(\"您未登录，请先登录后再购买！\");\r\n");
      out.write("\t\t           location.href=\"login\";\r\n");
      out.write("\t\t        }else{\r\n");
      out.write("\t\t         alert(\"商品已加入购物车！\");\r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t      },\r\n");
      out.write("\t\t      function(res){\r\n");
      out.write("\t\t        console.log(res);\r\n");
      out.write("\t\t      }\r\n");
      out.write("\t\t  );\r\n");
      out.write("\t\t}\r\n");
      out.write("      }\r\n");
      out.write("     },\r\n");
      out.write("     created:function(){\r\n");
      out.write("       var params={\"pid\":getQueryString(\"pid\")};\r\n");
      out.write("       this.$http.post(\"getProductInfo\",params,{emulateJSON:true}).then(\r\n");
      out.write("          function(res){\r\n");
      out.write("          this.pInfo=res.data;\r\n");
      out.write("          var strs=new Array();\r\n");
      out.write("          strs=this.pInfo.image.split(\",\");\r\n");
      out.write("          for(var i = 0; i < strs.length; i++) {\r\n");
      out.write("\t\t\tstrs[i]=\"/pic/\"+strs[i];\r\n");
      out.write("\t\t}\r\n");
      out.write("          this.images=strs;\r\n");
      out.write("          this.pInfo.pdate=new Date(this.pInfo.pdate).format(\"yyyy年\");\r\n");
      out.write("          },\r\n");
      out.write("          function(res){\r\n");
      out.write("          console.log(res);\r\n");
      out.write("          }\r\n");
      out.write("       );\r\n");
      out.write("       this.$http.post(\"getProductComment\",params,{emulateJSON:true}).then(\r\n");
      out.write("           function(res){\r\n");
      out.write("             this.commentList=res.data;\r\n");
      out.write("             res.data.forEach(function(item){\r\n");
      out.write("                    item.created=new Date(item.created).format(\"yyyy年MM月dd日 hhh:mm:ss\");\r\n");
      out.write("             \r\n");
      out.write("             });\r\n");
      out.write("           },\r\n");
      out.write("         function(res){\r\n");
      out.write("         console.log(res);\r\n");
      out.write("         }\r\n");
      out.write("       );\r\n");
      out.write("     }\r\n");
      out.write("  });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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
