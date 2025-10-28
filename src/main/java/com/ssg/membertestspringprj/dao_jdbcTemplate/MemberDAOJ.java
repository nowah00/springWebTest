package com.ssg.membertestspringprj.dao_jdbcTemplate;

import com.ssg.membertestspringprj.domain_jdbcTemplete.Member;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberDAOJ {

    int memberRegister(Member member);

    List<Member> memberList();
}
