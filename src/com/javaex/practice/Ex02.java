package com.javaex.practice;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("x확인");
		System.out.println("숫자입력: ");
		x = sc.nextInt();
		
		if (x==0) {	// 같다표시 주의 = = <- 2개 사용
			System.out.println("x는 0이다.");
		}
		
		sc.close();
	}

}
