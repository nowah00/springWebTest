package com.ssg.membertestspringprj.service;

import com.ssg.membertestspringprj.dao.MemberDAO;
import com.ssg.membertestspringprj.dto.MemberDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
@Log4j2
public class MemberServiceImpl implements MemberService{
    // @RequiredArgsConstructor + private final ??? -> 싱글톤 패턴에서 생성자 주입 방식 적용
    @Qualifier("first")
    private final MemberDAO memberDAO;

    @Override
    public void save(MemberDTO member) {
        log.info("save() 호출");
        int n = memberDAO.memberRegister(member);
        if (n > 0) {
            log.info("멤버가 성공적으로 생성되었습니다");
        } else {
            log.info("멤버 생성이 실패하였습니다.");
        }
    }

    @Override
    public List<MemberDTO> finaAll() {
        log.info("findAll() 호출");
        return memberDAO.memberList();
    }
}
