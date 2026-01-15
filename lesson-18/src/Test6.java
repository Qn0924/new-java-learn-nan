import java.io.*;

public class Test6 {
    public static void main(String[] args) throws Exception {
        //使用字节流进行文件的复制
        InputStream inputStream = new FileInputStream("C:\\Users\\21289\\Desktop\\File\\test.txt");
        OutputStream outputStream = new FileOutputStream("C:\\Users\\21289\\Desktop\\File\\copy.txt");
        int temp = 0;
        while ((temp = inputStream.read()) != -1) {
            outputStream.write(temp);
        }
        outputStream.close();
        inputStream.close();
        //使用字符流进行文件复制
        Reader reader = new FileReader("C:\\Users\\21289\\Desktop\\File\\test.txt");
        Writer writer=new FileWriter("C:\\Users\\21289\\Desktop\\File\\copy1.txt");
        int temp1 = 0;
        while ((temp1=reader.read())!=-1){
            writer.write(temp1);
        }
        writer.close();
        reader.close();
    }
}
