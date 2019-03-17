package acm2009;
//Accepted
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.00");
		while(sc.hasNext()) {
			
			double first=sc.nextInt();
			int m=sc.nextInt();
			double sum=0;
			for(int i=1;i<m+1;i++) {
				sum+=first;
				first=Math.pow(first,0.5);
				
			}
			System.out.println(df.format(sum));
		}
	}

}
