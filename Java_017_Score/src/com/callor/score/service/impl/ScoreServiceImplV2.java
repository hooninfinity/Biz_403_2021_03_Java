package com.callor.score.service.impl;

import com.callor.score.model.ScoreVO;

public class ScoreServiceImplV2 extends ScoreServiceImplV1 {
	
	@Override
	public void inputScore() {
		Integer intNum = inService.inputValue("학번", 1);
		if (intNum == null) {
			return;
		}
		String strNum = String.format("2021%03d", intNum);
		
		String strName = null;
		while(true) {
			System.out.println(strNum + "학생의 이름 입력(QUIT:입력중단");
			strName = scan.nextLine();
			if (strName.equals("QUIT")) {
				return;
			} else if(strName.equals("")) {
				System.out.println("학생이름은 반드시 입력하세요");
				continue;
			}
			break;
		}
		
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setNum(strNum);
		scoreVO.setName(strName);
		scoreVO.setKor(inService.inputValue("국어", 0, 100));
		scoreVO.setEng(inService.inputValue("영어", 0, 100));
		scoreVO.setMath(inService.inputValue("수학", 0, 100));
		
		scoreList.add(scoreVO);
	}
	
	
	

}
