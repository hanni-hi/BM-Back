package com.study.baemin.api.domain.user.service;

import com.study.baemin.api.domain.user.dto.UserCreateRequestDto;
import com.study.baemin.api.domain.user.entity.User;
import com.study.baemin.api.domain.user.repository.UserMapper;
import org.springframework.stereotype.Service;

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
        List<User> _newList=new ArrayList<>();
        for(int i=0; i<_userList.size();i++)
        {
            if(_userList.get(i).getGrade().equals("PLAT"))
            {
                _newList.add(_userList.get(i));
            }
        }
        return _newList;
    }

    @Override
    public User getUserTarget(String _id) {
        return userMapper.getUserTarget(_id);
    }

    @Override
    public User getUserByName(String _name) {
        return userMapper.getUserByName(_name);
    }

    @Override
    public String createUser(UserCreateRequestDto _createDto) {
        int success=userMapper.createUser(_createDto);
        return success > 0 ? "Success" : "Fail";
    }
}
