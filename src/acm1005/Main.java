package acm1005;
//Accepted 重点在于发现只有49种情况,后面所有的数都在重复
import java.util.*;
public class Main {

	public void s() {
		
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextLine()){
		String arr1[]=sc.nextLine().split("\\s+");
		if(arr1[0].equals("0")&&arr1[1].equals("0")&&arr1[2].equals("0")) {break;}
		int A=Integer.parseInt(arr1[0]);
		int B=Integer.parseInt(arr1[1]);
		int N=(Integer.parseInt(arr1[2]));
		if(N>49)N=N%49;
		
		int[] nums=new int[4];
		int N_plus=3;
	nums[1]=1;
	nums[2]=1;
	if(0<N&&N<3) {System.out.println(1);
	continue;}
	while(N_plus<=N) {
		nums[3]=(nums[2]*A+nums[1]*B)%7;
		N_plus++;
		nums[1]=nums[2];
		nums[2]=nums[3];
	}
	System.out.println(nums[3]);
}
	}	
public  static void main(String[] args) {
	Main xx=new Main();
	xx.s();
}
}
	
	
	
	
	
	
	
	//递归不行啊,N太大了
	/*public int s(int A,int B,int n) {
	
	if(n==1||n==2) {
		return 1;
	}
	int N=(A*s(A,B,n-1)+B*s(A,B,n-2))%7;
	return N;
}
public void q() {
	Scanner sc=new Scanner(System.in);
		while(sc.hasNextLine()){
			String arr1[]=sc.nextLine().split("\\s+");
			if(arr1[0].equals("0")&&arr1[1].equals("0")&&arr1[2].equals("0")) {break;}
			int A=Integer.parseInt(arr1[0]);
			int B=Integer.parseInt(arr1[1]);
			int N=Integer.parseInt(arr1[2]);
			System.out.println(s(A,B,N));
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.q();


	}
	}

*/