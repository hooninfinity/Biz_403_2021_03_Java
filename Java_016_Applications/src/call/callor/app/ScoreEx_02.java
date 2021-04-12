package call.callor.app;

import call.callor.app.service.ScoreService;
import call.callor.app.service.impl.ScoreServiceImplV2Ex;

public class ScoreEx_02 {
	
	public static void main(String[] args) {
		
		ScoreService sService = new ScoreServiceImplV2Ex();
		sService.selectMenu();
		
		
	}

}
