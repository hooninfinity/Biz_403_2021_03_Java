package com.callor.app;

import com.callor.app.service.ScoreService;
import com.callor.app.service.impl.ScoreServiceImplV1;

public class TestEx_01 {
	
	public static void main(String[] args) {
		
		ScoreService ssV1 = new ScoreServiceImplV1();
		ssV1.selectMenu();
		ssV1.inputName();
		ssV1.inputScore();
		ssV1.printScore();
		
	}

}
