package acm2030;

import java.util.Scanner;

public class Main {
public void isChinese() {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 sc.nextLine();
	 String[] arr=new String[n];
	 for(int i=0;i<n;i++) {
		 arr[i]=sc.nextLine();
	 }
	 for(int i=0;i<n;i++) {
		 int count=0;
		 for(int j=0;j<arr[i].length();j++) {
			 if(arr[i].charAt(j)>=19968&&arr[i].charAt(j)<=171941)
					count++;

		 }
		 System.out.println(count);
	 
	 }
}
private boolean isChinese(char a) {
	return String.valueOf(a).matches("[\u4e00-\u9fa5]");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.isChinese();
	}

}
