package com.org.microserver;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OneServerApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(OneServerApplication.class, args);
	}

	public void onStartup(ServletContext servletContext) throws ServletException {
		
		
	}

}
	