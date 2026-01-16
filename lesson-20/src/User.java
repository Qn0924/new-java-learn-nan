import java.io.Serializable;

public class User implements Serializable,Comparable ,MyInterface{
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
