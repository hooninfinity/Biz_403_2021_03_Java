package com.callor.method.service;

public class NumberServiceV7 {

	String[] sub;
	Integer[] subScore;
	InputService inService;
	
	
	public NumberServiceV7() {
		sub = new String[] {"국어","영어","수학","과학","국사"};
		subScore = new Integer[5];
		inService = new InputService();
	}
	
//	// 배열을 이용하지 않는 경우
//	public void inputNum() {
//		Integer intKor = null;
//		while(true) {
//			intKor = inService.inputValue("국어");
//			if (intKor == null) {
//				return;
//			} else if (intKor < 0 || intKor > 100) {
//				System.out.println("점수는 0 ~ 100");
//				continue;
//			}
//			break;
//		}
//	}
	
	public Integer inputScore() {
		for(int i = 0 ; i < sub.length ; i++) {
			subScore[i] = sub[i];
		}
	}
	
	public Integer intNum() {
		while (true) {
			Integer retNum = inService.inputValue("정수(0 ~ 100)");
			if (retNum == null) {
				return null;
			} else if (retNum < 0 || retNum > 100) {
				System.out.println("정수 0 ~ 100 까지 입력");
				continue;
			} else {
				return retNum;
			}
		}
	}
	
	
	
}
