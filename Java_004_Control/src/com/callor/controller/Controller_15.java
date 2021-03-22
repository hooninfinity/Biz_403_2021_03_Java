package com.callor.controller;

import java.util.Random;

/*
 * 1. 학생 10명의 국어 점수를 저장할 변수 선언
 * 2. 1 ~ 100까지 범위의 임의 점수를 생성하여 변수에 저장
 * 3. 총점과 평균을 계산하여 출력합니다.
 * ======================================
 * 학생1 : 
 * 학생2 : 
 *   :
 * --------------------------------------
 * 총점 :            , 평균 : 00.00
 * ======================================
 */
public class Controller_15 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int intKor1 = rnd.nextInt(100)+1;
		int intKor2 = rnd.nextInt(100)+1;
		int intKor3 = rnd.nextInt(100)+1;
		int intKor4 = rnd.nextInt(100)+1;
		int intKor5 = rnd.nextInt(100)+1;
		int intKor6 = rnd.nextInt(100)+1;
		int intKor7 = rnd.nextInt(100)+1;
		int intKor8 = rnd.nextInt(100)+1;
		int intKor9 = rnd.nextInt(100)+1;
		int intKor10 = rnd.nextInt(100)+1;
		
//		for (int i = 0; i < 10; i++) {
//			int num = i + 1;
//			
//			/*
//			 * num 변수하고 
//			 * intKor 이름하고 합하여 
//			 * 		intKor1 ~ 5 처럼 만들수 있을거 같은데 안된다.
//			 * intKornum 이라고 작성하면 java는
//			 * inKornum 이라는 변수를 찾으려고 시도한다.
//			 * 
//			 */
//			
//		}
		
		
		int intSum = intKor1;
		intSum += intKor2;
		intSum += intKor3;
		intSum += intKor4;
		intSum += intKor5;
		intSum += intKor6;
		intSum += intKor7;
		intSum += intKor8;
		intSum += intKor9;
		intSum += intKor10;
		
		float floatAvg = (float)intSum / 10;
		
		
		System.out.println("================================");
		System.out.printf("학생1 : %d\n", intKor1);
		System.out.printf("학생2 : %d\n", intKor2);
		System.out.printf("학생3 : %d\n", intKor3);
		System.out.printf("학생4 : %d\n", intKor4);
		System.out.printf("학생5 : %d\n", intKor5);
		System.out.printf("학생6 : %d\n", intKor6);
		System.out.printf("학생7 : %d\n", intKor7);
		System.out.printf("학생8 : %d\n", intKor8);
		System.out.printf("학생9 : %d\n", intKor9);
		System.out.printf("학생10 : %d\n", intKor10);
		System.out.println("--------------------------------");
		System.out.printf("총점 : %d, 평균 : %3.2f\n", intSum, floatAvg);
		System.out.println("================================");

	}

}




