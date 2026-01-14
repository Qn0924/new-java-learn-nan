import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        //计算2025-5-14号200天之后是几月几号
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,2025);
        calendar.set(Calendar.MONTH,4);
        calendar.set(Calendar.DAY_OF_MONTH,14);
        int i=calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println(i);
        i=i+200;
        calendar.set(Calendar.DAY_OF_YEAR,i);
        Date time=calendar.getTime();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(time);
        System.out.println(format);

    }
}