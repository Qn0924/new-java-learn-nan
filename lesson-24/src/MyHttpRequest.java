import java.io.IOException;
import java.io.InputStream;

public class MyHttpRequest {

    private InputStream inputStream;
    private String uri;

    public MyHttpRequest(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public void parse(){
        StringBuffer requestStr=new StringBuffer(2048);
        int i=0;
        byte[] buffer=new byte[2048];
        try {
            i=inputStream.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int j = 0; j < i; j++) {
            requestStr.append((char)buffer[j]);
        }
        //System.out.println(requestStr.toString());
        uri=parseUri(requestStr.toString());
    }

    public String getUri() {
        return uri;
    }

    private String parseUri(String requestStr){
        int index1,index2;
        index1=requestStr.indexOf(' ');
        index2=requestStr.indexOf(' ',index1+1);
        return requestStr.substring(index1+1,index2);
    }
}
