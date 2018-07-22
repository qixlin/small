package io.redos.small;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@ServletComponentScan
@MapperScan("io.redos.small.dao")
public class SmallApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SmallApplication.class, args);
	}
}
