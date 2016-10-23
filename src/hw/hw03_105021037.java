package hw;
/*
 * Topic: 程式個程式讓使用者連續輸入整數 (正數、負數及零)，直到使用者輸入 999 時停止，
 * 然後顯示正數有多少個，0 有幾個，負數總共有幾個，使用者可以重覆執行直到使用者輸入n
 * Date: 2016/10/17
 * Author: 105021037 林建宏
 */
import java.util.*;
public class hw03_105021037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int p=0;
		int n=0;
		int zero=0;
		int a=0;
		while  (a!=999)  {
			 System.out.print("請輸入整數\n"+"輸入999為停止\n");
			 a=scn.nextInt();
			 if(a>0){
				 p=p+1;
			 }else if(a<0){
				 n=n+1;
				 
			 }else if (a==0){
				 zero=zero+1;
			 }
			 	
		}System.out.println(p-1+"個正數"+n+"個負數"+zero+"個0");
		

	}

}
