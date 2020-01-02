package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	private String[] data = {
			"fortune 0",
			"fortune 1",
			"fortune 2",
	};
	
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		int index = random.nextInt(data.length);
		String fortune = data[index];
		return fortune;
	}

}
