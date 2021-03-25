package com.callor.apps;

import java.util.Random;
/*
 * 1. 정수형 배열 20개 선언
 * 2. 랜덤클래스사용, 50~100까지 난수 생성하여 배열 저장
 * 3. 배열에 저장된 정수 중 Prime(소수)인 수들의 리스트 출력
 *  ** Prime(소수)는 2 ~ (자신-1)까지의 수로 나누었을 때 나머지가 0이 한번도 나오지 않아야 한다.
 */
public class App_01B {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] intNums = new int[20];
		for(int i = 0 ; i < intNums.length ; i++) {
			intNums[i] = rnd.nextInt(51) + 50;
		}
		
		for(int arr = 0 ; arr < intNums.length ; arr++) {
			
			int num = 0;
			int numP = intNums[arr];
			for(num = 2 ; num < numP ; num++) {
				if(numP % num == 0) {
					break;
				}
			}
			if(num < numP) {
				System.out.println(numP + "는 소수가 아님");
			} else {
				System.out.println(numP + "는 소수");
			}
		}
		
		
		
	}

}
