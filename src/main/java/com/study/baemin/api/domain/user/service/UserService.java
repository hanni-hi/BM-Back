package com.study.baemin.api.domain.user.service;

import com.study.baemin.api.domain.user.dto.UserCreateRequestDto;
import com.study.baemin.api.domain.user.entity.User;
import com.study.baemin.api.domain.user.entity.UserDetail;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    List<UserDetail> getAllUserDetail();
    User getUserTarget(String a);
    User getUserByName(String name);

    String insertUser(UserCreateRequestDto userCreateRequest);
  //  String insertUserDetail(UserCreateRequestDto userCreateRequest);
  String updateUserData(int id, UserCreateRequestDto userCreateRequestDto);

String deleteUserData(int id);



}
