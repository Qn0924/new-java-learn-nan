import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

@WebServlet("/log")
public class LogServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("username");
        String password=req.getParameter("password");

        boolean flag=false;
        Set<Object> keySet = MyDB.map.keySet();
        Iterator<Object> iterator = keySet.iterator();
        while (iterator.hasNext()){
            String key=(String)iterator.next();
            if(key.equals(username)){
                flag=true;
            }
        }
        if(flag) {
            String password2=MyDB.get(username);
            if (password.equals(password2)) {
                System.out.println("登录成功");
                req.setAttribute("username", username);
                req.getRequestDispatcher("welcome.jsp").forward(req, resp);
            } else {
                System.out.println("登录失败");
                req.setAttribute("error2","密码错误");
                req.getRequestDispatcher("log.jsp").forward(req,resp);
            }
        }
        else{
                req.setAttribute("error1","用户名错误");
                req.getRequestDispatcher("log.jsp").forward(req,resp);
        }
    }
}
