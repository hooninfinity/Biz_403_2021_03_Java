package com.callor.var;

import java.util.Iterator;

public class Variable_19 {

	public static void main(String[] args) {
		
		// Console에 숫자 0이 무한히 반복되며 출력
		// "조건을 부여"하여 유한하게 변경
		// for() 명령에 조건부여하기
		//		for()문의 두번째 명령구간에 비교연산자를 추가
		int intNum = 0;
		for(;intNum < 10 ;) {
			System.out.println(++intNum);
			System.out.println();
			System.out.println();
		}
		
		intNum = 0;
		for( ; intNum < 10 ;) {
			intNum += 2;
			System.out.println(intNum);
		}
		
		intNum = 1;
		for( ; intNum < 10 ;) {
			intNum += 2;
			System.out.println(intNum);
		}

		
		
		
	}

}















