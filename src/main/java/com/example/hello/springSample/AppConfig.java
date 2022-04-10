package com.example.hello.springSample;

import com.example.hello.springSample.dicount.DiscountPolicy;
import com.example.hello.springSample.dicount.FixDiscountPolicy;
import com.example.hello.springSample.dicount.RateDiscountPolicy;
import com.example.hello.springSample.member.MemberRepository;
import com.example.hello.springSample.member.MemberService;
import com.example.hello.springSample.member.MemberServiceImpl;
import com.example.hello.springSample.member.MemoryMemberRepository;
import com.example.hello.springSample.order.OrderService;
import com.example.hello.springSample.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*리팩터링*/
@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(
                new MemoryMemberRepository(),
                new FixDiscountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
//        return new FixDicountPolicy();
        return new RateDiscountPolicy();
    }
}
