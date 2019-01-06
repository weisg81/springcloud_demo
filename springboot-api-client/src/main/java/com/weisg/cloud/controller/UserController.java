package com.weisg.cloud.controller;


import com.weisg.cloud.entity.User;
import com.weisg.cloud.service.UserClientService;
import com.weisg.cloud.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author weisangeng
 * @since 2019-01-05
 */
@RestController
@RequestMapping("/consumer/user")
public class UserController {

    @Autowired
    private UserClientService userClientService;

    @GetMapping("/getUserInfo")
    public ResponseResult<User> get(String userId) {
        System.out.println("userClientService...."+userId);
        return userClientService.get(userId);
    }

}

