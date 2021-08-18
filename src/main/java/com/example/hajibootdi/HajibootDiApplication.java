package com.example.hajibootdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.app.Frontend;

@SpringBootApplication
public class HajibootDiApplication {

	public static void main(String[] args) {
		// Spring Bootアプリケーションを起動する
		// 第１引数は@EnableAutoConfigurationをつけたクラス
		// このメソッドの返り値はDIコンテナの本体であるApplicationContextになる
		ApplicationContext context = SpringApplication.run(HajibootDiApplication.class, args);
		Frontend frontend = context.getBean(Frontend.class);
		frontend.run();
	}
}