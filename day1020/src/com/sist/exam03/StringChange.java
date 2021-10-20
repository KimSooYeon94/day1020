package com.sist.exam03;

import java.util.Scanner;
public class StringChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String data; 
		
		System.out.print("문자열을 입력하세요=> ");
		data = sc.nextLine();
		data = data.replace("hello","안녕");
		System.out.println(data);
	
	}

}
