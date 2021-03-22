package com.callor.controller;

public class Controller_01 {
	
	public static void main(String[] args) {
		
		int sum3 = 0;
		for (int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				sum3 += i;
			}
		}
		
		int sum4 = 0;
		for (int i = 1; i <= 100; i++) {
			if(i % 4 == 0) {
				sum4 += i;
			}
		}
		
		int sum35 = 0;
		for (int i = 1; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				sum35 += i;
			}
			
		}
		
		System.out.println("3의 배수의 합 : " + sum3);
		System.out.println("4의 배수의 합 : " + sum4);
		System.out.println("3의 배수이면서 5의 배수의 합 : " + sum35);
		
		
		
		
	}

}
