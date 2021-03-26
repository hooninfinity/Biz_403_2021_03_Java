package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV1 {
	
	int[] intKor;
	int[] intEng;
	int[] intMath;
	int[] intTotal;
	float[] floatAvg;
	Scanner scan;

	// 생성자
	public ScoreServiceV1() {
		intKor = new int[5];
		intEng = new int[intKor.length];
		intMath = new int[intKor.length];
		intTotal = new int[intKor.length];
		floatAvg = new float[intKor.length];
		scan = new Scanner(System.in);
	}
	
	// 국어, 영어, 수학의 점수 입력
	public void makeScore() {
		for (int i = 0; i < intKor.length; i++) {
			System.out.print(i+1 + "번 학생의 국어 점수를 입력합니다 : ");
			intKor[i] = scan.nextInt();
			System.out.print(i+1 + "번 학생의 영어 점수를 입력합니다 : ");
			intEng[i] = scan.nextInt();
			System.out.print(i+1 + "번 학생의 수학 점수를 입력합니다 : ");
			intMath[i] = scan.nextInt();
			System.out.println(LinesService.sLines(50));

		}
		System.out.println(LinesService.dLines(50));

	}
	
	// 합계, 평균 계산
	public void makeSum() {
		for (int i = 0; i < intKor.length; i++) {
			intTotal[i] = intKor[i];
			intTotal[i] += intEng[i];
			intTotal[i] += intMath[i];
			floatAvg[i] = (float)intTotal[i] / 3;
		}
	}
	
	// 최종 출력
	public void printScore() {
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		for(int i = 0 ; i < intKor.length ; i++) {
			System.out.printf("%3d\t", i+1);
			System.out.printf("%3d\t", intKor[i]);
			System.out.printf("%3d\t", intEng[i]);
			System.out.printf("%3d\t", intMath[i]);
			System.out.printf("%3d\t", intTotal[i]);
			System.out.printf("%3.2f\t\n", floatAvg[i]);
		}
		System.out.println(LinesService.dLines(50));
		
	}
	
	

}





