import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        Random random=new Random();
        for (int i = 0; i < 3; i++) {
            boolean flag=random.nextBoolean();
            System.out.println("第"+i+"个随机数:"+flag);
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            double num=random.nextDouble();
            System.out.println("第"+i+"个随机数:"+num);
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            float num=random.nextFloat();
            System.out.println("第"+i+"个随机数:"+num);
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            int num=random.nextInt();
            System.out.println("第"+i+"个随机数:"+num);
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            int num=random.nextInt(10);
            System.out.println("第"+i+"个随机数:"+num);
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            long num=random.nextLong();
            System.out.println("第"+i+"个随机数:"+num);
        }
        System.out.println();

    }
}
