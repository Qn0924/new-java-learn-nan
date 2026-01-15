import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Test3 {
    public static void main(String[] args) throws Exception{
        OutputStream outputStream=new FileOutputStream("C:\\Users\\21289\\Desktop\\File\\test.txt");
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(outputStream);
        String str="JDK(Java Development Kit)称为Java开发包或者Java开发工具，\r\n是一个编写Java应用程序的开发";
        byte[] bytes = str.getBytes();
        bufferedOutputStream.write(bytes,20,10);
        bufferedOutputStream.close();
        outputStream.close();

    }
}
