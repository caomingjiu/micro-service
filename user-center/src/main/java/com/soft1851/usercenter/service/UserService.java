package com.soft1851.usercenter.service;

import com.soft1851.usercenter.dao.UserMapper;
import com.soft1851.usercenter.domain.dto.UserDto;
import com.soft1851.usercenter.domain.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author cmj
 * @version 1.0
 * @ClassName UserService
 * @Description TODO
 * @date 2020-09-19 20:59
 **/
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserService {

    private final UserMapper userMapper;

    public UserDto getUserDto(int id){
        User user = userMapper.selectByPrimaryKey(id);
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setUserName(user.getUserName());
        userDto.setAvatarUrl(user.getAvatarUrl());
        return userDto;
    }
}