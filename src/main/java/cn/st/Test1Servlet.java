package cn.st;

import javax.servlet.http.*;
import java.io.IOException;

public class Test1Servlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/plain");
        resp.getWriter().println("Test1Servlet.doGet");
    }
}
