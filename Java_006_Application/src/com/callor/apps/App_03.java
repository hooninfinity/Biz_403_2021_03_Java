package com.callor.apps;

import java.util.Random;

/*
 * 1. 정수형 배열 20개를 선언합니다.
 * 2. Random 클래스를 사용하여 1~100까지 난수를 생성하여 배열에 저장합니다.
 * 3. 배열에 저장된 정수 중 짝수들이 몇 번 위치(첨자)에 저장되어 있는지 리스트를 출력.
 */
public class App_03 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] intNums = new int[20];
		
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(100) + 1;
		}
		
		// 요소 : 배열의 몇번째 값
		// 위치 : 배열의 몇번째
		// 첨자 : 배열의 몇번째 인가를 알려주는 값
		for (int i = 0; i < intNums.length; i++) {
			if (intNums[i] % 2 == 0) {
				
				// 짝수인 값을 출력
				// System.out.println(intNums[i]);
				
				// 몇번째 위치(요소, 첨자)에 저장되어 있나?
				// System.out.println(i);
				System.out.printf("%d 번째 값 : %d\n", i, intNums[i]);
				
			}
		}
		
		
		
		
		
		
	}

}
