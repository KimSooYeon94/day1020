package com.sist.exam03;

public class StringTestValue {

	public static void pro(String str) {
		System.out.println(str);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� ���� ��� �޼ҵ�� String�� �Ű������� ���� �޼ҵ尡 ������
		
		int data = 2021;
		
		//������ ������ data�� ���� pro�� ȣ���ؾ��ϴ� ��Ȳ�̶�� �����ϸ�
		//pro�� String�� �Ű������� ���� ������ �ٷ� ȣ���� �� ����
		//data�� String���� ��ȯ�ؾ� �Ѵ�
		
		pro(String.valueOf(data));
		pro(data+"");
		
	}

}