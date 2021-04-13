package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.hooninfinity.standard.InputService;
import com.hooninfinity.standard.MenuService;
import com.hooninfinity.standard.impl.InputServiceImplV1;
import com.hooninfinity.standard.impl.MenuServiceImplV1;

public class ScoreServiceImplV1 implements ScoreService {

	protected InputService inService;
	protected MenuService menuService;
	protected Scanner scan;
	protected List<ScoreVO> scoreList;
	
	public ScoreServiceImplV1() {
		inService = new InputServiceImplV1();
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
	}

	@Override
	public void selectMenu() {
		String title = "대한 고등학교 성적처리 시스템 2021";
		List<String> menuList = new ArrayList<String>();
		menuList.add("학생정보 등록");
		menuList.add("성적등록");
		menuList.add("성적정보 열기");
		menuList.add("성적정보 저장");
		menuList.add("성적정보 출력");
		menuService = new MenuServiceImplV1(title, menuList);
		
		while(true) {
			Integer menu = menuService.selectMenu();
			if (menu == null) {
				return;
			}
			if (menu == 1) {
				// menu 가 1일때
				this.inputScore();
			} else if(menu == 2) {
			} else if(menu == 3) {
			}
			
		}
	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void readScore() {
		// TODO Auto-generated method stub

	}

}
