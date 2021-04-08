package com.callor.app.service;

import com.hooninfinity.standard.InputService;
import com.hooninfinity.standard.impl.InputServiceImplV1;

/*
 * 1. InputService interface를 활용하여
 * 2. 한 학생의 국어, 영어, 수학 점수를 입력받고
 * 3. 총점과 평균을 계산하여 출력
 * 4. 단, 점수는 0 ~ 100까지만 입력할 수 있음
 */
public class ScoreServiceV1 {
	
	public static void main(String[] args) {
		
		Integer kor;
		Integer eng;
		Integer math;
		Integer sum;
		float avg;
		
		InputService isV1 = new InputServiceImplV1();
		
		kor = isV1.inputValue("국어", 0, 100);
		eng = isV1.inputValue("영어", 0, 100);
		math = isV1.inputValue("수학", 0, 100);
		sum = kor + eng + math;
		avg = (float)sum / 3;
		
		System.out.println("=".repeat(50));
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("-".repeat(50));
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("=".repeat(50));
		
	}

}
