package acm2022;//Accepted

import java.util.Scanner;

public class Main {
public void Mm(){
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		int m=sc.nextInt();
		int n=sc.nextInt();
	int[] arr=new int[m*n];
	for(int i=0;i<m*n;i++) {
		arr[i]=sc.nextInt();
		
	}
	int max=0;
	for(int j=1;j<m*n;j++) {
		if(Math.abs(arr[j])>Math.abs(arr[max])) {
			max=j;
		}
	}
	int score=arr[max];
	max++;
	if(max%n==0) {
		int hang=max/n;
		int lie=n;
		System.out.println(hang+" "+lie+" "+score);
	}
	else {int hang=(max/n)+1;
	int lie=max%n;
	
	System.out.println(hang+" "+lie+" "+score);}
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Main ma=new Main();
	ma.Mm();
	}

}
