package com.callor.var;

public class Variable_15 {

	public static void main(String[] args) {
		
		int intSum = 0;
		int intNum = 0;
		
		// intNum 이 0,2,4,6,8,10이 되도록
		
		intNum += 2; //2
		intSum += intNum;
		intNum += 2; //4
		intSum += intNum;
		intNum += 2; //6
		intSum += intNum;
		intNum += 2; //8
		intSum += intNum;
		intNum += 2; //10
		intSum += intNum;
		
		System.out.println("짝수의 합 : "+ intSum);
		
		
		intSum = 0;
		intNum = 0;
		
		intSum += (intNum +=2);
		intSum += (intNum +=2);
		intSum += (intNum +=2);
		intSum += (intNum +=2);
		intSum += (intNum +=2);
		System.out.println("짝수의 합 : "+ intSum);
		
		
		
		
		
		
		
		
	}

}
