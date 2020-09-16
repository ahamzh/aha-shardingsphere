package com.halo.shardingjdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScans(value = {@MapperScan(basePackages = "com.halo.shardingjdbc")})
public class HaloShardingJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(HaloShardingJdbcApplication.class, args);
    }

}
