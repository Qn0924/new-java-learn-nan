public class Yic {
    public static void main(String[] args) {

        try {
            int num = 10 / 10;
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            System.out.println("必须输出");
        }
    }
}