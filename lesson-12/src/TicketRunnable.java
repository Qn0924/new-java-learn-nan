public class TicketRunnable implements Runnable {
    //剩余票数
    private int lastNum=15;
    //已售出票数
    private int outNum=0;

    @Override
    public void run() {
        while(lastNum>0) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(lastNum==0){
                return;
            }
            synchronized (TicketRunnable.class) {
                lastNum--;
                outNum++;
                if(lastNum==0){
                    System.out.println(Thread.currentThread().getName() + "售出了第" + outNum + "张票，票已售罄");
                }else{
                System.out.println(Thread.currentThread().getName() + "售出了第" + outNum + "张票，还剩余" + lastNum + "张票");
            }
        }
    }
}
}
