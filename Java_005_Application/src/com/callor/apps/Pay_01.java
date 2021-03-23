package com.callor.apps;

public class Pay_01 {

	public static void main(String[] args) {
		
		int nPay = 3_723_560; // 금액
		int nPaper = 50_000; // 최고액면가 화폐
		
		// 정수 = 정수 / 정수 : 소수점이하가 잘린다
		// 몫을 구하여 액면가액 만큼 개수를 계산
		int nCount = nPay / nPaper;		// 총금액/5만원의 몫을 nCount에 저장
		System.out.println(nPaper +"원권 : " + nCount);
		// 액면가액만큼 개수를 구했으면
		// nPay에서 액면가액 금액만큼을 빼고 이후에 계산
		// 3723560 % 50000 => 50000 * 매수 만큼을
		//			3723560에서 뺀 값이 된다.
		// nPay = nPay - ( nPaper * nCount )
		// nPay = nPay % nPaper;
		nPay %= nPaper; // 총액 3723560을 5만원으로 나눈후 그 나머지값을 총액으로 정함
		nPaper /= 5;	// nPaper를 5로 나누고 그값인 1만원이 nPaper가 됨
		
		nCount = nPay / nPaper; // 원권 수  = 총액(나머지값) 23560원 / 10000;
		System.out.println(nPaper +"원권 : " + nCount);
		nPay %= nPaper; // 총액은 23560원/10000의 나머지 3560을 총액으로 함
		nPaper /= 2; // nPaper는 1만원을 2로 나눈 값인 5천원이 된다
		
		// 이런식의 반복 계산이 화폐종류 개수인 10번 교차반복된다.
		// 5만원을 5로 나누면 1만원, 1만원을 2로 나누면 5천원...
		
		nCount = nPay / nPaper; // 이때의 nPay는 3560, nPaper는 5000
		System.out.println(nPaper +"원권 : " + nCount); // 나눌수없으므로 0
		nPay %= nPaper;
		nPaper /= 5;

		nCount = nPay / nPaper;
		System.out.println(nPaper +"원권 : " + nCount);
		nPay %= nPaper;
		nPaper /= 2;
		
		nCount = nPay / nPaper;
		System.out.println(nPaper +"원권 : " + nCount);
		nPay %= nPaper;
		nPaper /= 5;

		nCount = nPay / nPaper;
		System.out.println(nPaper +"원권 : " + nCount);
		nPay %= nPaper;
		nPaper /= 2;
		
		nCount = nPay / nPaper;
		System.out.println(nPaper +"원권 : " + nCount);
		nPay %= nPaper;
		nPaper /= 5;
		
		nCount = nPay / nPaper;
		System.out.println(nPaper +"원권 : " + nCount);
		nPay %= nPaper;
		nPaper /= 2;

		nCount = nPay / nPaper;
		System.out.println(nPaper +"원권 : " + nCount);
		nPay %= nPaper;
		nPaper /= 5;
		
		nCount = nPay / nPaper;
		System.out.println(nPaper +"원권 : " + nCount);
		nPay %= nPaper;
		nPaper /= 2;
		
		






		
		
		
		
		
		
	}
	
}