import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyHttpServlet extends MyGenericServlet{
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        HttpServletRequest request=(HttpServletRequest) servletRequest;
        HttpServletResponse response=(HttpServletResponse) servletResponse;
        String method=request.getMethod();
        if(method.equals("GET")){
            doGet(request,response);
        }
        if(method.equals("POST")){
            doPost(request,response);
        }
    }

    public void doGet(HttpServletRequest request,HttpServletResponse response){

    }

    public void doPost(HttpServletRequest request,HttpServletResponse response){

    }
}
