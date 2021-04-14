package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Word_01 {
	
	public static void main(String[] args) {
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		String fileName = "src/com/callor/score/word.txt";
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			while(true) {
				String reader = buffer.readLine();
				if (reader == null) break;
				
				String[] word = reader.split(":");
				System.out.printf("%s\t%s\n", word[0], word[1]);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(fileName + "파일을 찾을 수 없습니다!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("파일을 읽는 동안 문제 발생");
		}
		
		
	}

}
