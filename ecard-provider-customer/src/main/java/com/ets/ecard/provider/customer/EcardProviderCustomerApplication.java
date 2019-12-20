package com.ets.ecard.provider.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.ets.ecard.common.mapper")
public class EcardProviderCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcardProviderCustomerApplication.class, args);
	}

}
