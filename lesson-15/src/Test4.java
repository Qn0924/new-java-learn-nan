public class Test4 {
    public static void main(String[] args) {
        //第一种方法实现
        MyInterFaceiml<String> myInterFace1=new MyInterFaceiml<String>("接口");
        String value= myInterFace1.getValue();
        System.out.println(value);
        //第二种方法实现
        MyInterFaceImp2 myInterFace2=new MyInterFaceImp2("接口");
        String value1= myInterFace2.getValue();
        System.out.println(value1);

    }
}
