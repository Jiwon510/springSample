package com.example.hello.springSample;

import com.example.hello.springSample.AppConfig;
import com.example.hello.springSample.member.Grade;
import com.example.hello.springSample.member.Member;
import com.example.hello.springSample.member.MemberService;
import com.example.hello.springSample.order.Order;
import com.example.hello.springSample.order.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*주문 서비스 테스트(콘솔)*/
public class OrderApp {

    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();
        /*회원 서비스 객체*/
//        MemberService memberService = appConfig.memberService();

        /*주문 서비스 객체*/
//        OrderService orderService = appConfig.orderService();

        /*AppConfig에 있는 @Bean이 있는 클래스를 가져와서 사용*/
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);

        /*회원 샘플 데이터 생성*/
        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        /*주문 데이터 생성*/
        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
    }
}
