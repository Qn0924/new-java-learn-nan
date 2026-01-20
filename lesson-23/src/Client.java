import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        Socket socket=null;
        OutputStream outputStream=null;
        InputStream inputStream=null;
        DataInputStream dataInputStream=null;
        DataOutputStream dataOutputStream=null;
        try {
            socket =new Socket("localhost",8080);
            System.out.println("-----客户端-----");
            String request="你好";
            System.out.println("客户端说："+request);
            outputStream=socket.getOutputStream();
            dataOutputStream =new DataOutputStream(outputStream);
            dataOutputStream.writeUTF(request);
            inputStream=socket.getInputStream();
            dataInputStream=new DataInputStream(inputStream);
            String response=dataInputStream.readUTF();
            System.out.println("给客户端做出响应："+response);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(dataInputStream!=null) {
                    dataInputStream.close();
                }
                if(dataOutputStream!=null) {
                    dataOutputStream.close();
                }
                if(inputStream!=null) {
                    inputStream.close();
                }
                if(outputStream!=null) {
                    outputStream.close();
                }
                if(socket!=null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
