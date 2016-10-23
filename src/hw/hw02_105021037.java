package hw;
/*組合C
 * Date: 2016/10/17
 * Author: 105021037 林建宏
 */
import java.util.*;
public class hw02_105021037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入n和m");
		int n=scn.nextInt();
		int m=scn.nextInt();
		int v1=1;
		int v2=1;
		int v3=1;
		for(int i=n;i>1;i--){
			v1=v1*i;
		}
		for(int l=m;l>1;l--){
			v2=v2*l;
		}
		
		for(int k=n-m;k>1;k--){
			v3=v3*k;
		}System.out.println(v1/(v2*v3));

	}

}
