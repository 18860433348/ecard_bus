package com.ets.tkmybatistest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;

@EnableScheduling
@SpringBootApplication()
@MapperScan(value = "com.ets.tkmybatistest.mapper")
@ComponentScan
public class TkMybatisTestApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(TkMybatisTestApplication.class, args);
	}

	/*protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(TkMybatisTestApplication.class);
	}*/

}
