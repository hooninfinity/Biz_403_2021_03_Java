package com.callor.fine.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.callor.fine.ScoreVO;

public class ScoreServiceImplV2 extends ScoreServiceImplV1 {
// 상속은 extends
	public ScoreServiceImplV2() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		// 빨간줄 고쳐보기
		// 부모 쪽의 쪽의 선언부를 protect로 변경한다
	}
	
	
}
