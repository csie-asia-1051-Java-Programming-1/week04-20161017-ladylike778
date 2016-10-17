package ex;
/*
 * Topic: 讓使用者輸入 一個正整數 n 及一個字元符號，然後顯示出下列圖形 (例 n = 4,字元符號= @)
    @@@@
    @@@  
    @@  
    @
 * Date: 2016/10/17
 * Author: 105021037 林建宏
 */
import java.util.*;
public class ex04_105021037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		System.out.print("請輸入一個值");
		int n=scn.nextInt();
		System.out.print("請選擇一個字元");
		String jjj =scn.next();
		for(int a=0;a<n;a++){
			for(int b=0;b<=a;b--){
				System.out.print("jjj");
			}System.out.println();
		}

	}

}
