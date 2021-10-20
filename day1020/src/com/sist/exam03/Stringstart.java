package com.sist.exam03;

import java.util.Scanner;
public class Stringstart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		
		System.out.print("ÀÌ¸§À» ÀÔ·ÂÇÏ¼¼¿ä=> ");
		name = sc.next();
		
		if(name.startsWith("±è")) {
			System.out.println("±è¾¾ÀÔ´Ï´Ù.");
		}else {
			System.out.println("±è¾¾°¡ ¾Æ´Õ´Ï´Ù.");
		}
		
	
		

	}

}
