package com.callor.fine.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.fine.ScoreVO;

public class ScoreServiceImplV1 implements ScoreService {
	// 인터페이스를 상속받았을때, implements 스펠링

//	private List<ScoreVO> scoreList;
//	private Scanner scan;
	protected List<ScoreVO> scoreList;
	protected Scanner scan;
	
	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}

	public void inputScore() {
	}

	public void printList() {
	}

}
