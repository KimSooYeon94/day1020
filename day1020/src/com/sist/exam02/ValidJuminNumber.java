package com.sist.exam02;

import java.util.Scanner;
public class ValidJuminNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String jumin;
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(������ ����)=> ");
		jumin = sc.next();
		
		int[] n = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		//800101-1234567 
		//�ε����� 6��°�� ������ �ڸ��̱� ������ ��꿡 �������� �ʴ´�
		//=> ������ �ڸ��� 0 �Է�
		//���ڿ��� ���̴� ������ ���� 14��, �ǵڿ� 14��°�� ������� �ʴ´�
		//�ݺ������ؾ��� �ε����� 12	==> i<jumin.length()-1

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
		//charAt()�� ����� char�̴�
		//char�� ���ڿ�(String)���� ����� ���Ͽ�
		//���� ""���� ���ϱ� ���ش�
		//�׷��� ������� ���ڿ��� Integer.parseInt�� �̿��Ͽ� ������ ���� �� �ִ�
		
		
		if(sum == check) {
			System.out.println("�ùٸ� �ֹι�ȣ�Դϴ�.");
		}else {
			System.out.println("�ùٸ� �ֹι�ȣ�� �ƴմϴ�.");
		}
		
	}

}
