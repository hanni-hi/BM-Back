package com.study.baemin.global.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.study.baemin.api.**.repository")
public class MybatisConfig {
}