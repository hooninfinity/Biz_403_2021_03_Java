package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputServiceV3 {
	
	Scanner scan;
	List<Integer> intList;
	
	public InputServiceV3() {
		scan = new Scanner(System.in);
		intList = new ArrayList<Integer>();
	}
	
	public void inputNum() {
		
		while(true) {
			System.out.println("정수 50 ~ 150까지 입력");
			System.out.print(">> ");
			String strNum = scan.nextLine(); // 문자를 입력해버리면 nextInt()로는 받을 수 없으므로
			Integer intNum = 0;
			try {
				// int intNum1 = Integer.valueOf(strNum);
				intNum = Integer.valueOf(strNum); // 문자열형 숫자를 정수로 바꿔줌
			} catch (Exception e) {
				System.out.println("값은 정수형 숫자로만 입력하세요");
				continue; // 다시 처음으로 돌아가라고
			}
			if (intNum > 50 && intNum < 150) {
				intList.add(intNum); //  intList에 입력된 정수를 담음
				break;
			} else {
				System.out.println("정수는 50 ~ 150 범위에서 입력!!");
			}
		}
	}
	
	

}









