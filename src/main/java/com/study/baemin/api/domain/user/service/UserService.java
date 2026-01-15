package com.study.baemin.api.domain.user.service;

import com.study.baemin.api.domain.user.dto.UserCreateRequestDto;
import com.study.baemin.api.domain.user.entity.User;
import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User getUserTarget(String a);
    User getUserByName(String name);

    String createUser(UserCreateRequestDto userCreateRequest);
}
