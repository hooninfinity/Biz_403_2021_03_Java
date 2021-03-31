package com.callor.classes;

import java.util.Scanner;

public class ScannerEx_06 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			Integer intNum1 = 0;
			Integer intNum2 = 0;
			
			System.out.println("=========================");
			System.out.println("숫자 2개를 입력하세요");
			System.out.print("숫자 1(QUIT:중단하기) >> ");
			String strNum1 = scan.nextLine(); // 문자열 입력받음
			
			if(strNum1.equals("QUIT")) {
				// main() method에서 return이 실행되면
				// 어플리케이션을 끝내겠다 라는 통보
				return;
			}

			try {
				intNum1 = Integer.valueOf(strNum1); // 입력받은 문자열을 숫자로 변환
			} catch (Exception e) {		// 문제가 생기면
				// TODO: handle exception
				System.out.println("숫자로만 입력하세요");
				continue;
			}
			
			System.out.print("숫자 2 >> ");
			String strNum2 = scan.nextLine();
			
			try {
				intNum2 = Integer.valueOf(strNum2);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("숫자로만 입력하세요");
				continue;
			}
			
			System.out.printf("%d x %d = %d\n", intNum1, intNum2, intNum1 * intNum2);
			
			
		}
		
		
		
		
		
	}

}
