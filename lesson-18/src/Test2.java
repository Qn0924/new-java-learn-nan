import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Test2 {
    public static void main(String[] args) throws Exception {
        OutputStream outputStream=new FileOutputStream("C:\\Users\\21289\\Desktop\\File\\test2.txt");
        byte[] bytes={74,97,118,97};
        outputStream.write(bytes,1,2);
    }
}
