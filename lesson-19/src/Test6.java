import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Test6 {
    public static void main(String[] args) throws Exception{
        InputStream inputStream=new FileInputStream("C:\\Users\\21289\\Desktop\\File\\test.txt");
        ObjectInputStream objectInputStream=new ObjectInputStream(inputStream);
        User user= (User) objectInputStream.readObject();
        objectInputStream.close();
        inputStream.close();
        System.out.println(user.getId());
        System.out.println(user.getName());
        System.out.println(user.getAge());
        System.out.println(user.getGender());
    }
}
