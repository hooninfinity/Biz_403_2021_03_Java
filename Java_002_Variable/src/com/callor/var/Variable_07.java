package com.callor.var;

public class Variable_07 {

	public static void main(String[] args) {
		
		int intSum = 0;
		int intNum = 0;
		
		// intNum = intNum + 1 과
		// intSum = intSum + intNum 을 하나로 표현하면
		intSum += ++intNum;
		intSum += ++intNum;
		intSum += ++intNum;
		intSum += ++intNum;
		intSum += ++intNum;
		intSum += ++intNum;
		intSum += ++intNum;
		intSum += ++intNum;
		intSum += ++intNum;
		intSum += ++intNum;
		System.out.println(intSum);
		
		

	}

}
