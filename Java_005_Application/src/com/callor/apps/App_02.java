package com.callor.apps;

import java.util.Random;

public class App_02 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] intMembers = new int[5];
		
		// intMembers의 0번째 배열에...
		// 난수를 만들어 저장하라
		intMembers[0] = 30; // rnd.nextInt(26) + 25;
		intMembers[1] = 50; // rnd.nextInt(26) + 25;
		intMembers[2] = 33; // rnd.nextInt(26) + 25;
		intMembers[3] = 28; //rnd.nextInt(26) + 25;
		// 배열의 개수가 5개이므로
		// 첨자의 최대값은 4까지 이다
		// 첨자의최대값 = 배열의 개수 - 1
		intMembers[4] = 28; // rnd.nextInt(26) + 25;
		intMembers[0] = 0;
		
		
		for (int i = 0; i < 5; i++) {
			intMembers[i] = rnd.nextInt(26) + 25;
		}
		
		for (int i = 0; i < 5; i++) {
			// System.out.println("인원수:" + intMembers[i]);
			System.out.printf("%d반 인원수: %d\n", i+1, intMembers[i]);
		}
		
		
		// 이제 간단하게 앞의 피자계산 해보자
		for (int i = 0; i < 5; i++) {
			// 학급인원수에 6을 나눈 값을 pizzaBox 변수에 담고
			int pizzaBox = intMembers[i] / 6;
			// 만일 학급인원수 / 피자박스*6 한 값이 0보다 크다면(나머지가 나온다면) 못먹는 사람이 있다는 뜻
			// pizzaBox에 ++ 하여 추가시킨다
			if (intMembers[i] % (pizzaBox * 6) > 0) {
				pizzaBox++;
			}
			System.out.printf("%d반 인원수:%d, 피자주문:%d\n", (i+1), intMembers[i], pizzaBox);
			
		}
		
		
		
		
		
	}

}









