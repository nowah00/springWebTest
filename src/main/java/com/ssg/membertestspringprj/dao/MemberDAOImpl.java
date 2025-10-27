package com.ssg.membertestspringprj.dao;

import com.ssg.membertestspringprj.dto.MemberDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository
//@Primary
@Qualifier("first")
@Log4j2
@RequiredArgsConstructor
public class MemberDAOImpl implements MemberDAO{

    private final DataSource dataSource;

    @Override
    public int memberRegister(MemberDTO member) {
        log.info("memberRegister() 호출");

        String sql = "insert into t_member (mid,mpw,mname) values(?,?,?)";

        try (Connection conn = dataSource.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, member.getMid());
            ps.setString(2, member.getMpw());
            ps.setString(3, member.getMname());
            return ps.executeUpdate();
        } catch (Exception e) {
            log.info("memberRegister 실패");
            return 0;
        }
    }

    @Override
    public List<MemberDTO> memberList() {
        log.info("memberList() 호출");

        String sql = "SELECT * FROM t_member";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            List<MemberDTO> list = new ArrayList<>();
            while (rs.next()) {
                MemberDTO member = new MemberDTO();
                member.setMid(rs.getString("mid"));
                member.setMpw(rs.getString("mpw"));
                member.setMname(rs.getString("mname"));
                list.add(member);
            }
            log.info("memberList 성공");
            return list;
        } catch (Exception e) {
            log.info("memberList 실패");
            return null;
        }
    }
}
