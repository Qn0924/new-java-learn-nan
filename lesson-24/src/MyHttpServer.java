import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class MyHttpServer {
    public static String WebContent=System.getProperty("user.dir")+ File.separator+"WebContent";
    private int port=8080;
    private boolean isShutdown=false;
    public void receiving(){
        ServerSocket serverSocket=null;
        try {
            serverSocket=new ServerSocket(port,1, InetAddress.getByName("127.0.0.1"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        while(!isShutdown){
            Socket socket=null;
            InputStream inputStream=null;
            OutputStream outputStream=null;
            try {
                socket=serverSocket.accept();
                inputStream=socket.getInputStream();
                outputStream=socket.getOutputStream();
                //解析请求
                MyHttpRequest request=new MyHttpRequest(inputStream);
                request.parse();
                //响应
                MyHttpResponse myHttpResponse=new MyHttpResponse(outputStream);
                myHttpResponse.sendStaticResource(request);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
