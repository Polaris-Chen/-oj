package acm2060;
//Accepted 水题
import java.util.Scanner;

public class Main {
	public int sum(int left) {
		int sum=0;
		int ball=7;
	while(left>0) {
		sum+=ball;
		ball--;
		left--;
	}
	return sum;
		
	}
	public void S() {
		 Scanner sc = new Scanner(System.in);
		 while(sc.hasNext()) {
		 int N=sc.nextInt();
		 int[][]  arr=new int[N][3];
		 for(int i=0;i<N;i++) {
			 arr[i][0]=sc.nextInt();
			 arr[i][1]=sc.nextInt();
			 arr[i][2]=sc.nextInt();
		 }
		 for(int i=0;i<N;i++) {
			 int maxScore=0;
			 int left_ball=arr[i][0];
			 int fili_score=arr[i][1];
			 int of_score=arr[i][2];
			 if(left_ball<7) {//没红球
				 maxScore+=sum(left_ball);
				 if(fili_score+maxScore>=of_score) {
					 System.out.println("Yes");
				 }
				 else {
					 System.out.println("No");
				 }
				
			 }
			 else {//有红球
				 int redball=left_ball-6;
				 maxScore+=redball+7*redball+sum(6);
				 if(fili_score+maxScore>=of_score) {
					 System.out.println("Yes");
				 }
				 else {
					 System.out.println("No");
				 }
				
			 }
		 }
		 }
		 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main ma=new Main();
		ma.S();
	
	}

}
