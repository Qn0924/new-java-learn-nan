import java.io.Serializable;

public class User extends People implements Serializable,Comparable ,MyInterface{
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
