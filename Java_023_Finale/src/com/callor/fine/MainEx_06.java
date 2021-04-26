package com.callor.fine;

import java.util.ArrayList;
import java.util.List;

public class MainEx_06 {
	
	public static void main(String[] args) {
		
//		List<ScoreVO> scoreList = null;
		// scoreList에 널값으로 초기화할 수 없다
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		
		for(int i = 0 ; i < 10 ; i++) {
//			ScoreVO scoreVO = null;
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setNum("0001");
			scoreVO.setKor(90);
			scoreList.add(scoreVO);
			// 문제 : 왜 Exception이 발생할까? 수정하라
			
		}
		
		
		
	}
	
	

}
