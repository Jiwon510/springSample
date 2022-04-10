/*주문 서비스 구현체*/
public class OrderServiceImpl implements OrderService {

    /*회원 저장소*/
    private final MemberRepository memberRepository;

    /*할인 정책*/
//    private final DiscountPolicy discountPolicy = new FixDicountPolicy();
//    private DiscountPolicy discountPolicy = new RateDiscountPolicy();
    private DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    /*주문 생성*/
    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        /*회원 정보 조회*/
        Member member = memberRepository.findById(memberId);

        /*할인 정책*/
        int discountPrice = discountPolicy.discount(member, itemPrice);

        /*주문 생성*/
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
