import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

public class Test3 {
    public static void main(String[] args) throws Exception{
        System.out.println("**************使用字符流读取****************");
        Reader reader=new FileReader("C:\\Users\\21289\\Desktop\\File\\test.txt");
        //System.out.println(reader.read());
        int temp=0;
        while((temp=reader.read())!=-1){
            System.out.println(temp);
        }
        System.out.println("****************使用字节流读取***************");
        InputStream inputStream=new FileInputStream("C:\\Users\\21289\\Desktop\\File\\test.txt");
        int temp2=0;
        while((temp2=inputStream.read())!=-1){
            System.out.println(temp2);
        }
    }
}
