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

/*리팩터링*/
public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(
                new MemoryMemberRepository(),
                new FixDiscountPolicy());
    }

    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public DiscountPolicy discountPolicy() {
//        return new FixDicountPolicy();
        return new RateDiscountPolicy();
    }
}
