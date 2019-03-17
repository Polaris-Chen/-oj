package acm2015;
//Accepted
import java.util.Scanner;

public class Main {
public void avg() {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		int n=sc.nextInt();
		int length=2*n;
		int m=sc.nextInt();
		int score=0,sum=0,mark=0;
		for(int i=2;i<length+1;i+=2) {
			sum+=i;score++;
			if(score==m) {
				if(mark==0) {
					System.out.print(sum/m);
				    mark=1;
				    sum=score=0;
				}
				else {
					System.out.print(" "+sum/m);
				    sum=score=0;
				}
			
			}
		}
		if(score!=0) {
			sum=0;
			for(int j=score;j>0;j--) {
				sum+=length;
				length-=2;
			}
			System.out.print(" "+sum/score);
			
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.avg();
	}

}
