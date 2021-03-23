package com.callor.apps;

import java.util.Random;
/*
 * 정수형배열 intScores 10개 선언(10과목의 점수)
 * Random 클래스로 50~100까지 점수를 만들어
 * intScores에 저장
 * 
 * intScores의 점수의 총점, 평균
 */
public class App_03 {
	
	public static void main(String[] args) {
		// 10과목의 배열 선언, 랜덤클래스 선언
		int[] intScores = new int[10];
		Random rnd = new Random();
		
		// 랜덤클래스로 점수 만들고
		for (int i = 0; i < 10; i++) {
			intScores[i] = rnd.nextInt(51) + 50;
		}
		
		int intTotal = 0;
		float floatAvg = 0;
		
		for (int i = 0; i < 10; i++) {
			intTotal += intScores[i];
		}
		// 평균은 전체 총점을 계산한 후에
		// 한번만 계산을 수행하면 된다.
		// 평균을 총점과 같이 for() 반복문에서 계산할 필요 없다.
		floatAvg = (float)intTotal / 10;
		
		System.out.println("============================");
		System.out.printf("총점:%d   평균:%3.2f\n",intTotal,floatAvg);
		System.out.println("============================");
		
		
		
		
		
	}
	

}
