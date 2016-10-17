package ex;
/*
 * Topic: 寫一個程式讓使用者輸入兩個正整數 n 與 m，然後顯示n x m 的乘法表，顯示完後問使用者是否繼續(Y/n) ，Y 可以重新輸入 n 則結束程式。
 * Date: 2016/10/17
 * Author: 105021037 林建宏
 */
import java.util.*;
public class ex02_105021037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		
		while(true){
		System.out.println("請輸入n和m");
		int n =scn.nextInt();
		int m =scn.nextInt();
		for (int a=1;a<=n;a++){
			for(int b=1;b<=m;b++){
				System.out.print(a*b+"\t");	
			}
			System.out.println();		
			}System.out.print("是否繼續(Y/N)");
			char fh=scn.next().charAt(0);
		
			if (fh=='n'){System.out.print("BYE");
				break;
			}
		}

	}

}
