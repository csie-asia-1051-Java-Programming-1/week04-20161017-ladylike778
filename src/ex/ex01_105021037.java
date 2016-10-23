package ex;
/*
 * Topic: 寫一個程式讓使多個正整數(包含0)直到使用者輸入-1 時停止，同時要顯示這些數字 總合 及 平均。
 * Date: 2016/10/17
 * Author: 105021037 林建宏
 */
import java.util.*;
public class ex01_105021037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int a =0;
		int sum=0;
		int b=0;
		while(a!=-1){
			b++;
			sum+=a;
			System.out.println("請輸入一個值");
			a=scn.nextInt();
		}
		b=b-1;
		System.out.println("總和"+sum+"平均"+(float)sum/b);

	}

}
