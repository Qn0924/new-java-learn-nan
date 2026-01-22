import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.OutputStream;

public class MyHttpResponse {
    private OutputStream outputStream;

    public MyHttpResponse(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public void sendStaticResource(MyHttpRequest request){
        byte[] bytes=new byte[1024];
        FileInputStream fileinputStream=null;
        String filePath = request.getUri();
        File file=new File(MyHttpServer.WebContent,filePath);
        //System.out.println(file);
        String result=null;
        try {
            fileinputStream=new FileInputStream(file);
            byte[] fileByte=new byte[(int)file.length()];
            fileinputStream.read(fileByte);
            fileinputStream.close();
            result =new String(fileByte);
            outputStream.write(warpMessage("200",result).getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String warpMessage(String status,String message){
        return "HTTP/1.1 "+status+"\r\n"+"Content-Type: text/html\r\n"+"Content-Length: "+message.length()
                +"\r\n"+"\r\n"+message;
    }
}
