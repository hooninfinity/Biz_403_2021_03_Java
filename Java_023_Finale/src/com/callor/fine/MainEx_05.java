package com.callor.fine;

import java.util.Random;

public class MainEx_05 {
	
	public static void main(String[] args) {
		Random rnd = new Random();
		int[] nums = new int[100];
		
		// 100개의 배열에 1 ~ 100 범위의 임의 정수 100개를 저장
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = rnd.nextInt(100) + 1;
		}
		
		// 배열 100개에 저장된 값중에서 소수인 값들만 출력
		// Prime(소수)는 2 ~ (자신-1)까지의 수로 나누었을 때 나머지가 0이 한번도 나오지 않아야 한다.
		for(int i = 0 ; i < nums.length ; i++) {
			
			int index = 0;
			int numP = nums[i];
			for(index = 2; index < numP ; index++) {
				if (numP % index == 0) {
					break;
				}
			}
			if(index < numP ) {
				System.out.println(numP + "는 소수가 아니다");
			} else {
				System.out.println(numP + "는 소수");
			}
		}
		
		
	} // end main
	

}
