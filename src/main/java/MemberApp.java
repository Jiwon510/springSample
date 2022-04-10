/*회원 서비스 기능 테스트(콘솔)*/
public class MemberApp {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        /*샘플 데이터 생성*/
        Member member = new Member(1L, "memberA", Grade.VIP);

        /*데이터를 회원 서비스에 저장*/
        memberService.join(member);

        /*회원 조회*/
        Member findMember = memberService.findMember(1L);

        System.out.println("new member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());
    }
}
