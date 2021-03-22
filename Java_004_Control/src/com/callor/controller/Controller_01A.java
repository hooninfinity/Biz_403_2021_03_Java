package com.callor.controller;

public class Controller_01A {
	
	public static void main(String[] args) {
		
//		// 1. 0 ~ 99 + 1 => 1 ~ 100
//		for (int index = 0; index < 100; index++) {
//			
//			//1-1. 1 ~ 100
//			int num = index +1;
//			
//			// 3ㅇㄹ
//			if(num % 3 == 0) {
//				System.out.print(num);
//				System.out.print(",");
//			}
//		}
//		
		// 3의 배수의 합, 4의 배수의 합
		// 합을 구하기 위해 변수를 선언
		int intSum3 = 0;
		int intSum4 = 0;
		int intSum5 = 0;
		for(int index = 0 ; index < 100; index++) {
			int num = index + 1;
			// num값이 3의 배수이면
			// num값을 intSum3 변수에 누적하라
			if(num % 3 == 0) {
				intSum3 += num ;
			}
			/*
			 * 여기에서 else if를 사용하면 3의 배수이면서 4의 배수일 경우
			 * 3의 배수에는 합산(누적)이 되지만 4의 배수에는 누락이 된다.
			 */
			if(num % 4 == 0) {
				intSum4 += num ;
			}
			/*
			 * 3의 배수이면서 5의 배수
			 * num % 3 == 0 AND num % 5 == 0
			 */
			if(num % 3 == 0) {
				if(num % 5 == 0) {
					intSum5 += num;
				}
			}
		}
		
		System.out.println("======================");
		System.out.printf("3의 배수 : " + intSum3 + "\n");
		System.out.printf("4의 배수 : " + intSum4 + "\n");
		System.out.printf("3 AND 5의 배수 : " + intSum5);
		
		
				
	}

}
