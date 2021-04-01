package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;
// 선생님 작성본은 InputServiceV5A(그것도 완성본은 아님)
public class InputServiceV5 {
	
	Scanner scan;
	List<NumberVO> numlist;
	
	public InputServiceV5() {
		scan = new Scanner(System.in);
		numlist = new ArrayList<NumberVO>();
	}
	
	public void inputNum() {
		while(true) {
			System.out.println("=".repeat(30));
			System.out.println("정수 2개를 입력하세요");
			System.out.println("두번째 정수는 첫번째보다 작게");
			System.out.print("정수1 >> ");
			String strNum1 = scan.nextLine();
			Integer intNum1 = Integer.valueOf(strNum1);
			System.out.print("정수2 >> ");
			String strNum2 = scan.nextLine();
			Integer intNum2 = Integer.valueOf(strNum2);
			if (intNum1 > intNum2) {
				NumberVO numberVo = new NumberVO();
				numberVo.setNum1(intNum1);
				numberVo.setNum2(intNum2);
				numlist.add(numberVo);
				break;
			} else {
				System.out.println(intNum1 + "보다 작은 수를 입력하세요!!");
			}
		}
	}
	
	public void printNum() {
		for(int i = 0 ; i < numlist.size() ; i++) {
			NumberVO numberVo = numlist.get(i);
			System.out.println("정수1 - 정수2 = " + (numberVo.getNum1() - numberVo.getNum2()));
		}
	}

	
	
}







