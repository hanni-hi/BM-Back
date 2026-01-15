package com.study.baemin.api.domain.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserCreateRequestDto {
private String name;
private String id;
private String email;
private String grade;

}
