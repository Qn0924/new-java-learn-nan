import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;

public class Test1 {
    public static void main(String[] args) throws Exception{
        InputStream inputStream=new FileInputStream("C:\\Users\\21289\\Desktop\\File\\test.txt");
        BufferedInputStream bufferedInputStream=new BufferedInputStream(inputStream);
//        int temp=0;
//        while((temp=bufferedInputStream.read())!=-1){
//            System.out.println(temp);
//        }
        byte[] bytes=new byte[1024];
        int len=bufferedInputStream.read(bytes);
        System.out.println(len);
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }
        bufferedInputStream.close();
        inputStream.close();
    }
}
