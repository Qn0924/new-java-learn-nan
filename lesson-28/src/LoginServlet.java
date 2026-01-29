import com.test.Account;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Account account = LoginUtil.login(username, password);
        if (account.getCode() == 0) {
            HttpSession session = req.getSession();
            session.setAttribute("account", account);
            resp.sendRedirect("welcome.jsp");
        }
        if (account.getCode() == -1) {
            req.setAttribute("error2", "密码错误");
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
        if (account.getCode() == -2) {
            req.setAttribute("error1", "用户名错误");
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
    }
}
