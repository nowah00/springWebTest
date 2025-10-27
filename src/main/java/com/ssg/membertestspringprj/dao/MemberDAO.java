package com.ssg.membertestspringprj.dao;

import com.ssg.membertestspringprj.dto.MemberDTO;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MemberDAO {

    int memberRegister(MemberDTO member);

    List<MemberDTO> memberList();
}
