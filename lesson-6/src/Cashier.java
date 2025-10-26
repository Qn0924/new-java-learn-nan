public class Cashier {
    private Member member;

    public void setMember(Member member) {
        this.member = member;
    }

    public void settlement(){
        this.member.Buybook();
    }
}
