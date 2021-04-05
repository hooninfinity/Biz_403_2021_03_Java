package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV4 {

	public Integer inputNum() {
		Scanner scan = new Scanner(System.in);
		
		// 조건에 맞지 않는 결과가 나오면 나올때까지 반복할것이므로 while 문 사용
		while(true) {
			System.out.println("정수 0 ~ 100 까지 중 입력");
			System.out.println("QUIT 입력하면 종료");
			System.out.print(">> ");
			String strInput = scan.nextLine();
			Integer intNum =  null;		// 아래에 입력받은 strInput을 정수로 바꿔서 비교할 변수인 intNum을 미리 선언
			
			// 원하지 않는 조건은 하나씩 처리한다... QUIT입력된 경우, 숫자가 아닌것이 입력된 경우, 0~100까지 범위를 벗어난 경우...
			if (strInput.trim().equals("QUIT")) {
				return null;
			} else {
				// 1. 입력된 값이 QUIT가 아니면 일단 정수로 바꿔보자
				try {
					intNum = Integer.valueOf(strInput);		// 입력된 값이 숫자면 일단 여기에 해당됨
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
					System.out.println("값은 숫자만 입력하세요");
					// 다시 입력하는 곳으로 가라!!
					continue;
				}
			}// end if "QUIT"
			
			// 2. 정수이면 0 ~ 100까지 인지 알아보자
			if (intNum < 0 || intNum > 100) {
				System.out.println("범위를 벗어났음");
				System.out.println("0 ~ 100 까지만 입력");
				// 다시 입력하는 곳으로 가라
				continue;
			}
			return intNum;

		}
		
//		return null;
	}
}
