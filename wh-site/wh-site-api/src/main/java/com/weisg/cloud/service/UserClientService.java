package com.weisg.cloud.service;

import com.weisg.cloud.entity.User;
import com.weisg.cloud.fallback.UserClientServiceFallbackFactory;
import com.weisg.cloud.utils.ResponseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Description 这个类作用是什么
 * Author WEISANGENG
 * Date 2019/1/5
 **/
@FeignClient(value = "WH-SITE-BIZ",fallbackFactory=UserClientServiceFallbackFactory.class,path = "/user")
public interface UserClientService {

    @RequestMapping(value = "/getUserInfo", method = RequestMethod.GET)
    ResponseResult<User> get(@RequestParam("userId") String userId);
}
