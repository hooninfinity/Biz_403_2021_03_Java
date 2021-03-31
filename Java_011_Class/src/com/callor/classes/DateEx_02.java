package com.callor.classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx_02 {
	
	public static void main(String[] args) {
		// 컴퓨터의 내장된 시계로부터 현재 날짜 시간 데이터를 읽어와서
		// today 객체로 만들기
		Date date = new Date();
		// today 객체를 문자열로 변환시키기 위한 보조 클래스
		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeForm = new SimpleDateFormat("hh:mm:ss");
		
		String curDate = dateForm.format(date);
		String curTime = timeForm.format(date);
		
		System.out.printf("오늘날짜 : %s, 현재시각 : %s", curDate, curTime);
		
		
		
	}

}
