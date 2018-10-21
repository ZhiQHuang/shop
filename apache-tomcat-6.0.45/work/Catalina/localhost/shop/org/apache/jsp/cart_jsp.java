package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/isLogin.jsp");
  }

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

      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');

String user = (String) session.getAttribute("user");
if(user==null){
	response.sendRedirect("login.jsp");
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t\t<title>商城购物车</title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\" />\r\n");
      out.write("\t\t<script src=\"js/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<!-- 引入自定义css文件 style.css -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" />\r\n");
      out.write("\t\t<style>\r\n");
      out.write("\t\t\tbody {\r\n");
      out.write("\t\t\t\tmargin-top: 20px;\r\n");
      out.write("\t\t\t\tmargin: 0 auto;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t.carousel-inner .item img {\r\n");
      out.write("\t\t\t\twidth: 100%;\r\n");
      out.write("\t\t\t\theight: 300px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfont {\r\n");
      out.write("\t\t\t\tcolor: #3164af;\r\n");
      out.write("\t\t\t\tfont-size: 18px;\r\n");
      out.write("\t\t\t\tfont-weight: normal;\r\n");
      out.write("\t\t\t\tpadding: 0 10px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<!-- 引入header.jsp -->\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"container\" id=\"cartContainer\" style=\"width: 100%; background: url('img/regist_bg.jpg');\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div style=\"margin:0 auto; margin-top:10px;width:950px;\">\r\n");
      out.write("\t\t\t\t\t<div style=\"width:100%;font-size:20px;margin:10px 0px;height:50px;background-color: #d3d3d3;\">\r\n");
      out.write("\t\t\t\t\t<div style=\"line-height:50px;margin:10px;\"><strong>购物车</strong></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<table class=\"table table-bordered\">\r\n");
      out.write("\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tr class=\"warning\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<th width=\"7%\">选择</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th width=\"20%\">图片</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th width=\"20%\">商品</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th width=\"20%\">价格</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th width=\"10%\">数量</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th width=\"15%\">小计</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th width=\"7%\">操作</th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t<tr class=\"active\" v-for=\"(item,index) in cartList\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"selectList\" :id=\"item.sid\" :value=\"index\" v-model=\"selectList\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img :src=\"item.image\" width=\"70\" height=\"60\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" target=\"_blank\"> {{item.pname}}</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t￥{{item.newPrice}}\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"number\" name=\"quantity\" :value=\"item.count\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\tmin=\"1\" maxlength=\"4\" size=\"10\" @change=\"changeNumber(item,$event)\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"subtotal\">￥{{item.newPrice*item.count}}</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"javascript:;\" class=\"delete\" @click=\"deleteItem(item,index)\">删除</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div style=\"margin-right:130px;\">\r\n");
      out.write("\t\t\t\t<div style=\"text-align:right;\">\r\n");
      out.write("\t\t\t\t\t&nbsp; \r\n");
      out.write("\t\t\t总金额: <strong style=\"color:#ff6600;\">￥{{total}}元</strong>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div style=\"text-align:right;margin-top:10px;margin-bottom:10px;\">\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:;\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" width=\"100\" value=\"提交订单\" @click=\"submitOrder()\" name=\"submit\" border=\"0\" style=\"background: url('img/register.gif') no-repeat scroll 0 0 rgba(0, 0, 0, 0);\r\n");
      out.write("\t\t\t\t\t\theight:35px;width:100px;color:white;\">\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- 引入footer.jsp -->\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/vue.min.js\"></script>\r\n");
      out.write("<script src=\"js/vue-resource.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tvar cartvue=new Vue({\r\n");
      out.write("\t\tel:'#cartContainer',\r\n");
      out.write("\t\tdata:{\r\n");
      out.write("\t\t\tcartList:[],\r\n");
      out.write("\t\t\tselectList:[]\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tcomputed:{\r\n");
      out.write("\t\t\ttotal:function(){\r\n");
      out.write("\t\t\t\tvar sum=0;\r\n");
      out.write("\t\t\t\tvar len=this.selectList.length;\r\n");
      out.write("\t\t\t\tfor(var i=0;i<len;i++){\r\n");
      out.write("\t\t\t\t\tvar index=this.selectList[i];\r\n");
      out.write("\t\t\t\t\tvar item=this.cartList[index];\r\n");
      out.write("\t\t\t\t\tif(item){\r\n");
      out.write("\t\t\t\t\t\tsum+=item.newPrice*item.count;\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\tcontinue;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\treturn sum;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tmethods:{\r\n");
      out.write("\t\t\tchangeNumber:function(item,event){\r\n");
      out.write("\t\t\t\tvar obj=$(event.target);\r\n");
      out.write("\t\t\t\titem.count=obj.val();\r\n");
      out.write("\t\t\t\titem.subtotal=item.newPrice*item.count;\r\n");
      out.write("\t\t\t\tthis.$http.post(\"changeShopCart\",item,{emulateJSON:true}).then(\r\n");
      out.write("\t\t\t\tfunction(res){},\r\n");
      out.write("\t\t\t\tfunction(res){\r\n");
      out.write("\t\t\t\t\tconsole.log(res);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tdeleteItem:function(item,index){\r\n");
      out.write("\t\t\t\tif(confirm(\"您确认要删除该商品吗？\")){\r\n");
      out.write("\t\t\t\t\tthis.cartList.splice(index,1);\r\n");
      out.write("\t\t\t\t\tthis.$http.post(\"deleteShopCart\",{\"sid\":item.sid},{emulateJSON:true}).then(\r\n");
      out.write("\t\t\t\t\tfunction(res){\r\n");
      out.write("\t\t\t\t\t\talert(\"删除成功！\");\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tfunction(res){\r\n");
      out.write("\t\t\t\t\t\tconsole.log(res);\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tsubmitOrder:function(){\r\n");
      out.write("\t\t\t\tif(confirm(\"您确认要提交订单吗？\")){\r\n");
      out.write("\t\t\t\t\tvar cartIds=new Array();\r\n");
      out.write("\t\t\t\t\tvar len=this.selectList.length;\r\n");
      out.write("\t\t\t\t\tfor(var i=0;i<len;i++){\r\n");
      out.write("\t\t\t\t\t\tvar index=this.selectList[i];\r\n");
      out.write("\t\t\t\t\t\tvar item=this.cartList[index];\r\n");
      out.write("\t\t\t\t\t\tif(item){\r\n");
      out.write("\t\t\t\t\t\t\tcartIds.push(item.sid);\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\tcontinue;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tvar params={\"total\":this.total,\"cartIds\":cartIds};\r\n");
      out.write("\t\t\t\t\tthis.$http.post(\"submitOrder\",params,{emulateJSON:true}).then(\r\n");
      out.write("\t\t\t\t\tfunction(res){\r\n");
      out.write("\t\t\t\t\t\tlocation.href=\"order_info?oid=\"+res.data.result+\"&total=\"+this.total;\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tfunction(res){\r\n");
      out.write("\t\t\t\t\t\tconsole.log(res);\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tcreated:function(){\r\n");
      out.write("\t\t\tthis.$http.get(\"getShopCart\").then(\r\n");
      out.write("\t\t\tfunction(res){\r\n");
      out.write("\t\t\t\tthis.cartList=res.data;\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tfunction(res){\r\n");
      out.write("\t\t\t\tconsole.log(res);\r\n");
      out.write("\t\t\t});\r\n");
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
