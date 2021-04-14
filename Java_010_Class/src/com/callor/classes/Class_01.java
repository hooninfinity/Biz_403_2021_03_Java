package com.callor.classes;

import java.util.Arrays;
import java.util.Random;
/*
 * 1. Random클래스 이용해서 50~100까지 중 난수 1개 생성
 * 2. 2 ~ (난수 -1)까지 수 중에서 생성된 난수의 약수들을 찾아 배열에 저장
 * 		* 난수의 약수 = 난수 % i == 0 인 i값
 * 3. 배열에 저장된 리스트를 출력하라 
 */
public class Class_01 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int intNum = rnd.nextInt(51) + 50;
		
		// i값이 0에서 시작하여 1씩 증가하면서 100 미만일 경우 {} 명령들을 실행하라
		// i값은 0 ~ 99 (100-1)
//		for(int i = 0 ; i < 100 ; i++) {
//		}
		System.out.println("생성된 난수 : " + intNum);
		
		// i값은 2 ~ (intNum - 1) 연속으로 생성
		// intNum의 약수가 몇개인가를 구하기
		int nCount = 0;
		for(int i = 2 ; i < intNum ; i++) {
			if(intNum % i == 0) {
				nCount++;
			}
		}
		System.out.println("약수의 개수 : " + nCount);
		
		// 개수만큼 배열을 만들고
		int[] divisor = new int[nCount]; // new int[intNum]
		
		int index = 0; // 이게 없으면 범위를 벗어났다고 에러가 뜸
		for(int i = 2 ; i < intNum ; i++) {
			if(intNum % i == 0) {
				divisor[index++] = i; 
			}
		}
		
		System.out.println(Arrays.toString(divisor));
		
		
		

	}

}



