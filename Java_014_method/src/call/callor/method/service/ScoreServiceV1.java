package call.callor.method.service;

public class ScoreServiceV1 {
	InputServiceV1 isV1;
	
	public ScoreServiceV1() {
		isV1 = new InputServiceV1();
	}
	
	public Integer inputScore() {
		isV1.inputValue("국어", 0, 100);
		Integer retNum = this.inputScore();
		if (retNum == null) {
			System.out.println("종료");
		} else {
			System.out.printf("점수 : %d", retNum);
		}
		return retNum;
		
		
	}

}
