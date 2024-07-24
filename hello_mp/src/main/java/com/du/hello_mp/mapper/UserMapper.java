package com.du.hello_mp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.du.hello_mp.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
