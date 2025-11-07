public class Test3 {
    public static void main(String[] args) throws MyNumerException{
            Test3 test=new Test3();
            System.out.println(test.add(1));
    }
    public int add(Object object) throws MyNumerException {
        if(!(object instanceof Integer)){
            String error="传入的参数不是整数类型";
            throw new MyNumerException(error);
        }else{
            int num=(int)object;
            return ++num;
        }
    }
}
