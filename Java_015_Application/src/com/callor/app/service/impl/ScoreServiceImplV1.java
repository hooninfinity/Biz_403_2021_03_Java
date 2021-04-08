package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.hooninfinity.standard.InputService;
import com.hooninfinity.standard.impl.InputServiceImplV1;

public class ScoreServiceImplV1 implements ScoreService{
	protected Scanner scan;
	protected List<ScoreVO> scoreList;
	protected InputService isService;
	protected String[] subject;
	protected ScoreVO scoreVO;
	
	public ScoreServiceImplV1() {
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
		isService = new InputServiceImplV1();
		subject = new String[] {"국어","영어","수학"};
	}
	
	@Override
	public void selectMenu() {
		// TODO 메뉴 화면
		while(true) {
			System.out.println("=".repeat(50));
			System.out.println("학생 성적입력");
			System.out.println("-".repeat(50));
			System.out.println("1. 학생별 성적 등록");
			System.out.println("2. 성적 리스트 출력");
			System.out.println("QUIT. 업무종료");
			System.out.println("-".repeat(50));
			System.out.print("업무선택 >> ");
			String strMenu = scan.nextLine();
			if(strMenu.equals("QUIT")) {
				break;
			}
			
			Integer intMenu = null;
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("메뉴선택 오류!!");
				System.out.println("메뉴는 1 ~ 2, QUIT 만 입력 가능");
				continue;
			}
			if(intMenu == 1) {
				this.inputName();
				this.inputScore();
			} else if(intMenu == 2) {
				this.printScore();;
			}
		} // end while
		System.out.println("업무종료!!");
	}

	@Override
	public void inputName() {
		// TODO 이름 입력
		System.out.println("이름을 입력하세요");
		System.out.print(">> ");
		String name = scan.nextLine();
		scoreVO = new ScoreVO();
		scoreVO.setName(name);
		scoreList.add(scoreVO);
		
	}

	@Override
	public void inputScore() {
		// TODO 성적 입력
		for(int i = 0 ; i < 5 ; i++) {
			Integer[] scores = new Integer[subject.length]; 
			for(int j = 0 ; j < subject.length ; j++) {
				scores[j] = isService.inputValue(subject[j], 0, 100);
				if (scores[j] == null) {
					return;
				}
			}
			scoreVO = new ScoreVO();
			scoreVO.setKor(scores[0]);
			scoreVO.setEng(scores[1]);
			scoreVO.setMath(scores[2]);
			scoreList.add(scoreVO);
		}
	}

	@Override
	public void printScore() {
		// TODO 성적 출력
		int nSize = scoreList.size();
		System.out.println("=".repeat(50));
		for(int i = 0 ; i < subject.length ; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println();
		System.out.println("-".repeat(50));
		for(int i = 0 ; i < nSize ; i++) {
			scoreVO = new ScoreVO();
			System.out.print(scoreVO.getName() + "\t");
			System.out.print(scoreVO.getKor() + "\t");
			System.out.print(scoreVO.getEng() + "\t");
			System.out.print(scoreVO.getMath() + "\t\n");
		}
		System.out.println(scoreList.toString());
	}
	
	

}
