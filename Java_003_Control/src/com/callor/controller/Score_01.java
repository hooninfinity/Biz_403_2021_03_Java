package com.callor.controller;

public class Score_01 {

	public static void main(String[] args) {
		
		int intKor = 80;
		int intEng = 77;
		int intMath = 65;
		
		String strKor = "국어";
		String strEng = "영어";
		String strMath = "수학";
		
		int intSum = intKor + intEng + intMath;
		int intAvg = intSum / 3;
		
		System.out.println("=======================");
		System.out.printf("%s : %d\n" ,strKor, intKor);
		System.out.printf("%s : %d\n" ,strEng, intEng);
		System.out.printf("%s : %d\n" ,strMath, intMath);
		System.out.println("-----------------------");
		System.out.printf("총점 : %d\t 평균 : %d\n", intSum, intAvg);
		System.out.println("=======================");
		
		/*
		 * printf() 사용하여 출력할때
		 * %d : 정수(십진수)
		 * %f : 실수(float)
		 * 		%3.2f : 소수점이하 2째자리까지 표시
		 * %s : 문자열
		 * 
		 * \n : Enter를 누른것처럼 줄바꿈 실행
		 * \t : Tab 키를 누른것처럼 사이띄기
		 * 
		 */
		
		

	}

}
