package com.javaex.practice;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int age = 15;
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이:");
		
		age = sc.nextInt();
		
		if (0 < age && age <18) { // 연산자 사용 주의 2가지 식 나눠서 사용
			System.out.println("청소년 입니다");
		}
		
		sc.close();
		
	}

}
