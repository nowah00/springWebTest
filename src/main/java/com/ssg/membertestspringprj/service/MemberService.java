package com.ssg.membertestspringprj.service;

import com.ssg.membertestspringprj.dto.MemberDTO;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface MemberService {

    void save(MemberDTO member);

    List<MemberDTO> finaAll();
}
