package call.callor.blackjack.service;
/*
 * 한벌의 카드를 생성하고 저장할 클래스
 */

import java.util.ArrayList;
import java.util.List;

import call.callor.blackjack.DeckVO;

public class DeckService_01 {
	// 생성된 카드를 저장할 리스트
	List<DeckVO> deckList;
	// suits(무늬) : 다이아몬트, 하트, 스페이드, 클럽
	String[] suits = new String[] {"다이아몬드, 하트, 스페이스, 클럽"};
	/// cardNums(카드 숫자) :  2, 3, 4, 5, 6, 7, 8, 9, 10, A(1), K(10), J(10), Q(10)
	String cardNums = "A234567890KJQ";
	
	public DeckService_01() {
		// TODO ???????????????????????
		this.deckList = new ArrayList<DeckVO>();
	}
	
	
	
	public void makeDeck() {
		// TODO 카드를 생성하는 method
		String[] card = cardNums.split("");
		int value = 0;
		for(String su : suits) {
			for(String cn : card ) {
				// 각 무늬가 한번 실행될때 카드숫자를 하나씩 무늬에 넣는다
				// 숫자는 그대로 대입하고, A는 1, KJQ는 10으로
				// 무늬와 카드 숫자를 조합한 값의 변수 value 사용
				value = Integer.valueOf(cn);
			}
		}
		
	}
	

}
