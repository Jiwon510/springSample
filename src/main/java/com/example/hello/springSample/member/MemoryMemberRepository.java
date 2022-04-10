package com.example.hello.springSample.member;

import java.util.HashMap;
import java.util.Map;

/*메모리 회원 저장소*/
public class MemoryMemberRepository implements MemberRepository {

    /*저장소*/
    private static Map<Long, Member> store = new HashMap<>();

    /*저장*/
    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    /*조회*/
    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}

