package com.aha.shardingjdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScans(value = {@MapperScan(basePackages = "com.aha.shardingjdbc")})
public class AhaShardingJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(AhaShardingJdbcApplication.class, args);
    }

}
