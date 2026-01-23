import java.io.*;

public class MyHttpResponse {
    private OutputStream outputStream;

    public MyHttpResponse(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public void sendStaticResource(MyHttpRequest request) {
        byte[] bytes = new byte[1024];
        FileInputStream fileinputStream = null;
        String filePath = request.getUri();
        if(filePath.equals("/")){
            filePath="index.html";
        }
        File file = new File(MyHttpServer.WebContent, filePath);
        //System.out.println(file);
        if (file.exists()) {
            String result = null;
            try {
                fileinputStream = new FileInputStream(file);
                byte[] fileByte = new byte[(int) file.length()];
                fileinputStream.read(fileByte);
                fileinputStream.close();
                result = new String(fileByte);
                outputStream.write(warpMessage("200", result).getBytes());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                String result = warpMessage("404", "404 File Not Found! The requested URL "+request.getUri()+"/ was not found on this server ");
                outputStream.write(result.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private String warpMessage(String status, String message) {
        return "HTTP/1.1 " + status + "\r\n" + "Content-Type: text/html\r\n" + "Content-Length: " + message.length()
                + "\r\n" + "\r\n" + message;
    }
}
