package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrimeServiceV7 {
	
	protected Random rnd;
	protected List<Integer> primeList;
	
	public PrimeServiceV7() {
		rnd = new Random();
		primeList = new ArrayList<Integer>();
	}
	// 배열을 사용해서 좀 복잡하게 구현
	public void primeNum() {
		int[] rndNums = new int[50];
		for(int i = 0 ; i < rndNums.length ; i++) {
			rndNums[i] = rnd.nextInt(51) + 50;
		}
		for(int i = 0; i < rndNums.length ; i++) {
			// this.addPrime( rndNums[i] );   이걸 쓰면 한줄로 32번줄까지 짧게 구현
			int index = 0;
			for( index = 2 ; index < rndNums[i] ; index++) {
				if (rndNums[i] % index == 0) {
					break;
				}
			}
			if (index >= rndNums[i]) {
				primeList.add(rndNums[i]);
			}
		}
	}
	
	private void addPrime(int rndNum) {
		for(int i = 2 ; i < rndNum ; i++) {
			if(rndNum % 2 == 0) {
				return;
			}
		}
		primeList.add(rndNum);
	}
	

}
