package acm2088;//格式问题 没Ac 但无所谓
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public void zhufangfa() {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
		int n=sc.nextInt();
		if(n==0)break;
		
		int[] arr=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			
		arr[i]=sc.nextInt();	
		sum+=arr[i];
		}
		int mid=sum/n;
		Arrays.sort(arr);
		int sum1=0;
		for(int i=0;i<n;i++) {
			sum1+=Math.abs(arr[i]-mid);
		}
		System.out.println(sum1/2);
		System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main ma=new Main();
		ma.zhufangfa();
	}

}
