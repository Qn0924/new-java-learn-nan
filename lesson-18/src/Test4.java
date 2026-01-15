import java.io.FileReader;
import java.io.Reader;

public class Test4 {
    public static void main(String[] args) throws Exception{
        Reader reader=new FileReader("C:\\Users\\21289\\Desktop\\File\\test.txt");
        char []chars=new char[1024];
        int read = reader.read(chars,3,6);
        System.out.println(read);
        for (char aChar : chars) {
            System.out.println(aChar);
        }
    }
}
