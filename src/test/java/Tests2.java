import com.ssg.membertestspringprj.dao_jdbcTemplate.MemberDAOJ;
import com.ssg.membertestspringprj.domain_jdbcTemplete.Member;
import com.ssg.membertestspringprj.service.MemberServiceJ;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;
import java.util.List;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/root-context.xml")
@Log4j2
public class Tests2 {
    @Autowired
    private MemberDAOJ memberDAOJ;

    @Autowired
    private MemberServiceJ memberServiceJ;

    // DAO Test
    @Test
    public void testMemberRegister() {
        Member member = Member.builder()
                .userId("uiui")
                .userPwd("upup")
                .userName("unun")
                .userEmail("ueue")
                .joinDate(LocalDate.now())
                .build();
        memberDAOJ.memberRegister(member);
    }

    @Test
    public void testMemberList() {
        List<Member> members = memberDAOJ.memberList();
        for (Member member : members) {
            log.info(member);
        }
    }

    // Service Test
    @Test
    public void testSave() {
        Member member = Member.builder()
                .userId("uiuiui")
                .userPwd("upupup")
                .userName("ununun")
                .userEmail("ueueue")
                .joinDate(LocalDate.now())
                .build();
        memberServiceJ.save(member);
    }

    @Test
    public void testFindAll() {
        List<Member> members = memberServiceJ.finaAll();
        for (Member member : members) {
            log.info(member);
        }
    }
}
