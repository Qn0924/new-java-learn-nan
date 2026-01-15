import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class Test4 {
    public static void main(String[] args) throws Exception{
        Writer writer=new FileWriter("C:\\Users\\21289\\Desktop\\File\\test.txt");
        BufferedWriter bufferedWriter=new BufferedWriter(writer);
        String str="应用程序的开发坏境。";
        bufferedWriter.write(str,5,4);
        bufferedWriter.close();
        writer.close();
    }
}
