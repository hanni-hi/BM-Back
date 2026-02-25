package com.study.baemin.api.domain.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter
@AllArgsConstructor
public class UserCreateRequestDto {
    private BigInteger userSeq;
private String name;
private String nickname;
private String grade;
private String address;


private String email;
private String pw;
private String phone;
}
