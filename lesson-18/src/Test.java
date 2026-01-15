import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) throws IOException {
//        File file=new File("C:\\Users\\21289\\Desktop\\File\\test.txt");
//        long length=file.length();
//        System.out.println("filelength:"+length);
        InputStream inputStream=new FileInputStream("C:\\Users\\21289\\Desktop\\File\\test.txt");
        int available = inputStream.available();
        System.out.println("available:"+available);
        byte[] bytes=new byte[available];
        int read=inputStream.read(bytes);
        System.out.println(read);
        for(byte by:bytes){
            System.out.println(by);
        }
    }
}
