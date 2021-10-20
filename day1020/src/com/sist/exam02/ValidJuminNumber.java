package com.sist.exam02;

import java.util.Scanner;
public class ValidJuminNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String jumin;
		System.out.print("주민번호를 입력하세요(하이픈 포함)=> ");
		jumin = sc.next();
		
		int[] n = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		//800101-1234567 
		//인덱스가 6번째는 하이픈 자리이기 때문에 계산에 참여하지 않는다
		//=> 하이픈 자리에 0 입력
		//문자열의 길이는 하이픈 포함 14자, 맨뒤에 14번째는 계산하지 않는다
		//반복실행해야할 인덱스는 12	==> i<jumin.length()-1

		int sum = 0;
		for(int i = 0; i<jumin.length()-1; i++) {
			if(i!=6) {
				sum += Integer.parseInt(jumin.charAt(i)+"") * n[i];
			}
		}
		sum = sum % 11;
		sum = 11 - sum;
		if(sum == 10) {
			sum = 0;
		}
		if(sum == 11) {
			sum = 1;
		}
		
		int check = Integer.parseInt(jumin.charAt(13)+"");
		//charAt()의 결과는 char이다
		//char을 문자열(String)으로 만들기 위하여
		//빈문자 ""으로 더하기 해준다
		//그렇게 만들어진 문자열을 Integer.parseInt를 이용하여 정수로 만들 수 있다
		
		
		if(sum == check) {
			System.out.println("올바른 주민번호입니다.");
		}else {
			System.out.println("올바른 주민번호가 아닙니다.");
		}
		
	}

}
