package com.weisg.cloud.controller.api;

import com.weisg.cloud.entity.User;
import com.weisg.cloud.utils.ResponseResult;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Description 这个类作用是什么
 * Author WEISANGENG
 * Date 2019/1/5
 **/
@Api(value = "RESTful API", description = "The 用户表 API")
public interface UserControllerApi {

    @ApiOperation(value = "通过ID查询", nickname = "通过ID查询", notes = "通过ID查询", response = ResponseResult.class, tags = {
            "user", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "success", response = ResponseResult.class),
            @ApiResponse(code = 400, message = "Invalid service supplied"),
            @ApiResponse(code = 404, message = "request not found") })
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "通过ID查询", required = true, dataType = "String")
    })
    @RequestMapping(value = "/getUserInfo", method = RequestMethod.GET)
    ResponseResult<User> get(String userId);
}
