import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class fact extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        int n = Integer.parseInt(request.getParameter("user"));
        long f = 1;
        for (int i = 1; i <= n; i++)
            f = f * i;
        out.print("Factorial of " + n + " is " + f);
        out.close();
    }
}
