package com.callor.apps;

import java.util.Random;
/*
 * 1. 정수형 배열 20개를 선언
 * 2. Random 클래스로 1~100 까지 배열에 저장
 * 3. 배열에 저장된 정수중 짝수가 저장된 최초의 위치(첨자)는 몇번째인가 출력
 */
public class App_04 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] intNums = new int[20];
		// int intNums[] = new int[20];
		
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(100)+1;
			if (intNums[i] % 15 == 0) {
				System.out.print("15의 배수가 저장된 최초의 위치 : ");
				System.out.println(i + " 번");
				break;
			}
		}
		
		
		
		
	}

}
