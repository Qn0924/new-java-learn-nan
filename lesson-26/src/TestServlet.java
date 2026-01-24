import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/test")
public class TestServlet extends MyHttpServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("处理GET请求");
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("处理POST请求");
    }
}
