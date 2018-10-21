<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%
  String user=(String)session.getAttribute("user");
  if(user==null){
  response.sendRedirect("login.jsp");
  }
%>

