package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.callor.score.model.StudentVO;
import com.callor.score.service.StudentService;

public class StudentServiceImplV1 implements StudentService{
	
	protected final int 학번 = 0;
	protected final int 이름 = 1;
	protected final int 학년 = 2;
	protected final int 학과 = 4;
	protected final int 주소 = 5;
	
	protected List<StudentVO> studentList;
	
	public StudentServiceImplV1() {
		studentList = new ArrayList<StudentVO>();
		// 자동으로 학생 정보(list) 생성
		this.loadStudent();
	}
	

	@Override
	public void insertStudent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loadStudent() {
		// TODO 학생 정보 추출
//		String fileName = "src/com/callor/score/student.txt";
//		FileReader fileReader = null;
//		BufferedReader buffer = null;
//		
//		try {
//			fileReader = new FileReader(fileName);
//			buffer = new BufferedReader(fileReader);
//			
//			while(true) {
//				String reader = buffer.readLine();
//				if (reader == null) break;
//				String student[] = reader.split(":");
//				
//				StudentVO studentVO = new StudentVO();
//				studentVO.setNum(student[학번]);
//				studentVO.setName(student[이름]);
//				studentVO.setGrade(student[학년]);
//				studentVO.setDept(student[학과]);
//				studentVO.setAddress(student[주소]);
//				studentList.add(studentVO);
//			}
//			buffer.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			// e.printStackTrace();
//			System.out.println(fileName + "파일이 없습니다");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("파일을 읽는동안 문제 발생");
//		}
	}

	@Override
	public StudentVO getStudent(String num) {
//		StudentVO vo;
//		int nSize = studentList.size();
//		for(int i = 0 ; i < nSize ; i++) {
//			vo = studentList.get(i);
//			if (num.equals(vo.getNum())) {
//				return vo;
//			}
//		}
//		System.out.println("학생정보가 없습니다!!");
		return null;
	}

	@Override
	public void printStudent() {
		// TODO Auto-generated method stub
		
	}

}
