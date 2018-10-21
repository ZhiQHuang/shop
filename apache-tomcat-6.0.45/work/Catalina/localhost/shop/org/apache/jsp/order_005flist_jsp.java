package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class order_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t\t<title>订单列表</title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\" />\r\n");
      out.write("\t\t<script src=\"js/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script src=\"js/util.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<!-- 引入自定义css文件 style.css -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/zpageNav.css\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("\t\t<style>\r\n");
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
      out.write("\t\t<div class=\"container\" id=\"olistContainer\"\r\n");
      out.write("\t\t\tstyle=\"width: 100%; background: url('img/regist_bg.jpg');\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div style=\"margin: 0 auto; margin-top: 10px; width: 950px;\">\r\n");
      out.write("\t\t\t\t\t<h3>\r\n");
      out.write("\t\t\t\t\t\t<strong>我的订单</strong>\r\n");
      out.write("\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t<table class=\"table table-bordered\">\r\n");
      out.write("\t\t\t\t\t\t<tbody v-for=\"(item,index) in orderList\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr class=\"success\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<th colspan=\"5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t订单编号:{{item[0].oid}} &nbsp;订单时间：{{item[0].ordertime}}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t&nbsp;订单状态：{{item[0].state}} &nbsp;物流编号：{{item[0].number}}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button v-if=\"item[0].state == '未付款'\" @click=\"pay(item[0].oid, item[0].total)\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t付款\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr class=\"active\" v-for=\"o in item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img :src=\"o.image\" width=\"70\" height=\"60\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t@click=\"showDetail(o.pid)\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a target=\"_blank\" @click=\"showDetail(o.pid)\">{{o.pname}}</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t￥{{o.newPrice}}\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t{{o.count}}\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"subtotal\">￥{{o.subtotal}}</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr class=\"success\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<th colspan=\"5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button v-if=\"item[0].state == '交易成功'\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t@click=\"delOrder(item[0].oid)\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t删除订单\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button v-if=\"item[0].state == '已发货'\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t@click=\"confirmOrder(item[0].oid)\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t确认收货\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button v-if=\"item[0].state == '已收货'\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t@click=\"evaluateOrder(item[0].oid)\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t评价订单\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"width: 380px; margin: 0 auto; margin-top: 50px;\">\r\n");
      out.write("\t\t\t\t<zpagenav v-bind:page=\"page\" v-bind:page-size=\"pageSize\"\r\n");
      out.write("\t\t\t\t\tv-bind:total=\"total\" v-bind:max-page=\"maxPage\"\r\n");
      out.write("\t\t\t\t\tv-on:pagehandler=\"pageHandler\">\r\n");
      out.write("\t\t\t\t</zpagenav>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- 引入footer.jsp -->\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"js/vue.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/vue-resource.js\"></script>\r\n");
      out.write("\t<script src=\"js/zpageNav.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\tvar ordervue = new Vue({\r\n");
      out.write("\t\tel:\"#olistContainer\",\r\n");
      out.write("\t\tdata:{\r\n");
      out.write("\t\t\torderList:[],\r\n");
      out.write("\t\t\tpage:1,\r\n");
      out.write("\t\t\tpageSize:5,\r\n");
      out.write("\t\t\ttotal:100,\r\n");
      out.write("\t\t\tmaxPage:9,\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tmethods:{\r\n");
      out.write("\t\t\tpageHandler:function(page){\r\n");
      out.write("\t\t\t\tthis.page=page;\r\n");
      out.write("\t\t\t\tvar params = {\"page\":page, \"row\":this.pageSize};\r\n");
      out.write("\t\t\t\tthis.$http.post(\"getOrderlistByUid\", params,{emulateJSON:true}).then(\r\n");
      out.write("\t\t\t\t\tfunction(res){\r\n");
      out.write("\t\t\t\t\t\tthis.orderList=res.data.list;\r\n");
      out.write("\t\t\t\t\t\tfor(var i=0;i<this.orderList.length;i++){\r\n");
      out.write("\t\t\t\t\t\t\tfor(var j=0; j<this.orderList[i].length; j++){\r\n");
      out.write("\t\t\t\t\t\t\t\tthis.orderList[i][j].ordertime = new Date(this.orderList[i][j].ordertime).format(\"yyyy年MM月dd日 hh:mm:ss\");\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tthis.total=res.data.total;\r\n");
      out.write("\t\t\t\t\t\tthis.maxPage=res.data.pages;\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tfunction(res){\r\n");
      out.write("\t\t\t\t\t\tconsole.log(res);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t);\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tshowDetail:function(pid){\r\n");
      out.write("\t\t\t\tlocation.href=\"product_info?pid=\"+pid;\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tpay:function(oid, total){\r\n");
      out.write("\t\t\t\tlocation.href=\"order_info?oid=\"+oid+\"&total=\"+total;\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tevaluateOrder:function(oid){\r\n");
      out.write("\t\t\t\tlocation.href=\"order_eval?oid=\"+oid;\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tconfirmOrder:function(oid){\r\n");
      out.write("\t\t\t\tthis.$http.post(\"confirmOrder\",{\"oid\":oid},{emulateJSON:true}).then(\r\n");
      out.write("\t\t\t\tfunction(res){\r\n");
      out.write("\t\t\t\t\tlocation.href=\"order_list\";\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tfunction(res){\r\n");
      out.write("\t\t\t\t\tconsole.log(res);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tdelOrder:function(oid){\r\n");
      out.write("\t\t\t\tthis.$http.post(\"delOrder\",{\"oid\":oid},{emulateJSON:true}).then(\r\n");
      out.write("\t\t\t\tfunction(res){\r\n");
      out.write("\t\t\t\t\tlocation.href=\"order_list\";\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tfunction(res){\r\n");
      out.write("\t\t\t\t\tconsole.log(res);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tcreated:function(){\r\n");
      out.write("\t\t\tthis.pageHandler(1);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
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
