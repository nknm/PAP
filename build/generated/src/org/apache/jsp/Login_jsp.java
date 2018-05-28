package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!-- Modal login-->\n");
      out.write("<div class=\"modal fade\" id=\"ModalLogin\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("        <!-- Modal content-->\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\" style=\"padding:35px 50px;\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                <h4><span></span> Login</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\" style=\"padding:40px 50px;\">\n");
      out.write("                <form role=\"form\" id=\"formlogin\" method=\"POST\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"username\"><span class=\"glyphicon glyphicon-user\"></span> Username</label>\n");
      out.write("                        <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Enter email\" name=\"user\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"pwd\"><span class=\"glyphicon glyphicon-eye-open\"></span> Password</label>\n");
      out.write("                        <input type=\"password\" class=\"form-control\" id=\"pwd\" placeholder=\"Enter password\" name=\"pass\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-success btn-block\">\n");
      out.write("                        <span class=\"glyphicon glyphicon-off\"></span> Login\n");
      out.write("                    </button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("             \n");
      out.write("            <p>Ainda não estas registado? <a href=\"#\" id=\"BtnRegistaLogin\">Registar</a></p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div> \n");
      out.write("\n");
      out.write("<!-- Modal registo -->\n");
      out.write("<div class=\"modal fade\" id=\"ModalRegisto\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("        <!-- Modal content-->\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\" style=\"padding:15px 15px;\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                <h4><span></span> Registo</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\" style=\"padding:10px 10px;\">\n");
      out.write("                <form id=\"formregisto\" role=\"form\" method=\"POST\" action=\"index.jsp\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"np\"><span class=\"glyphicon\"></span> Nº de processo:</label>\n");
      out.write("                        <input type=\"number\" class=\"form-control\" id=\"np\" placeholder=\"indique o seu nº de processo\" name=\"nrprocesso\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"name\"><span class=\"glyphicon\"></span> Nome:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"name\" placeholder=\"Indique o seu nome\"  name=\"nome\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"turma\"><span class=\"glyphicon\"></span> Turma:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"turma\" placeholder=\"Indique a sua turma\"  name=\"turma\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"email\"><span class=\"glyphicon\"></span> Mail:</label>\n");
      out.write("                        <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Enter email\" name=\"mail\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"pwd\"><span class=\"glyphicon\"></span> Password:</label>       \n");
      out.write("                        <input type=\"password\" class=\"form-control\" id=\"pwd\" placeholder=\"Enter password\" name=\"pass\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"telefone\"><span class=\"glyphicon\"></span> Telefone:</label>\n");
      out.write("                        <input type=\"number\" class=\"form-control\" id=\"telefone\" placeholder=\"indique o seu contacto\"  name=\"contacto\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"tipo\"><span class=\"glyphicon\"></span> Tipo de utente:</label>\n");
      out.write("                        <select class=\"form-control\" id=\"tipo\" name=\"tipo\">\n");
      out.write("                            <option>Aluno</option>\n");
      out.write("                            <option>Professor</option>\n");
      out.write("                            <option>Funcionário</option>\n");
      out.write("                            <option>Outro</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-success btn-block\"><span class=\"glyphicon glyphicon-off\">\n");
      out.write("                        </span> Regista\n");
      out.write("                    </button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("             \n");
      out.write("              <p>Já estás registado? <a href=\"#\" id=\"BtnLoginRegista\">Login</a></p>\n");
      out.write("             \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
