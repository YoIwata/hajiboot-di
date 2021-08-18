package com.example.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Frontend {
	@Autowired
	ArgumentResolver argumentResolver;
	
	@Autowired
	Calculator calculator;
	
	public void run() {
		System.out.print("数字を入力 'a b' : ");
		Argument argument = argumentResolver.resolve(System.in);
		int result = calculator.calc(argument.getA(), argument.getB());
		System.out.println("結果: " + result);
	}
}
