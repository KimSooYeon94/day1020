package com.sist.exam03;

import java.util.Scanner;
public class StringChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String data; 
		
		System.out.print("���ڿ��� �Է��ϼ���=> ");
		data = sc.nextLine();
		data = data.replace("hello","�ȳ�");
		System.out.println(data);
	
	}

}
