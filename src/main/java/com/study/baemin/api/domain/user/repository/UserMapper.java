package com.study.baemin.api.domain.user.repository;

import com.study.baemin.api.domain.user.dto.UserCreateRequestDto;
import com.study.baemin.api.domain.user.entity.User;
import com.study.baemin.api.domain.user.entity.UserDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.*;

@Mapper
public interface UserMapper {
List<User> getAllUser();
User getUserTarget(String _id);
User getUserByName(String _name);
int insertUser(UserCreateRequestDto userCreateRequest);
int insertUserDetail(UserCreateRequestDto userCreateRequest);
    int deleteUserData(int id);
    int deleteUserDetailData(int id);
    int updateUserData(@Param("id") int id,@Param("dto") UserCreateRequestDto userCreateRequestDto);
    int updateUserDetailData(@Param("id") int id,@Param("dto") UserCreateRequestDto userCreateRequestDto);
List<UserDetail> getAllUserDetail();

}
