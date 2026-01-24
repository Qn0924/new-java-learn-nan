import javax.servlet.ServletException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        HelloServlet helloServlet=new HelloServlet();
        try {
            helloServlet.service(null,null);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
