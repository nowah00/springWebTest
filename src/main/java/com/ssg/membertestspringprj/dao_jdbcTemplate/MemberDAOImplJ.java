package com.ssg.membertestspringprj.dao_jdbcTemplate;

import com.ssg.membertestspringprj.domain_jdbcTemplete.Member;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
@Log4j2
@RequiredArgsConstructor
public class MemberDAOImplJ implements MemberDAOJ {

    private final JdbcTemplate jdbcTemplate;

    private static final RowMapper<Member> MEMBER_ROW_MAPPER = new RowMapper<Member>() {
        @Override
        public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
            Member member = new Member();
            member.setUserId(rs.getString("userId"));
            member.setUserPwd(rs.getString("userPwd"));
            member.setUserName(rs.getString("userName"));
            member.setUserEmail(rs.getString("userEmail"));
            java.sql.Date joinDate = rs.getDate("joinDate");
            member.setJoinDate(joinDate.toLocalDate());
            return member;
        }
    };

    @Override
    public int memberRegister(Member member) {
        String sql = "INSERT INTO member(userId, userPwd, userName, userEmail, joinDate) VALUES(?,?,?,?,?)";
        return jdbcTemplate.update(sql,
                member.getUserId(),
                member.getUserPwd(),
                member.getUserName(),
                member.getUserEmail(),
                java.sql.Date.valueOf(String.valueOf(member.getJoinDate()))
        );
    }

    @Override
    public List<Member> memberList() {
        String sql = "SELECT  userId, userPwd, userName, userEmail, joinDate FROM member ORDER BY userId";
        return jdbcTemplate.query(sql, MEMBER_ROW_MAPPER);
    }
}
