import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class Test1 {
    public static void main(String[] args) throws Exception{
        URL url=new URL("http","127.0.0.1",8080,"/index.jsp");
        InputStream inputStream= url.openStream();
        Reader reader=new InputStreamReader(inputStream);
        BufferedReader bufferedReader=new BufferedReader(reader);
        String str=null;
        while((str= bufferedReader.readLine())!=null){
            System.out.println(str);
        }
    }
}