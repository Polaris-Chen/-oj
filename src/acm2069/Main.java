package acm2069;
//±©Á¦ÆÆ½â
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int count=0;
			int i=0;
		
				for(int j=0;j<51;j++) {
				  for(int k=0;k<26;k++) {
					for(int h=0;h<11;h++) {
						for(int l=0;l<6;l++) {
							i=n-5*j-10*k-25*h-50*l;
							if(i>=0&&i+j+k+h+l<=100) {
								count++;
							}
						}
					}
				}
			}
			System.out.println(count);
		
	}

}
}