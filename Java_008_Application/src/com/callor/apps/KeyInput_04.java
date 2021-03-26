package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_04 {
	
	public static void main(String[] args) {
		
		int[] intNums = new int[5];
		int intSum = 0;
		
		Scanner scan = new Scanner(System.in);
		int lineLength = 30;
		System.out.println( LinesService.dLines(lineLength) );
		System.out.println("5개의 정수를 입력합니다");
		
		for(int i = 0 ; i < intNums.length ; i++) {
			intNums[i] = scan.nextInt();
			intSum += intNums[i];
		}
		System.out.println( LinesService.sLines(lineLength) );
		System.out.println("정수들의 합은 : " + intSum);
		System.out.println( LinesService.dLines(lineLength) );

		
		
	}

}
