import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test3 {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\21289\\Desktop\\File\\test.txt");
        if(file.exists()){
            try {
                FileInputStream inputStream=new FileInputStream(file);
                while((inputStream.available()>0)){
                    int read=inputStream.read();
                    System.out.println(read);
                }
//                System.out.println(inputStream.available());
//                int read = inputStream.read();
//                System.out.println(read);
//                System.out.println(inputStream.available());
//                read=inputStream.read();
//                System.out.println(read);
//                System.out.println(inputStream.available());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
