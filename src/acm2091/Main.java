package acm2091;//wrong  莫名其妙的格式 不看了

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	
		while(sc.hasNext()) {
			String q=sc.next();
			if(q.compareTo("@")==0) {
				break;
			}
			else System.out.println();
			int n=sc.nextInt();
			String[][] arr=new String[n][2*n-1];
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<2*n-1;j++) {
					/*
					 * if(i==n-1) { arr[i][j]=q; }
					 */
					arr[i][j]=" ";
				}
			}
			for(int i=0;i<2*n-1;i++) {
				arr[n-1][i]=q;
			}
			for(int i=n-2,j=1;i>=0&&j<=(2*n-1)/2;i--,j++) {
				arr[i][j]=q;
			}
			for(int i=n-2,j=2*n-3;i>0&&j>(2*n-1)/2;i--,j--) {
				arr[i][j]=q;
			}
			int z=(2*n-1)/2+1;
			for(int i=0;i<n;i++) {
				for(int x=z;x<2*n-1;x++) {
					arr[i][x]="";
				}
				z++;
			}
		
			for(int i=0;i<n;i++) {
				for(int j=0;j<2*n-1;j++) {
					
					System.out.print(arr[i][j]);

				}
				System.out.println();
			}
			
			//System.out.println();
			
		}
	}

}
