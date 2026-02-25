package com.study.baemin.api.domain.user.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserUpdateDTO {
    private String name;
    private String nickname;
    private String grade;
    private String address;


    private String email;
    private String pw;
    private String phone;

}
