package com.callor.lam.service;

public class OnClickServiceImplV2 implements OnClickService {

	@Override
	public void OnClick(String msg) {
		msg += " 반갑습니다";
		System.out.println(msg);
	}

}
