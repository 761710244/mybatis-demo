package com.mayikt.mybatis.Controller;

import com.mayikt.mybatis.Model.User;
import com.mayikt.mybatis.Service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Api
@RestController
public class UserController {
    @Resource
    private UserService userService;

    @ApiOperation(value = "根据id查询用户", notes = "根据id查询用户")
    @GetMapping("/getUserById")
    public User selectUserById(@RequestParam @ApiParam("id") Integer id) {
        return userService.selectUserById(id);
    }

}
