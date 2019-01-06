package com.weisg.cloud.controller;


import com.weisg.cloud.controller.api.UserControllerApi;
import com.weisg.cloud.entity.User;
import com.weisg.cloud.service.UserService;
import com.weisg.cloud.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author weisangeng
 * @since 2019-01-05
 */
@RestController
@RequestMapping("/user")
public class UserController implements UserControllerApi {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUserInfo", method = RequestMethod.GET)
    public ResponseResult<User> get(@RequestParam("userId") String userId) {
        System.out.println("provider getUserInfo ...userId=."+userId);
        return new ResponseResult<User>(userService.getUserInfoById(userId));
    }

}

