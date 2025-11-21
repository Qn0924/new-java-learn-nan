public class Test4 {
    public static void main(String[] args) {
        TicketRunnable ticketRunnable = new TicketRunnable();
        new Thread(ticketRunnable,"窗口A").start();
        new Thread(ticketRunnable,"窗口B").start();
        new Thread(ticketRunnable,"窗口C").start();
    }
}
