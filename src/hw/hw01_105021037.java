package hw;
/*
 * Topic: �ϥΪ̿�J n ���� n �� �O��ƦC (�� n = 5 )
1, 1, 2, 3, 5

 * Date: 2016/10/17
 * Author: 105021037 �L�ا�
 */
import java.util.*;
public class hw01_105021037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		System.out.println("�п�Jn:");
		int n =scn.nextInt();
		int a = 1; int b =1;
		if( n==1|| n==2){
			System.out.println("�O���ƦC����"+n+"�ӼƬ�"+1);
		}else{
			int sum=0;
			for(int i = 3; i <= n; i++) {
				sum = a + b;
				a = b;
				b = sum;
				
				
			}System.out.println("�O���ƦC����"+n+"�ӼƬ�"+sum);
		}

	}

}
