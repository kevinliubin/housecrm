package com.lb.ssm.test;

import java.util.Random;

import com.lb.ssm.common.IDUtils;

public class Test {

	public static void main(String[] args) {
		int a = (int)IDUtils.genItemId();
		
		long b = IDUtils.genItemId();
		System.out.println(a);
		System.out.println(b);
		
		Random random = new Random();
		int end2 = random.nextInt(99);
		String string = String.format("%02d", end2);
		System.out.println(string);
		
		long millis = System.currentTimeMillis();
		//截取后9位
		String string2 = (millis+"").substring(4, 13);
		System.out.println(string2);
		
		System.out.println(IDUtils.setUserId());
	}

}
