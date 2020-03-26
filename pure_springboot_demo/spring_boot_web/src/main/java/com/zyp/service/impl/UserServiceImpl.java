package com.zyp.service.impl;

import com.zyp.dao.UserMapper;
import com.zyp.pojo.User;
import com.zyp.pojo.UserExample;
import com.zyp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述:
 *
 * @author zyp
 * @description 用户service接口实现类
 * @create 2019-11-20 16:31
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * @author:zyp
     * @description 获取用户列表
     * @date: 2019/11/20 16:33
     * @return
     */
    @Override
    public List<User> getUserList(){
        UserExample userExample = new UserExample();
        List<User> users = userMapper.selectByExample(userExample);
        return users;
    }

}