import java.io.FileWriter;
import java.io.Writer;

public class Test5 {
    public static void main(String[] args) throws Exception{
        Writer writer=new FileWriter("C:\\Users\\21289\\Desktop\\File\\test.txt");
//        writer.write(74);
//        writer.write(97);
//        writer.write(118);
//        writer.write(97);
        char chars[]={'J','a','v','a','语','言'};
        writer.write(chars,0,2);
        String str="Java是一门高级编程语言";
        writer.write(str,2,11);
        writer.flush();
    }
}
