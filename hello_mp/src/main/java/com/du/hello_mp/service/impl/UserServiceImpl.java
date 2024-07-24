package com.du.hello_mp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.du.hello_mp.entity.User;
import com.du.hello_mp.mapper.UserMapper;
import com.du.hello_mp.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
