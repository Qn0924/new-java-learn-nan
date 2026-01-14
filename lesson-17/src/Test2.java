import java.io.File;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\21289\\Desktop\\File\\test2.txt");
        try {
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getPath());
        File parentFile=file.getParentFile();
        System.out.println(parentFile);
        System.out.println(parentFile.isDirectory());
        System.out.println(parentFile.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.delete());
    }
}