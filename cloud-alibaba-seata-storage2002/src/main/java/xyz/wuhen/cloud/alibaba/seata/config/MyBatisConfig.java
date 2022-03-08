package xyz.wuhen.cloud.alibaba.seata.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"xyz.wuhen.cloud.alibaba.seata.dao"})
public class MyBatisConfig {
}
 
