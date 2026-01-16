import java.io.Serializable;

public class Userr extends People implements Serializable,Comparable ,MyInterface{
    @Override
    public int compareTo(Object o) {
        return 0;
    }

    protected void test(){

    }

    private void test2(){

    }

    void test3(){

    }

    public Userr(){
        System.out.println("调用了User无参构造函数");
    }


    public Userr(int id){

    }

    private Userr(String name){

    }

    protected Userr(int id, String name){

    }

    Userr(Double num){

    }
}
