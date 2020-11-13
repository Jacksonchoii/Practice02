package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double average;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키: ");
		
		double height = sc.nextDouble();
		
		System.out.print("몸무게: ");
		
		double weight = sc.nextDouble();
		
		// 표준체중의 85% 미만 = 저체중
		// 표준체중의 110% 초과 = 과체중
		average = (height-100)*0.9;
		
		
		if(weight>=average*1.1) {
			System.out.println("과체중입니다." +"\n표준체중: "+average);
		}else if(weight<average*0.85) {
			System.out.println("저체중입니다."+ "\n표준체중: "+average);
		}else {
			System.out.println("표준입니다."+"\n표준체중: "+average);
		}
		
		
		
		sc.close();
	}

}
