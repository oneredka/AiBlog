package com.icarus.ai.framework;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @className: ApplicationConfig
 * @description: TODO description
 * @tag
 * @author: louis
 * @date: 2023/7/28
 **/
@Configuration
// 表示通过aop框架暴露该代理对象,AopContext能够访问
@EnableAspectJAutoProxy(exposeProxy = true)
@MapperScan("com.icarus.**.mapper")
public class ApplicationConfig
{

}
