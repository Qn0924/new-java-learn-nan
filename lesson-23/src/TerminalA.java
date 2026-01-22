import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class TerminalA {
    public static void main(String[] args) throws Exception{
        //接收数据
        byte[] buff=new byte[1024];
        DatagramPacket datagramPacket=new DatagramPacket(buff,buff.length);
        DatagramSocket datagramSocket=new DatagramSocket(8181);
        datagramSocket.receive(datagramPacket);
        String message=new String(datagramPacket.getData(),0,datagramPacket.getLength());
        System.out.println("我是TerminalA 接收到了" + datagramPacket.getPort() + "传来的数据：" + message);
        //发送消息
        String response="我是TerminalA，已接受到你发来的信息。";
        SocketAddress socketAddress=datagramPacket.getSocketAddress();
        DatagramPacket datagramPacket2=new DatagramPacket(response.getBytes(),response.getBytes().length,socketAddress);
        datagramSocket.send(datagramPacket2);
    }
}
