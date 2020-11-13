package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1;
		double num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호: ");
		String S = sc.nextLine();
		
		System.out.print("숫자1: ");
		num1 = sc.nextDouble();
		
		System.out.print("숫자2: ");
		num2 = sc.nextDouble();
		
		

		switch(S) {			
			
			case "+":
				System.out.println("결과는: "+(num1+num2));
				break;
			case "-": 
				System.out.println("결과는: "+(num1-num2));
				break;
			case "*":
				System.out.println("결과는: "+(num1*num2));
				break;
			case "/":
					if(num2==0) {
						System.out.println("계산할 수 없습니다.");
						break;
					}
				System.out.println("결과는: "+(num1/num2));
				break;
			default:
				System.out.println("계산할 수 없는 기호입니다.");
				break;
		}
		
		
		sc.close();
	}

}
