package acm2046;//又是斐波那契 很无聊
import java.util.Scanner;

public class Main {
public void S() {
	 Scanner sc = new Scanner(System.in);
	 while(sc.hasNext()) {
		 int n=sc.nextInt();
		 long[] arr=new long[51];
		 arr[1]=1;arr[2]=2;arr[3]=3;
		 for(int i=4;i<51;i++) {
			 arr[i]=arr[i-1]+arr[i-2];
		 }
		 System.out.println(arr[n]);
	 }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.S();
	}

}
