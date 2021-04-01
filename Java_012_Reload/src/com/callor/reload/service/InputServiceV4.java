package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV4 {
	
	Scanner scan;
	List<NumberVO> numlist;
	
	public InputServiceV4() {
		scan = new Scanner(System.in);
		numlist = new ArrayList<NumberVO>();
	}
	
	public void inputNum() {
		System.out.println("정수 2개를 입력하세요");
		System.out.print("정수1 >> ");
		String strNum1 = scan.nextLine();
		Integer intNum1 = Integer.valueOf(strNum1);
		
		System.out.print("정수2 >> ");
		String strNum2 = scan.nextLine();
		Integer intNum2 = Integer.valueOf(strNum2);
		
		NumberVO numberVo = new NumberVO();
		numberVo.setNum1(intNum1);
		numberVo.setNum2(intNum2);
		numlist.add(numberVo);
	}
	
	public void printNum() {
		for(int i = 0 ; i < numlist.size() ; i++) {
			NumberVO vo = numlist.get(i);
			System.out.print(vo.getNum1() + "\t");
			System.out.println(vo.getNum2());
		}
	}

	
	
}







