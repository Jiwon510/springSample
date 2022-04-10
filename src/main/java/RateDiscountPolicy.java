/*정률 할인 정책*/
public class RateDiscountPolicy implements DiscountPolicy {

    /*고정 할인율*/
    private int discountPercent = 10;

    /*할인*/
    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        }
        else {
            return 0;
        }
    }
}
