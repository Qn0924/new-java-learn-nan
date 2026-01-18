import java.net.InetAddress;

public class Test {
    public static void main(String[] args) throws Exception{
        InetAddress inetAddress=InetAddress.getByName("127.0.0.1");
        System.out.println(inetAddress);
        inetAddress=InetAddress.getByName("localhost");
        System.out.println(inetAddress);
    }
}
