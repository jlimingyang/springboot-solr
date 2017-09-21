package com.item1024;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

//@SpringBootApplication  =  @Configuration   @EnableAutoConfiguration   @ComponentScan

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.item1024.*"})
@RestController    //相当于 @resposbody和@controller
public class SpringDemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringDemoApplication.class, args);
		SpringApplication application = new SpringApplication(SpringDemoApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}
	@RequestMapping("/hello")
	String home(HttpServletRequest request){
		System.out.println(request.toString());
		return "hello world 123";
	}
}
