package hw;
/*
 * Date: 2016/10/17
 * Author: 105021037 林建宏
 */
import java.util.*;
public class hw04_105021037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		System.out.println("請選擇1、2、3或4");
		int rec=scn.nextInt();
		switch (rec){
		case 1:
			System.out.println("請輸入n");
			int n=scn.nextInt();
			for(int a=(n/2)+1;a>0;a--){
				for(int b=a;b>0;b--){
					System.out.print('@');
				}
				System.out.println();
			}   
			for(int a=1;a<=(n/2);a++ ){
				for(int b=1;b<=a+1;b++){
					System.out.print('@');
				}
				System.out.println();
			}break;
		case 2:
			System.out.println("請輸入n");
			int m=scn.nextInt();
			for(int a=1;a<=(m/2)+1;a++ ){
				for(int b=1;b<=a;b++){
					System.out.print('%');
				}System.out.println();
				}
			for(int a=m/2;a>0;a--){
				for(int b=a;b>0;b--){
					System.out.print('%');
				}System.out.println();
			}break;
		case 3:
			System.out.println("請輸入n");
			int j = scn.nextInt();
			for(int a = 1;a<=j/2+1;a++){
				for(int b=1;b<=j/2-1-a;b++){
					System.out.print(" ");
				}
				for(int c = 0;c<=(2*a)-2;c++){
					System.out.print('#');
				}System.out.println();
			}
			for (int a = 1; a<=j/2-1-1;a++){
				for(int b=0;b<=a-1;b++){
					System.out.print(" ");
				}
				for(int c=1;c<=j-(a*2);c++){
					System.out.print('#');
				}System.out.println();
	          }break;
		case 4:
			System.out.println("結束");
		
		break;
		
		
		
		}

	}

}
