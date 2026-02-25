package com.study.baemin.api.domain.user.service;

import com.study.baemin.api.domain.user.dto.UserCreateRequestDto;
import com.study.baemin.api.domain.user.entity.User;
import com.study.baemin.api.domain.user.entity.UserDetail;
import com.study.baemin.api.domain.user.repository.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;


@Service
public class UserServiceImpl implements UserService{
    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper){
        this.userMapper=userMapper;

    }

    @Override
    public List<User> getAllUser() {
        List<User> _userList=userMapper.getAllUser();
        return _userList;
    }

    @Override
    public List<UserDetail> getAllUserDetail() {
        List<UserDetail> _userList=userMapper.getAllUserDetail();
        return _userList;
    }

    @Override
    public User getUserTarget(String _id) {
        return userMapper.getUserTarget(_id);
    }

    @Override
    public User getUserByName(String _name) {
        return userMapper.getUserByName(_name);
    }

    @Transactional
    @Override
    public String insertUser(UserCreateRequestDto _createDto) {
        int insert=userMapper.insertUser(_createDto);
        int detail=userMapper.insertUserDetail(_createDto);
        return (insert > 0 && detail>0) ? "Success" : "Fail";
    }

    @Override
    public String updateUserData(int id, UserCreateRequestDto userCreateRequestDto) {

        boolean hasUser=
                        userCreateRequestDto.getName()!=null||
                        userCreateRequestDto.getNickname()!=null||
                        userCreateRequestDto.getGrade()!=null||
                        userCreateRequestDto.getAddress()!=null;

        boolean hasDetail=
                userCreateRequestDto.getEmail()!=null||
                        userCreateRequestDto.getPw()!=null||
                        userCreateRequestDto.getPhone()!=null;
        if(!hasUser && !hasDetail) return "변동된거 없음";

        int total=0;
        if(hasUser) total+=userMapper.updateUserData(id,userCreateRequestDto);
        if(hasDetail) total+=userMapper.updateUserDetailData(id,userCreateRequestDto);

        return total>0?"Success" : "Fail";
    }

    @Transactional
    @Override
    public String deleteUserData(int id) {
        int detail=userMapper.deleteUserDetailData(id);
        int delete=userMapper.deleteUserData(id);
        return (delete>0 && detail>0) ? "Success" : "Fail";
    }

}
