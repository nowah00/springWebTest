package com.ssg.membertestspringprj.domain_jdbcTemplete;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    private String userId;
    private String userPwd;
    private String userName;
    private String userEmail;
    private LocalDate joinDate;
}
