package com.sist.exam04;

public class StringBufferTestAppend {

	public static void pro(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer data = new StringBuffer("hello");
		String msg = "java";
		int year = 2021;
		boolean flag = true;
		
		data.append("/");
		data.append(msg);
		data.append("/");
		data.append(year);
		data.append("/");
		data.append(flag);
		
		System.out.println(data);
		
		// data를 갖고 pro메소드 호출하기
		
		pro(data.toString());
		pro(String.valueOf(data));
		
		
		
	}

}
