package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

// 默认（只能扫描project内的bean）
//@SpringBootApplication
// 自定义（可扫描project外的bean）
@ComponentScan(basePackages={"com","chok2.context"})
@EnableAutoConfiguration
public class KeycloakExampleProviderApiApp
{
	public static void main(String[] args)
	{
		SpringApplication.run(KeycloakExampleProviderApiApp.class, args);
	}
}