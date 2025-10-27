import com.ssg.membertestspringprj.dao.MemberDAO;
import com.ssg.membertestspringprj.dto.MemberDTO;
import com.ssg.membertestspringprj.service.MemberService;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/root-context.xml")
@Log4j2
public class Tests {

    @Autowired
    private MemberDAO memberDAO;

    @Autowired
    private MemberService memberService;

    @Test
    public void register() {
        MemberDTO member = MemberDTO.builder()
                .mid("hawon")
                .mpw("pass")
                .mname("고하원")
                .build();
        memberDAO.memberRegister(member);
    }

    @Test
    public void findAll() {
        List<MemberDTO> members = memberDAO.memberList();
        for (MemberDTO memberDTO : members) {
            log.info(memberDTO);
        }
    }

    @Test
    public void memberRegister() {
        MemberDTO member = MemberDTO.builder()
                .mid("hawon4")
                .mpw("pass4")
                .mname("고하원4")
                .build();
        memberService.save(member);
    }

    @Test
    public void memberFindAll() {
        List<MemberDTO> members = memberService.finaAll();
        for (MemberDTO memberDTO : members) {
            log.info(memberDTO);
        }
    }

}
