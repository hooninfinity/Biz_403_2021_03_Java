package com.hooninfinity.standard.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hooninfinity.standard.MenuService;

/*
 * 사용자에게 업무리스트를 보여주고
 * 업무 번호를 입력하면
 * 
 * 해당하는 업무 번호를 return
 * QUIT를 입력하면 null을 return
 */
public class MenuServiceImplV1 implements MenuService {

	protected String title;
	protected List<String> menulist;
	protected Scanner scan;

	/*
	 * 생성자에 매개변수 선언
	 * MenuServiceImplV1 클래스를 사용하여 객체를 생성할때는
	 * title 변수와 menuList에 값을 담아서 파라미터로 전달하고
	 * 생성자를 호출을 해야 한다
	 */
	public MenuServiceImplV1(String title, List<String> menuList) {
		
		// 객체를 생성할때 전달한 매개변수 title을
		// 멤버변수 this.title 에 저장
		this.title = title;
		// menuList = new ArrayList<String>();
		this.menulist = menuList;
		scan = new Scanner(System.in);
	}

	@Override
	public Integer selectMenu() {
		while (true) {
			System.out.println("=".repeat(50));
			System.out.println(title);
			System.out.println("-".repeat(50));
			int nSize = menulist.size();
			for (int menuIndex = 0; menuIndex < nSize; menuIndex++) {
				System.out.printf("%d. %s\n", menuIndex + 1, menulist.get(menuIndex)); // menuIndex를 1번부터 보여주기 위해
			}
			System.out.println("QUIT. 업무종료");
			System.out.println("-".repeat(50));
			System.out.print("업무선택 >> ");
			String strM = scan.nextLine();
			if (strM.equals("QUIT")) {
				return null;
			}
			Integer intM = null;
			try {
				intM = Integer.valueOf(strM);
			} catch (NumberFormatException e) {
				System.out.printf("업무는 1 ~ %d, 또는 QUIT만 입력하세요", nSize);
				continue;
			}
			if (intM < 1 || intM > nSize) {
				System.out.printf("업무선택은 1 ~ %d 까지 선택하세요\n", nSize);
				continue;
			}
			
			return intM;
		}
	}
	
	

}
