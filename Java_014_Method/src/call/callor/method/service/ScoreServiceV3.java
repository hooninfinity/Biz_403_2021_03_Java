package call.callor.method.service;
/*
 * 1. inputScore() method를 선언하고
 * 2. InputServiceV2 클래스를 사용하여
 * 3. 국어, 영어, 수학 점수를 입력받고
 * 4. 각각 intKor, intEng, intMath 변수에 저장
 * 5. 각 점수는 0 ~ 100 점 범위 내에서 입력
 * 6. 입력 받은 3 과목의 총점과 평균을 계산하여 출력
 */
public class ScoreServiceV3 {
	
	protected InputServiceV2 inService;
	
	public ScoreServiceV3() {
		inService = new InputServiceV2();
	}
	
	public void inputScore() {
		Integer intKor = inService.inputValue("국어", 0, 100);
		if (intKor == null) {
			System.out.println("종료");
			return;
		}
		Integer intEng = inService.inputValue("영어", 0, 100);
		if (intEng == null) {
			System.out.println("종료");
			return;
		}
		Integer intMath = inService.inputValue("수학", 0, 100);
		if (intMath == null) {
			System.out.println("종료");
			return;
		}
		
		int sum = intKor + intEng + intMath;
		float avg = (float)sum / 3;
		
		System.out.println("국어 : " + intKor);
		System.out.println("영어 : " + intEng);
		System.out.println("수학 : " + intMath);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}
	

}
