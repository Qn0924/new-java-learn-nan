import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Test5 {
    public static void main(String[] args) throws Exception{
        User user=new User();
        user.setId(1);
        user.setName("张三");
        user.setAge(22);
        user.setGender('男');
        OutputStream outputStream=new FileOutputStream("C:\\Users\\21289\\Desktop\\File\\test.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();
        outputStream.close();
    }
}
