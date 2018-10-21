package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>会员登录</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\" />\r\n");
      out.write("<script src=\"js/jquery-1.11.3.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
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
      out.write("\r\n");
      out.write(".container .row div {\r\n");
      out.write("\t/* position:relative;\r\n");
      out.write("\t\t\t\t float:left; */\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("font {\r\n");
      out.write("\tcolor: #666;\r\n");
      out.write("\tfont-size: 22px;\r\n");
      out.write("\tfont-weight: normal;\r\n");
      out.write("\tpadding-right: 17px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- 引入header.jsp -->\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\" id=\"loginContainer\"\r\n");
      out.write("\t\tstyle=\"width: 100%; height: 460px; background: #FF2C4C url('img/loginbg.jpg') no-repeat;\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-7\">\r\n");
      out.write("\t\t\t\t<!--<img src=\"./image/login.jpg\" width=\"500\" height=\"330\" alt=\"会员登录\" title=\"会员登录\">-->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-md-5\">\r\n");
      out.write("\t\t\t\t<div style=\"width: 440px; border: 1px solid #E7E7E7; padding: 20px 0 20px 30px; border-radius: 5px; margin-top: 60px; background: #fff;\">\r\n");
      out.write("\t\t\t\t\t<font>会员登录</font>USER LOGIN\r\n");
      out.write("\t\t\t\t\t<div>&nbsp;</div>\r\n");
      out.write("\t\t\t\t\t<form class=\"form-horizontal\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"username\" class=\"col-sm-2 control-label\">用户ID</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"uid\" name=\"uid\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tv-model=\"user.uid\" placeholder=\"请输入用户ID\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-sm-2 control-label\">密码</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tv-model=\"user.password\" placeholder=\"请输入密码\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-sm-2 control-label\">验证码</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"checkcode\" name=\"checkcode\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"验证码\" v-model=\"checkcode\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img :src=\"imagSrc\" @click=\"changeCheckcode()\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"inputPassword3\" class=\"col-sm-2 control-label\"></label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-6\" id=\"checkResult\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-offset-2 col-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"button\" width=\"100\" value=\"登录\" name=\"submit\"@click=\"userLogin()\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"background: url('img/login.gif') no-repeat scroll 0 0 rgba(0, 0, 0, 0); height: 35px; width: 100px; color: white;\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- 引入footer.jsp -->\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"js/vue.min.js\"></script>\r\n");
      out.write("<script src=\"js/vue-resource.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("var loginvue=new Vue({\r\n");
      out.write("\tel:'#loginContainer',\r\n");
      out.write("\tdata:{\r\n");
      out.write("\tuser:{\r\n");
      out.write("\tuid:\"\",\r\n");
      out.write("\tpassword:\"\"\r\n");
      out.write("\t\r\n");
      out.write("},\r\n");
      out.write("\tcheckcode:\"\",\r\n");
      out.write("\timagSrc:\"VerifyCode\"\r\n");
      out.write("},\r\n");
      out.write("methods:{\r\n");
      out.write("\r\n");
      out.write("userLogin:function(){\r\n");
      out.write("\t//created代表当页面加载完成，立刻执行后面的方法\r\n");
      out.write("\tvar params={\"uid\":this.user.uid,\"password\":this.user.password,\r\n");
      out.write("\t\t\t\"checkcode\":this.checkcode};\r\n");
      out.write("\t\r\n");
      out.write("\tthis.$http.post(\"checkUserLogin\",params,{emulateJSON:true}).then(\r\n");
      out.write("\t\t\tfunction(res){\r\n");
      out.write("\t\t\t\tif(res.data.result==\"ok\"){\r\n");
      out.write("\t\t\t\t\talert(\"登录成功\");\r\n");
      out.write("\t\t\t\t\thistory.back();//返回上一页面\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\talert(\"您输入的信息有误，请重新输入\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("function(res){\r\n");
      out.write("\tconsole.log(res);\r\n");
      out.write("}\r\n");
      out.write("\t\t\t);\r\n");
      out.write("},\r\n");
      out.write("changeCheckcode:function(){\r\n");
      out.write("\t//更换验证码\r\n");
      out.write("\tvar str=this.imagSrc;\r\n");
      out.write("\tthis.imagSrc=str+\"?\"+new Date();\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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
