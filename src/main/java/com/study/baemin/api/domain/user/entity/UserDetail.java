package com.study.baemin.api.domain.user.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

@Getter
@Setter
@NoArgsConstructor
public class UserDetail {

    @Schema(description ="여기는 entity 라서 모두 설명 써준다고 함...")
    private int userSeq;
    private String userName;
    private String usernickname;
    private String userAddress;
    private String userGrade;
    private String userEmail;
    private String userPw;
    private DateTimeFormat userCreatedAt;
    private String userPhone;

}
