package call.callor.method.service;

import java.util.ArrayList;
import java.util.List;

import call.callor.method.model.ScoreVO;
/*
 * 데이터를 입력(키보드, Random, 파일, 인터넷)
 * 		데이터를 VO에 담고
 * 입력된 데이터를 List에 추가
 * 
 * 		연산을 수행
 * 
 * 다시 List 저장
 * 데이터를 읽어
 * 		List에서 추출하여 VO에 담고
 * 출력
 */
public class ScoreServiceV6A {

	// 3x + a
	// final 키워드를 부착한 변수 = 상수
	// 한번 저장된 값을 변경할 수 없는 특별한 변수
	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2;
	
	protected String[] subject;
	
	protected List<ScoreVO> scoreList;
	protected InputServiceV2 inService;
	
	public ScoreServiceV6A() {
		scoreList = new ArrayList<ScoreVO>();
		inService = new InputServiceV2();
		subject = new String[] {"국어","영어","수학"};
	}
	
	public void inputScore() {
		for(int i = 0 ; i < 5 ; i++) { // 5명 학생의 점수입력 받기 위해 5번 반복
			Integer[] scores = new Integer[subject.length]; // subject의 길이만큼 배열을 생성해서
			for(int sb = 0 ; sb < subject.length ; sb++) {
				scores[sb] = inService.inputValue(subject[sb], 0, 100);
				if (scores[sb] == null) {
					return;
				}
			}
			ScoreVO scoreVO = new ScoreVO();
			int sbIndex = 0;
			scoreVO.setKor(scores[this.국어]);
			scoreVO.setEng(scores[영어]);
			scoreVO.setMath(scores[수학]);
			scoreList.add(scoreVO);
		}
	}
	
	// 배열없이 직접 만드는 코드
	public void inputScore1() {
		for(int i = 0 ; i < 5 ; i++) {
			Integer intKor = inService.inputValue("국어", 0, 100);
			if (intKor == null) {
				return;
			}
			Integer intEng = inService.inputValue("영어", 0, 100);
			if (intEng == null) {
				return;
			}
			Integer intMath = inService.inputValue("수학", 0, 100);
			if (intMath == null) {
				return;
			}
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setKor(intKor);
			scoreVO.setEng(intEng);
			scoreVO.setMath(intMath);
			scoreList.add(scoreVO);
		}
	}
	
	
	public void printScore() {
		int nSize = scoreList.size();

		System.out.println("=".repeat(50));
		for(int i = 0 ; i < subject.length ; i++) {
			System.out.print(subject[i] + "\t");
		}
		
//		System.out.print(subject[국어] + '\t');
//		System.out.print(subject[영어] + '\t');
//		System.out.print(subject[수학] + '\t');
		
		System.out.println();
		System.out.println("-".repeat(50));
		for(int i = 0 ; i < nSize ; i++) {
			ScoreVO scoreVO = new ScoreVO();
			System.out.print(scoreVO.getKor() + "\t");
			System.out.print(scoreVO.getEng() + "\t");
			System.out.print(scoreVO.getMath() + "\n");
		}
		
	}
	
	
	

}
