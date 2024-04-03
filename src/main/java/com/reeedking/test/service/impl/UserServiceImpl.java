package com.reeedking.test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.reeedking.test.mapper.UserMapper;
import com.reeedking.test.model.User;
import com.reeedking.test.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author wanghong
 * @Date  2024/4/3
 * @Description
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

}




