package com.study.baemin.api.domain.user.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class User {

    @Schema(description ="여기는 entity 라서 모두 설명 써준다고 함...")
    private int memSeq;
    private String memId;
    private String name;
    private String email;
    private String grade;
    private String createdAt;

}
