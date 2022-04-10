import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*회원 서비스 기능 테스트*/
class MemberServiceTest {

    MemberService memberService;

    /*@Test
    void join() {
        //given : 샘플데이터 생성
        Member member = new Member(1L, "memberA", Grade.VIP);
        //when
        *//*데이터저장소에 저장*//*
        memberService.join(member);
        *//*데이터저장소에서 회원 조회*//*
        Member findMember = memberService.findMember(1L);
        //then
        *//*샘플 데이터 == 데이터저장소에 있는 회원 ?*//*
        Assertions.assertThat(member).isEqualTo(findMember);
    }*/

    /*@BeforeEach는 각 테스트를 실행하기 전에 호출된다.*/
    @BeforeEach
    public  void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

}