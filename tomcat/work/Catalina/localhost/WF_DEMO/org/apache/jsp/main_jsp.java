/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2019-05-21 01:48:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import wingsoft.core.start.WebInitServlet;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("wingsoft.core.start.WebInitServlet");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("\r\n");
if(session.getAttribute("userContextStr") == null){response.sendRedirect("login.html");return;}
String debugWFServerName = request.getParameter("debug");
if (!"json".equals(WebInitServlet.startMode) && debugWFServerName!=null) {
	WebInitServlet.wfServerName = debugWFServerName;
	WebInitServlet.prjId = debugWFServerName;
}

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<div id=\"sys_abc\" style=\"display:none\">");
      out.print(session.getAttribute("userId") );
      out.write("</div>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html;charset=UTF-8\"/>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style/all.css\"/> \r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/tree.css\"/> \r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style/home.css\" />\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"core/all.js?v=1092\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    loadAppJS('");
      out.print(WebInitServlet.appWinTypes);
      out.write("');//加载js\r\n");
      out.write("    var validateFirstLogin = function(){\r\n");
      out.write("        var over = false;\r\n");
      out.write("        if($(\"#changePass\").css(\"display\") == \"none\"){\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                type: \"POST\",\r\n");
      out.write("                async: false,\r\n");
      out.write("                url: \"loginAction_validateFirstLogin.action\",\r\n");
      out.write("                dataType: \"text\",\r\n");
      out.write("                success:function(data){\r\n");
      out.write("                \tif(data == \"false\"){\r\n");
      out.write("                        over = true;\r\n");
      out.write("                    }else{\r\n");
      out.write("                        $.changePass(true);\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("        if(!over){\r\n");
      out.write("            setTimeout(\"validateFirstLogin()\",1000);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    };\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"img/new-img/lo.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<title>复翼软件开发平台</title>\r\n");
      out.write("<!--validateFirstLogin();-->\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-image:url('img/new-img/mbg.jpg')\" onLoad=\"MM_preloadImages('img/new-img/man2.jpg');\">\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("<!-- 横幅  -->\r\n");
      out.write("\r\n");
      out.write("<div style=\"background-image: url('img/new-img/top_bg.jpg');width:100%;height:70px\" id=\"headpic\"> \r\n");
      out.write("<table width=\"100%\"  border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td width=\"80\" align=\"center\" style=\"height:70px\"><a href=\"#\"><img src=\"img/pass.png\" width=\"32\" height=\"32\" border=\"0\" \r\n");
      out.write("\t onclick=\"$.changePass()\"></a></td>\r\n");
      out.write("    <td width=\"80\" align=\"center\"><a href=\"#\"><img src=\"img/exit.png\" width=\"37\" height=\"37\" border=\"0\" \r\n");
      out.write("\t   onclick=\" if(confirm('确定要退出系统吗？')) window.location='logout.jsp'\"></a></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- 工具栏 -->\r\n");
      out.write("<div id=\"toolbar\" mVarShowed=\"y\" style=\"display:none\"></div>\r\n");
      out.write("<!-- 主菜单 -->\r\n");
      out.write("<div id=\"menuTree\" style=\"width:100%;background:url('img/menu_back.png');display:none\"></div>\r\n");
      out.write("<div class=\"accordMenu\">\r\n");
      out.write("\t<span id=\"URMSG\">");
      out.print(WebInitServlet.URMSG);
      out.write("</span>\r\n");
      out.write("   <ul id=\"ulLevel1List\">\r\n");
      out.write("   </ul>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 主窗口 -->\r\n");
      out.write("<table width=\"100%\"  border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"182\" valign=\"top\" >\r\n");
      out.write("<div id=\"userWelcome\" style=\"width:180px;float:left; height:53px;margin:3px 5px 0 0; background-image: url(img/new-img/loginin.png);\">\r\n");
      out.write("<table width=\"100%\"  border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"57\" height=\"53\" align=\"center\"><a id=\"aUserRole\" href=\"#\" onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('login','','img/new-img/man2.jpg',1)\"><img src=\"img/new-img/man1.jpg\" name=\"login\" width=\"43\" height=\"40\" border=\"0\"></a></td>\r\n");
      out.write("\t<td width=\"99\" valign=\"middle\"><span id=\"spUsername\" style=\"color: #A60000;\">***</span>\r\n");
      out.write("\t  <br>\r\n");
      out.write("\t  <span style=\"color: #A60000;\">欢迎您！</span></td>\r\n");
      out.write("\t <td width=\"18\"><img id=\"menuHideBtn\" src=\"img/left.png\" style=\"width:16px; height:16px;\"> </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("\t<div id=\"leftMenu\" style=\"width:180px;float:left;  background-color:#FFFFFF; background-image:url('img/lmbg.gif')\"></div></td>\r\n");
      out.write("    <td valign=\"top\" >\r\n");
      out.write("\t<div id=\"main\" style=\"float:left;margin:4px 5px 0 0; \">\r\n");
      out.write("\t   <ul id=\"pageBar\">\r\n");
      out.write("       </ul>\r\n");
      out.write("    </div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<!-- 隐藏域 -->\r\n");
      out.write("\r\n");
      out.write("<div id=\"hiddenDiv\" style=\"display:none\"></div>\r\n");
      out.write("<div id=\"changePass\" style=\"display:none;background-image:url(img/cpbg.jpg);width:498px;height:350px; font-size:14px\">\r\n");
      out.write("    <p id=\"changePassMsg\" style=\"color:red;position: absolute;top:23%;left: 10%;\">您的初始密码尚未修改，出于安全考虑，请及时修改您的初始密码</p>\r\n");
      out.write("\t <table border=\"0\" cellpadding=\"2\" bordercolor=\"#eeeeee\" style='display:block;width:300px;position:absolute;top:35%;left:21%;'>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td width=\"40%\" align=\"right\">请输入原密码:</td>  \r\n");
      out.write("            <td colspan=\"3\" align=\"left\"> \r\n");
      out.write("            <input type=\"password\" id=\"old\"> \r\n");
      out.write("            </td>  \r\n");
      out.write("        </tr>   \r\n");
      out.write("        <tr>\r\n");
      out.write("            <td width=\"40%\" align=\"right\">请输入新密码:</td>  \r\n");
      out.write("            <td colspan=\"3\" align=\"left\"> \r\n");
      out.write("            <input type=\"password\" id=\"new1\" onKeyUp=$.pwStrength(this.value) onBlur=$.pwStrength(this.value)> \r\n");
      out.write("            </td>  \r\n");
      out.write("        </tr>   \r\n");
      out.write("        <tr align=\"center\">  \r\n");
      out.write("            <td width=\"40%\" align=\"right\">密码强度:</td>  \r\n");
      out.write("            <td width=\"20%\" id=\"strength_L\" bgcolor=\"#fefefe\">弱</td>    \r\n");
      out.write("            <td width=\"20%\" id=\"strength_M\" bgcolor=\"#fefefe\">中</td>    \r\n");
      out.write("            <td width=\"20%\" id=\"strength_H\" bgcolor=\"#fefefe\">强</td>    \r\n");
      out.write("        </tr>  \r\n");
      out.write("        <tr>  \r\n");
      out.write("            <td width=\"40%\" align=\"right\">再次输入新密码:</td>  \r\n");
      out.write("            <td colspan=\"3\" align=\"left\"> \r\n");
      out.write("            <input type=\"password\" id=\"new2\"> \r\n");
      out.write("            </td>  \r\n");
      out.write("        </tr>   \r\n");
      out.write("    </table>  \r\n");
      out.write("<!--     <p>请输入原密码:<input type=\"password\" id=\"old\" style=\"margin-top:20px\"></p>\r\n");
      out.write("\t<p>请输入新密码:<input type=\"password\" id=\"new1\" style=\"margin-top:20px\"></p>\r\n");
      out.write("\t<p>确认输入密码:<input type=\"password\" id=\"new2\" style=\"margin-top:20px\"></p>\r\n");
      out.write(" -->\r\n");
      out.write("    <p id=\"tip\" style=\"color:red;position: relative;top: 230px;width: 350px;margin: 0 auto;\"></p>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"divMore\">\r\n");
      out.write("  <div id=\"divGrid\">\r\n");
      out.write("      <table id=\"tableMore\"></table>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div id=\"divPager\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("<form id=\"frm\" target=\"_blank\" action=\"expExcel.action\" method=\"post\">\r\n");
      out.write("\t<input id=\"title\" name=\"title\" type=\"hidden\">\r\n");
      out.write("\t<input id=\"detail\" name=\"detail\" type=\"hidden\">\r\n");
      out.write("\t<input id=\"viewname\" name=\"viewname\" type=\"hidden\">\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<!-- 底部 -->\r\n");
      out.write("<!-- <div  style=\"width:100%;float: left; height:40px; bottom:0px;left:0px; position:absolute; background-image:url(img/new-img/bot.jpg); text-align:center; color:#0066CC; font-weight:bold; \"><br>2013 版权所有</div>\r\n");
      out.write(" -->\r\n");
      out.write("</body>\r\n");
      out.write("<OBJECT id=\"SignatureControl\" \r\n");
      out.write("\t\t\tclassid=\"clsid:D85C89BE-263C-472D-9B6B-5264CD85B36E\" \r\n");
      out.write("\t\t\tcodebase=\"iSignatureHTML.cab#version=5,0,2,18\" \r\n");
      out.write("\t\t\twidth=0 height=0 VIEWASTEXT>\r\n");
      out.write("\t\t<param name=\"ServiceUrl\" value=\"http://localhost:8080/WF/SignatureAction.jsp\">\t<!--读取数据库相关信息-->\r\n");
      out.write("\t\t<param name=\"WebAutoSign\" value=\"1\">             \t<!--是否自动数字签名(0:不启用，1:启用)-->\r\n");
      out.write("\t\t<param name=\"PrintControlType\" value=0>          \t<!--打印控制方式（0:不控制  1：签章服务器控制  2：开发商控制）-->\r\n");
      out.write("\t\r\n");
      out.write("</OBJECT>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
