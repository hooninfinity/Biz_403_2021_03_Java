package com.callor.fine;

public class MainEx_02 {
	
	public static void main(String[] args) {
		
		ScoreVO[] scoreVO = new ScoreVO[10];
		
		int index = 3;
		// 정답 : 객체배열은 사용전 개별요소를 반드시 생성(초기화)해주어야 한다.
		// scoreVO[index] = new ScoreVO(); 추가
		scoreVO[index].setNum("0001");
		scoreVO[index].setKor(90);
		scoreVO[index].setEng(88);
		scoreVO[index].setMath(77);
		
		System.out.println("학번 : " + scoreVO[index].getNum());
		System.out.println("국어 : " + scoreVO[index].getKor());
		System.out.println("영어 : " + scoreVO[index].getEng());
		System.out.println("수학 : " + scoreVO[index].getMath());
		
		
	}

}
