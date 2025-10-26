public class Cashier {
    public void settlement(Member member){
        member.Buybook();
    }
    public Member getMember(String name){
        if(name.equals("普通会员")){
            return new OrdinaryMember();
        }
        if(name.equals("超级会员")){
            return new SuperMember();
        }
        if(name.equals("Vip会员")){
            return new VipMember();
        }
        return new Member();
    }
}
