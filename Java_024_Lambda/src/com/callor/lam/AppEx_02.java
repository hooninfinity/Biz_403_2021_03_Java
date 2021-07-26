package com.callor.lam;

import com.callor.lam.service.OnClickService;

public class AppEx_02 {
	
	public static void main(String[] args) {
		
		/*
		 * 아주 단순한 interface를 사용하여
		 * 아주 단순한 일을 수행하는 객체를 만들고 싶을때
		 * 
		 * interface를 상속하여 클래스를 만들고
		 * 클래스를 사용하여 객체를 생성하고
		 * 객체의 method를 호출하여 일을 수행하는
		 * 복잡한 방법을 사용하고 싶지 않을때
		 */
		// 전통적으로 자바에서 제공하는 익명클래스
		OnClickService on1 = new OnClickService() {
			@Override
			public void OnClick(String msg) {
				// TODO Auto-generated method stub
				System.out.println(msg);
			}
		};
		on1.OnClick("우리나라 만세?");
		
		// 전통적으로 제공하는 것도 복잡해서 람다 코드로 해보자
		OnClickService on2 = (msg)->System.out.println(msg);
		on2.OnClick("대한민국 만세");
		
	}

}
