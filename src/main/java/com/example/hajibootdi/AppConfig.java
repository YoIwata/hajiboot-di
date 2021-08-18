package com.example.hajibootdi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.app.Calculator;
import com.example.app.Frontend;
import com.example.app.ScannerArgumentResolver;
import com.example.app.AddCalculator;
import com.example.app.ArgumentResolver;

// JavaConfig用のクラスであることを示す
@Configuration
public class AppConfig {

	// Beanを生成するメソッドに@Beanをつける
	// デフォルトではDIコンテナにつき1つのインスタンスのみ生成される
	@Bean
	public Calculator ccalculator() {
		// AddCalculatorインスタンスが、Calculator型でccalculatorという名前でDIコンテナに管理される
		return new AddCalculator();
	}

	@Bean
	public ArgumentResolver argumentResolver() {
		return new ScannerArgumentResolver();
	}
	
	@Bean
	public Frontend frontend() {
		return new Frontend();
	}
}
