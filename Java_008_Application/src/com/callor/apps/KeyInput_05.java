package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_05 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println( LinesService.dLines(30));
		System.out.println("정수를 입력하세요");
		System.out.print(">> ");
		int num = scan.nextInt();
		System.out.println( LinesService.dLines(30));
		
		if (num % 2 == 0) {
			System.out.printf("입력한 정수 %d는 짝수입니다\n", num);
		} else {
			System.out.printf("입력한 정수 %d는 짝수가 아닙니다\n", num);
		}
		
		for(int i = 2; i < num ; i++) {
			if (num % i == 0) {
				System.out.printf("입력한 정수 %d는 소수가 아닙니다\n", num);
			} else {
				System.out.printf("입력한 정수 %d는 소수입니다\n", num);
			}
			break;
		}
		System.out.println( LinesService.dLines(30));
		
		
		
		
		
		
		
		
		
		
	}

}
