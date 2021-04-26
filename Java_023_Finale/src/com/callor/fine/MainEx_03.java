package com.callor.fine;

public class MainEx_03 {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		AddInt addInt = new AddInt();
		int sum = addInt.add(num1, num2);
		System.out.println(sum);
		// 출력결과는 30으로 만드려면?
		// AddInt 클래스를 만들고 거기에 num1과 num2를 매개변수로 하는 add(int num1, int num2) 메소드 만들고 리턴타입을 num1+num2로 하면 된다
		
	}
	
	

}
