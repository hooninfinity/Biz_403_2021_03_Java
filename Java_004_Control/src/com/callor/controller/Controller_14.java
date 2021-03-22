package com.callor.controller;

import java.util.Iterator;
import java.util.Random;

/*
 * 1. 1 ~ 100까지 범위의 랜덤수로 국어, 영어, 수학 과목의 점수를 생성
 * 2. 각 과목의 점수를 변수에 저장하고
 * 3. 총점과 평균을 계산하여 출력합니다. 평균은 소수점이하 둘째자리까지
 * ======================================
 * 국어 : 
 * 영어 : 
 * 수학 : 
 * --------------------------------------
 * 총점 :            , 평균 :
 * ======================================
 */
public class Controller_14 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int intKor = 0;
		int intEng = 0;
		int intMath = 0;
		intKor = rnd.nextInt(100)+1;
		intEng = rnd.nextInt(100)+1;
		intMath = rnd.nextInt(100)+1;
		
		int intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
		float floatAvg = (float)intSum / 3;
		
		System.out.println("==========================");
		System.out.printf("국어 : %d\n" , intKor);
		System.out.printf("영어 : %d\n" , intEng);
		System.out.printf("수학 : %d\n" , intMath);
		System.out.printf("총점 : %d, 평균 : %3.2f\n",intSum, floatAvg);
		System.out.println("==========================");
	}

}















