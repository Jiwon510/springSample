import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*회원 서비스 테스트*/
class OrderServiceTest {

    /*회원 서비스 객체*/
    MemberService memberService;
    /*주문 서비스 객체*/
    OrderService orderService;

    /*주문 생성*/
    /*@Test
    void createOrder() {
        *//*회원 샘플 데이터 생성*//*
        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        *//*주문 샘플 데이터 생성*//*
        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }*/

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }

}