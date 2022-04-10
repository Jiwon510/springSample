/*정액 할인 정책*/
public class FixDicountPolicy implements DiscountPolicy{

    /*고정 할인 금액*/
    private int discountFixAmount = 1000;

    /*할인*/
    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        }
        else {
            return 0;
        }
    }
}
