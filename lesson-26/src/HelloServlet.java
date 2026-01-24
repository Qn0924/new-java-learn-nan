import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("处理GET请求业务");
//        String method=req.getMethod();
//        System.out.println("当前请求的类型是："+method);
//        String requestURI=req.getRequestURI();
//        System.out.println("当前请求的资源名称是："+requestURI);
//        StringBuffer requestURL=req.getRequestURL();
//        System.out.println("当前请求的资源路径是："+requestURL);
//        String requestPath=req.getServletPath();
//        System.out.println("当前请求的资源名称是："+requestPath);
//        Cookie[] cookies=req.getCookies();
//        String idStr = req.getParameter("id");
//        Integer id=Integer.parseInt(idStr);
//        System.out.println("请求参数id的值是："+id);
//        String name=req.getParameter("name");
//        System.out.println("请求参数name的值是："+name);
          resp.setCharacterEncoding("UTF-8");
          PrintWriter writer=resp.getWriter();
          writer.write("你好");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("处理POST请求业务");
    }
}
