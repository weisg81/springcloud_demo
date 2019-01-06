package com.weisg.cloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.weisg.cloud.entity.User;
import com.weisg.cloud.mapper.UserMapper;
import com.weisg.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author weisangeng
 * @since 2019-01-05
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;
    public User getUserInfoById(String id) {
        return userMapper.selectById(id);
    }
}
