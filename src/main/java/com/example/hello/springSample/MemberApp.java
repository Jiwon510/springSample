package com.example.hello.springSample;

import com.example.hello.springSample.member.Grade;
import com.example.hello.springSample.member.Member;
import com.example.hello.springSample.member.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*회원 서비스 기능 테스트(콘솔)*/
public class MemberApp {

    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();

        /*AppConfig에 있는 @Bean이 있는 클래스를 가져와서 사용*/
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);

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
