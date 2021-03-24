package com.callor.apps;
/*
 * 1. 정수형 배열 20개를 선언합니다.
 * 2. Random 클래스를 사용하여 1~100까지 난수를 생성하여 배열에 저장합니다.
 * 3. 배열에 저장된 정수 중 짝수들의 리스트를 출력하고, 짝수들의 합을 계산하여 출력합니다.
 */
/*
 * {  } 안에 있는 코드는 최소화 하자
 * 작은 일들로 분해하기
 * 
 * 나누어서 정복하라 : Divide and Conquer
 */
import java.util.Random;

public class App_01 {
	
	public static void main(String[] args) {
		/*
		 * 배열의 크기를 변수에 설정해두고 코드내에서 공통으로 사용하기
		 */
		int numsLength = 10;
		// 정수형 배열 20개 선언
		int[] intNum = new int[numsLength];
		int intSum = 0;
		Random rnd = new Random();
		
		// 랜덤클래스사용하여 1~100까지의 난수 20개 생성
		for (int i = 0; i < numsLength; i++) {
			intNum[i] = rnd.nextInt(100) + 1;
			if(intNum[i] % 2 == 0) {
				intSum += intNum[i];
				System.out.println(intNum[i]);
			}
		}
		System.out.println("=========================");
		System.out.println("짝수들의 합: " + intSum);
	}

}
