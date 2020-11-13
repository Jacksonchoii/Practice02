package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double credit;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수익을 입력해 주세요");
		System.out.print("금익: ");
		credit = sc.nextDouble();
		
		double tax;
		
		if(credit>=0&&credit<=1000) {
			tax = 0.09*credit;
			System.out.println("소득세는 "+tax+" 입니다.");
		}else if(credit>1000&&credit<=4000) {
			tax = (1000*0.09)+(0.18*(credit-1000));
			System.out.println("소득세는 "+tax+" 입니다.");
		}else if(credit>4000&&credit<8000) {
			tax = (1000*0.09)+3000*0.18+0.27*(credit-4000);
			System.out.println("소득세는 "+tax+" 입니다.");
		}else if(credit>=8000) {
			tax = 1000*0.09+3000*0.18+4000*0.27+0.36*(credit-8000);
			System.out.println("소득세는 "+tax+" 입니다.");
		}else {
			System.out.println("잘못 입력했습니다.");
		}
		
		
		
		
		sc.close();
	}

}
