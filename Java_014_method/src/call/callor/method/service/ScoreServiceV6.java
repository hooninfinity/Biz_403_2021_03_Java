package call.callor.method.service;

import java.util.ArrayList;
import java.util.List;

import call.callor.method.model.ScoreVO;

public class ScoreServiceV6 {
	
	List<ScoreVO> scoreList;
	String[] subject;
	InputServiceV2 inService;
	ScoreVO scoreVO;
	
	public ScoreServiceV6() {
		scoreList = new ArrayList<ScoreVO>();
		subject = new String[] {"국어","영어","수학"};
		inService = new InputServiceV2();
	}
	
	public void inputScore() {
		
		for(int i = 0 ; i < 5 ; i++) {
			scoreVO = new ScoreVO();
			scoreVO.setKor(inService.inputValue("국어", 0, 100));
			scoreVO.setEng(inService.inputValue("영어", 0, 100));
			scoreVO.setMath(inService.inputValue("수학", 0, 100));
			scoreList.add(scoreVO);
		}
		
//		public void inputScore() {
//		for(int i = 0 ; i < 5 ; i++) {
//			scoreVO = new ScoreVO();
//			for(int j = 0 ; j < subject.length ; j++) {
//				scoreVO.setKor(inService.inputValue(subject[j], 0, 100));
//				scoreVO.setEng(inService.inputValue(subject[j], 0, 100));
//				scoreVO.setMath(inService.inputValue(subject[j], 0, 100));
//				scoreList.add(scoreVO);
//				}
//			}
//		}
	} // inputScore
	
	
	public void printScore() {
		for(int i = 0 ; i < scoreList.size() ; i++) {
			System.out.print(scoreList.get(i).getKor() + "\t");
			System.out.print(scoreList.get(i).getEng() + "\t");
			System.out.print(scoreList.get(i).getMath() + "\n");
		}
	}
	
	
	
	
	

}
