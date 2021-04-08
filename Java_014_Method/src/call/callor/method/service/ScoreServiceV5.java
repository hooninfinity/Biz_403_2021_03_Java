package call.callor.method.service;

import java.util.ArrayList;
import java.util.List;
/*
 * 1. subject = {"국어", "영어", "수학"} 배열을 사용하여
 * 2. 과목의 점수를 담을 3개의 List 를 선언
 * 3. InputServiceV2의 inputValue() method 를 사용하여 5명 학생의 각 과목 점수를 입력
 * 4. 입력받은 점수를 kors, engs, maths list에 add()
 * 5. printScore() method를 사용하여 성적리스트 출력
 */
public class ScoreServiceV5 {
	protected String[] subject;
	protected InputServiceV2 inService;
	List<Integer> kors;
	List<Integer> engs;
	List<Integer> maths;
	
	public ScoreServiceV5() {
		subject = new String[] {"국어","영어","수학"};
		inService = new InputServiceV2();
		kors = new ArrayList<Integer>();
		engs = new ArrayList<Integer>();
		maths = new ArrayList<Integer>();
	}
	
	public void inputScore() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < subject.length; j++) {
				Integer score = inService.inputValue(subject[j], 0, 100);
				kors.add(score);
				engs.add(score);
				maths.add(score);
			}
		}
	}
	
	
	public void printScore() {
		System.out.printf("국어\t영어\t수학\t총점\t평균\n");
		System.out.printf("%d\t" + kors);
		System.out.printf("%d\t" + engs);
		System.out.printf("%d\t" + maths);
	}
	
	
	
	
	

}
