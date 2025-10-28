package com.ssg.membertestspringprj.service;

import com.ssg.membertestspringprj.domain_jdbcTemplete.Member;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface MemberServiceJ {

    void save(Member member);

    List<Member> finaAll();
}
