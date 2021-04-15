package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService {

	protected List<ScoreVO> scoreList;
	protected Scanner scan;
	protected String[] subjectList;
	
	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		subjectList = new String[] {"국어","영어","수학"};
	}
	
	@Override
	public void insertScore() {
		// TODO Auto-generated method stub
//		while(true) {
//			System.out.println("학번을 입력하세요");
//			System.out.print(">> ");
//			String intNum = scan.nextLine();
//			String strNum = String.format("%05d", intNum);
//			for(int i = 0; i < scoreList.size(); i++) {
//				System.out.println(strNum + "번 학생의" + subjectList[i] + "점수를 입력하세요");
//				System.out.print(">> ");
//				String score = scan.nextLine();
//				Integer intScore = Integer.valueOf(score);
//				
//			}
//			
//		}
		
		
	}

	@Override
	public void loadScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		
	}

}
