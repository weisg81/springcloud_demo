package com.weisg.cloud.fallback;

import com.weisg.cloud.entity.User;
import com.weisg.cloud.service.UserClientService;
import com.weisg.cloud.utils.ResponseResult;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * Description 这个类作用是什么
 * Author WEISANGENG
 * Date 2019/1/5
 **/
@Component // 不要忘记添加，不要忘记添加
public class UserClientServiceFallbackFactory implements FallbackFactory<UserClientService> {
    public UserClientService create(Throwable throwable) {
        System.out.println(throwable.getMessage()+"================");
        return new UserClientService() {
            public ResponseResult<User> get(String userId) {
                User user = new User();
                user.setId(userId);
                user.setName("该ID：" + userId + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭");
                return new ResponseResult<User>(user);
            }
        };
    }
}
