package com.sist.exam04;

public class StringBufferInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer data = new StringBuffer("hello java");
		
		int year = 2021;
		String msg = "hi";
		boolean flag = true;
		
		data.insert(5, year);	//hello2021 java
		System.out.println(data);

		data.insert(0, msg);
		System.out.println(data);	//hihello2021 java
		
		//StringBuffer data2 = new StringBuffer("hi");	//2
				
		data.insert(data.length(), flag);
		System.out.println(data);
		
	}

}
