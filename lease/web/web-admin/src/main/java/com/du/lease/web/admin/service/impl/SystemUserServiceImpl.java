package com.du.lease.web.admin.service.impl;

import com.du.lease.model.entity.SystemUser;
import com.du.lease.web.admin.mapper.SystemUserMapper;
import com.du.lease.web.admin.service.SystemUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author weicheng
 * @description 针对表【system_user(员工信息表)】的数据库操作Service实现
 
 */
@Service
public class SystemUserServiceImpl extends ServiceImpl<SystemUserMapper, SystemUser>
        implements SystemUserService {

}




