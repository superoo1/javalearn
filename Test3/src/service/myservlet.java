package service;
//import javax.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class myservlet  extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//          super.doGet(req, resp);
//          resp.getWriter().println("hello world");
        if(req.getParameter("username").equals("lwd")){

            resp.getWriter().println("登陆成功====");
        }
        else{
            resp.setStatus(404) ;
           resp.sendRedirect("/");

        }
    }


}


