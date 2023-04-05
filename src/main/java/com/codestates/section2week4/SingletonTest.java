package com.codestates.section2week4;

import com.codestates.section2week4.member.MemberService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingletonTest {
    static AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DependencyConfig.class);

    static MemberService memberService1 = ac.getBean("memberService", MemberService.class);
    static MemberService memberService2 = ac.getBean("memberService", MemberService.class);
    public static void main(String[] args){
        System.out.println("memberService1 : " + memberService1);
        System.out.println("memberService2 : " + memberService2);
    }
} // 같은 멤버서비스를 사용하지만 뒤에 붙은 주소값이 다르다.
// singleton을 적용하면 singletonService를 사용하는 모든 객체는 같은 이스턴스를 바라보게 된다.

