package com.oepncv.demo;

import nu.pattern.OpenCV;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OpencvDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpencvDemoApplication.class, args);
		OpenCV.loadShared();
	}

}
