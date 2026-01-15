package com.study.baemin.api.domain.user.repository;

import com.study.baemin.api.domain.user.dto.UserCreateRequestDto;
import com.study.baemin.api.domain.user.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface UserMapper {
List<User> getAllUser();
User getUserTarget(String _id);
User getUserByName(String _name);
int createUser(UserCreateRequestDto userCreateRequest);

}
