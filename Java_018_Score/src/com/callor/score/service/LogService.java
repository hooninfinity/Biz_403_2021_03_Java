package com.callor.score.service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogService {
	
	public static void log(String msg) {
		
		FileWriter fileWriter = null;
		PrintWriter out = null;
		
		try {
			fileWriter = new FileWriter("C:/Temp/score.log", true);
			out = new PrintWriter(fileWriter);
			
			Date date = new Date(); // 오늘 날짜를 컴퓨터에서 읽어와서
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd, hh:mm:ss"); // 이런 스타일로 만들겠다
			String today = sd.format(date);
			
			out.println("=".repeat(50));
			out.printf("발생일자:%s\n", today);
			out.printf("Exception: %s\n", msg);
			out.println("=".repeat(50));
			out.flush();
			out.close();
			
			System.out.println(msg);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		
	}

}
