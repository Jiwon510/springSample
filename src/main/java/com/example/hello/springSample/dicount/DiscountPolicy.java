package com.example.hello.springSample.dicount;

import com.example.hello.springSample.member.Member;

/*할인 정책*/
public interface DiscountPolicy {

    /*할인*/
    int discount(Member member, int price);
}

