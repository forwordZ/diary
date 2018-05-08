package com.book;

import com.zxq.logo.Zxq;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiaryApplication {

	public static void main(String[] args) {
		Zxq.run(DiaryApplication.class, args);
	}
}
