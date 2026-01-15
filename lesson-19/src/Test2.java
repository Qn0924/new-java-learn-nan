import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class Test2 {
    public static void main(String[] args) throws Exception{
        Reader reader=new FileReader("C:\\Users\\21289\\Desktop\\File\\test.txt");
        BufferedReader bufferedReader=new BufferedReader(reader);
//        int temp=0;
//        while((temp=bufferedReader.read())!=-1){
//            System.out.println(temp);
//        }
//        char []chars=new char[1024];
//        int length=bufferedReader.read(chars);
//        System.out.println(length);
//        for (char aChar : chars) {
//            System.out.println(aChar);
//        }
//        String str=bufferedReader.readLine();
//        System.out.println(str);
          String str="";
          while((str=bufferedReader.readLine())!=null){
              System.out.println(str);
          }
          bufferedReader.close();
          reader.close();
    }
}
