package com.zyp.controller;

import com.zyp.db.DataSourceEnum;
import com.zyp.db.DynamicDataSource;
import com.zyp.pojo.User;
import com.zyp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 描述:
 *
 * @author zyp
 * @description 测试controller控制器
 * @create 2019-11-20 15:01
 */
@Controller
@RequestMapping(value = "/windows")
public class TestController {

    @Autowired
    private UserService userService;

    /**
     * @author:zyp
     * @description 跳转到test页面
     * @date: 2019/11/20 15:24
     * @return 
     */
    @RequestMapping(value = "/toTest")
    public String toTest(){
        return "/index";
    }

    /**
     * @author:zyp
     * @description 获取用户列表
     * @date: 2019/11/20 16:43
     * @return 
     */
    @RequestMapping(value = "/getUserList")
    @ResponseBody
    public Object getUserList(int type){
        if(type==0){
            DynamicDataSource.setDataSource(DataSourceEnum.FIRST.getName());
        }else{
            DynamicDataSource.setDataSource(DataSourceEnum.SECOND.getName());
        }
        List<User> userList = userService.getUserList();
        return userList;
    }
}