//import com.ssg.membertestspringprj.dao.MemberDAO;
//import com.ssg.membertestspringprj.domain.MemberVO;
//import com.ssg.membertestspringprj.dto.MemberDTO;
//import com.ssg.membertestspringprj.service.MemberService;
//import lombok.extern.log4j.Log4j2;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//import java.util.List;
//
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("file:src/main/webapp/WEB-INF/root-context.xml")
//@Log4j2
//public class Tests {
//
//    @Autowired
//    private MemberDAO memberDAO;
//
//    @Autowired
//    @Qualifier("first")
//    private MemberService memberService;
//
//    // DAO Test
//    @Test
//    public void testMemberRegister() {
//        MemberVO member = MemberVO.builder()
//                .mid("hawon")
//                .mpw("pass")
//                .mname("고하원")
//                .build();
//        memberDAO.memberRegister(member);
//    }
//
//    @Test
//    public void testMemberList() {
//        List<MemberVO> members = memberDAO.memberList();
//        for (MemberVO memberVO : members) {
//            log.info(memberVO);
//        }
//    }
//
//    // Service Test
//    @Test
//    public void testSave() {
//        MemberDTO member = MemberDTO.builder()
//                .mid("hawon5")
//                .mpw("pass5")
//                .mname("고하원5")
//                .build();
//        memberService.save(member);
//    }
//
//    @Test
//    public void testFindAll() {
//        List<MemberDTO> members = memberService.finaAll();
//        for (MemberDTO memberDTO : members) {
//            log.info(memberDTO);
//        }
//    }
//
//}
