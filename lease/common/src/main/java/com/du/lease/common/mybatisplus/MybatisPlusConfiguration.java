package com.du.lease.common.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.du.lease.web.*.mapper")
public class MybatisPlusConfiguration {

}