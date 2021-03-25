package com.callor.apps.service;
import java.util.Random;
/*
 * 1. 정수형 배열 100개 선언
 * 2. 1~100까지의 난수만들어 정수형 배열에 저장
 * 3. 배열에 저장된 수들 중에서 짝수들 리스트 출력
 * 4. 짝수들의 합을 구하여 출력
 * 5. EvenServiceV1 클래스에 method를 선언하여 코드 작성
 * 6. App_05의 main() 메서드에서 객체생성, method 호출하여 실행
 */
// 클래스 선언문(시작하는 곳)
public class EvenServiceV1 {
	
	int[] intNum; // 여기서는 선언만 하고 생성은 생성자에서 하자
	
	// 생성자 method
	// 클래스를 선언하면 자동으로 만들어지는 method
	// 별도의 코드가 필요없으면 만들지 않아도 된다.
	// new EvenServiceV1() 코드에서 호출되는 method
	// 생성자 method에는 클래스영역의 변수들을
	// 초기화 생성하기 위한 코드들이 작성된다.
	public EvenServiceV1() {
		intNum = new int[100]; // 생성은 생성자에서 하자
	}

	
	public void makeNums() {
		// Random 클래스를 사용해서 rnd라는 객체를 만들어서 초기화해서 사용할거다
		Random rnd = new Random();
		
		// intNums 배열 개수만큼 코드를 반복실행하라
		for(int i = 0 ; i < intNum.length ; i++) {
			intNum[i] = rnd.nextInt(100) + 1; // i각각의 위치에 rnd의 nextInt메소드를 불러와라
		}
	}

	/*
	 * 짝수(Even) 홀수(Odd)
	 */
	public void printEven() {
		
		int nCount = 0;
		System.out.println("=====================");
		System.out.println("짝수들의 리스트");
		System.out.println("=====================");
		// intNums 배열 전체를 뒤져서
		for (int i = 0; i < intNum.length; i++) {
			//  짝수가 있으면 출력하라
			if (intNum[i] % 2 == 0) {
				System.out.println(intNum[i]);
				nCount++;
			}
		}
		System.out.println("짝수들의 개수 : " + nCount);
		System.out.println("=====================");
	}
	
	
	public void sumEven() {
		int intSum = 0;
		for(int i = 0 ; i < intNum.length ; i++) {
			if (intNum[i]%2 == 0) {
				intSum += intNum[i];
			}
		}
		// 반복문이 끝났으니 출력하라
		System.out.println("==========================");
		System.out.println(intSum + "는 짝수들의 합");
	}

	

}





