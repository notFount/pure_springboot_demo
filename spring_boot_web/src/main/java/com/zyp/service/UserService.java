package com.zyp.service;

import com.zyp.pojo.User;

import java.util.List;

/**
 * 描述:
 *
 * @author zyp
 * @description 用户service接口
 * @create 2019-11-20 16:31
 */
public interface UserService {

    /**
     * @author:zyp
     * @description 获取用户列表
     * @date: 2019/11/20 17:44
     * @return 
     */
    List<User> getUserList();
    
}