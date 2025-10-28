package com.ssg.membertestspringprj.service;

import com.ssg.membertestspringprj.dao_jdbcTemplate.MemberDAOJ;
import com.ssg.membertestspringprj.domain_jdbcTemplete.Member;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Log4j2
public class MemberServiceImpl implements MemberServiceJ {
    // @RequiredArgsConstructor + private final ??? -> 싱글톤 패턴에서 생성자 주입 방식 적용
    private final MemberDAOJ memberDAOJ;

    @Override
    public void save(Member member) {
        log.info("save() 호출");
        memberDAOJ.memberRegister(member);
    }

    @Override
    public List<Member> finaAll() {
        log.info("findAll() 호출");
        return memberDAOJ.memberList();
    }
}
