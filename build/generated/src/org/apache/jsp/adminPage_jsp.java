package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>Bootstrap Example</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("  <!-- Trigger the modal with a button -->\n");
      out.write("  <button type=\"button\" class=\"btn btn-info btn-lg\" data-toggle=\"modal\" data-target=\"#myModal\">Add new item</button>\n");
      out.write("\n");
      out.write("  <!-- Modal -->\n");
      out.write("  <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("    \n");
      out.write("      <!-- Modal content-->\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      <!-- Ask for help here pics <- -->\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("          <h4 class=\"modal-title\">Add new item</h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("            <!-- Inside the modal-->\n");
      out.write("           \n");
      out.write("            <!-- Name -->\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"clname\">Name:</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"clname\">\n");
      out.write("            </div>\n");
      out.write("            <!-- Price -->\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"clprice\">Price:</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"clprice\">\n");
      out.write("            </div>\n");
      out.write("            <!-- Color -->\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"clcolor\">Color:</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"clcolor\">\n");
      out.write("            </div>\n");
      out.write("            <!-- Size + Units (Add units later) -->\n");
      out.write("            <div class=\"form-check\">\n");
      out.write("              <input class=\"form-check-input\" type=\"checkbox\" value=\"\" id=\"checkXS\" name=\"XS\" onclick=\"dynInput(this);\">\n");
      out.write("              <label class=\"form-check-label\" for=\"checkXS\">\n");
      out.write("                XS\n");
      out.write("              </label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-check\">\n");
      out.write("              <input class=\"form-check-input\" type=\"checkbox\" value=\"\" id=\"checkS\" name=\"S\" onclick=\"dynInput(this);\">\n");
      out.write("              <label class=\"form-check-label\" for=\"checkS\">\n");
      out.write("                S\n");
      out.write("              </label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-check\">\n");
      out.write("              <input class=\"form-check-input\" type=\"checkbox\" value=\"\" id=\"checkM\" name=\"M\" onclick=\"dynInput(this);\">\n");
      out.write("              <label class=\"form-check-label\" for=\"checkM\">\n");
      out.write("                M\n");
      out.write("              </label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-check\">\n");
      out.write("              <input class=\"form-check-input\" type=\"checkbox\" value=\"\" id=\"checkL\" name=\"L\" onclick=\"dynInput(this);\">\n");
      out.write("              <label class=\"form-check-label\" for=\"checkL\">\n");
      out.write("                L\n");
      out.write("              </label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-check\">\n");
      out.write("              <input class=\"form-check-input\" type=\"checkbox\" value=\"\" id=\"checkXL\" name=\"XL\" onclick=\"dynInput(this);\">\n");
      out.write("              <label class=\"form-check-label\" for=\"checkXL\">\n");
      out.write("                XL\n");
      out.write("              </label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-check\">\n");
      out.write("              <input class=\"form-check-input\" type=\"checkbox\" value=\"\" id=\"checkXXL\" name=\"XXL\" onclick=\"dynInput(this);\">\n");
      out.write("              <label class=\"form-check-label\" for=\"checkXXL\">\n");
      out.write("                XXL\n");
      out.write("              </label>\n");
      out.write("            </div>\n");
      out.write("            <p id=\"insertinputs\"></p>\n");
      out.write("            <!-- Description -->\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"clDescription\">Description</label>\n");
      out.write("                <textarea class=\"form-control\" id=\"clDescription\" rows=\"3\"></textarea>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"cltype\">Clothing type</label>\n");
      out.write("              <select class=\"form-control\" id=\"typeSelector\">\n");
      out.write("                  \n");
      out.write("                  <!-- Load options from database\n");
      out.write("                  <option>1</option>-->\n");
      out.write("                  \n");
      out.write("              </select>\n");
      out.write("            </div>\n");
      out.write("            <form>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <label for=\"clImage\">Images</label>\n");
      out.write("                  <input type=\"file\" class=\"form-control-file\" id=\"exampleFormControlFile1\">\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-footer\">\n");
      out.write("          <button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\">Add</button>\n");
      out.write("          <button type=\"button\" class=\"btn btn-danger\" data-dismiss=\"modal\">Close</button>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("    <div>\n");
      out.write("        <label for=\"cltype\">Add new Clothing type</label>\n");
      out.write("        <input type=\"text\" class=\"form-control\" id=\"cltype\">\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary\">+</button> <br>\n");
      out.write("      <!-- This is after you add items -->\n");
      out.write("                      ");
 
            // String url = "bananas";
            //String image = "<a href='"+url+"' target='_blank'>";
            //search image on database
      
      out.write("\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"js/my.js\"></script>");
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
