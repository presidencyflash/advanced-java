import javax.servlet.*;
import java.io.*;

public class UnamePasswordServlet extends GenericServlet {

    public void service(ServletRequest req, ServletResponse res) {
        try {
            PrintWriter pw = res.getWriter();
            res.setContentType("text/html");
            String name = req.getParameter("name");
            String pwd  = req.getParameter("pwd");
            pw.println("<b>Name=" + name + "<br>Password=" + pwd);
            pw.close();
        } catch (Exception excep) {
            System.out.println(excep.getMessage());
        }
    }
}
