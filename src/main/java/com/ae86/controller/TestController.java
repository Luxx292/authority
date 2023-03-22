package com.ae86.controller;

import com.ae86.entity.Result;
import com.ae86.entity.SysUser;
import com.ae86.service.SysUserService;
import com.baomidou.mybatisplus.extension.api.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Me1mei
 * @description 测试后端环境搭建
 * @createDate 2023-03-14  02:59
 */

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/user/list")
    public R userList(){
        List<SysUser> data = sysUserService.list();
        return R.ok(data);

    }


}
