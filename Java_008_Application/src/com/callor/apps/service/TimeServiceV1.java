package com.callor.apps.service;

import java.util.Random;

/*
 * 1. 8개의 정수형 배열 선언하고 2 ~ 9 까지 정수 저장
 * 2. 8개의 배열에 저장된 정수에 해당하는 구구단 출력
 * ========================================
 * 2단
 * ========================================
 * 2 X 2 = 4
 * :
 * ========================================
 */
public class TimeServiceV1 {

	int[] intNums;
	int[] intNums2;
	int[] intTotal;
	
	public TimeServiceV1() {
		intNums = new int[8];
	}
	
	public void intDan() {
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = i + 2;
		}
	}
	
	public void intDan2() {
		for (int i = 0; i < intNums.length; i++) {
			intNums2[i] = i + 2;
		}
	}
	
	public void intTotal() {
	}
	
	public void printScore() {
		
	}
	
	
	
}








