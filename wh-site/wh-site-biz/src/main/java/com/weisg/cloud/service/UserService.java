package com.weisg.cloud.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.weisg.cloud.entity.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author weisangeng
 * @since 2019-01-05
 */
public interface UserService extends IService<User> {

    User getUserInfoById(String id);
}
