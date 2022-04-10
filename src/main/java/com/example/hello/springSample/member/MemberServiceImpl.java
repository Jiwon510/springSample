package com.example.hello.springSample.member;

/*회원서비스 구현체*/
public class MemberServiceImpl implements MemberService {

    /*회원 저장소 참조*/
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /*회원가입*/
    @Override
    public void join(Member member) {
//        회원 저장소에 회원 정보를 저장 및 가입
        memberRepository.save(member);
    }

    /*회원조회*/
    @Override
    public Member findMember(Long memberId) {
//        회원 저장소에서 memberId를 통해 조회
        return memberRepository.findById(memberId);
    }
}
