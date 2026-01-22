import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class TerminalB {
    public static void main(String[] args) throws Exception {
        //发送数据
        String message = "我是Terminal B，你好";
        InetAddress address = InetAddress.getByName("localhost");
        DatagramPacket datagramPacket = new DatagramPacket(message.getBytes(), message.getBytes().length, address, 8181);
        DatagramSocket datagramSocket = new DatagramSocket(8080);
        datagramSocket.send(datagramPacket);
        //接收数据
        byte[] buff=new byte[1024];
        DatagramPacket datagramPacket2=new DatagramPacket(buff,buff.length);
        datagramSocket.receive(datagramPacket2);
        String response=new String(datagramPacket2.getData(),0,datagramPacket2.getLength());
        System.out.println("我是TerminalB,接收到了" + datagramPacket2.getPort() + "返回的数据：" + response);

    }
}