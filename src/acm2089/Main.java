package acm2089;//Accepted
//这个题第一思路就是对区间内的每一个数字进行检测，但是遇到了一个问题，超时。

//那么就不能在每次输入n，m后进行寻找吉利数，而是在输入数据之前就用数组记录下所有数据。
//单次是没有区别的 但因为题中是多组数据,所以会重复好多遍

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 boolean[] arr=new boolean[1000001];
		 for(int i=1;i<1000001;i++) {
			 String temp=String.valueOf(i);
			 for(int j=0;j<temp.length();j++) {
			
				 if(temp.charAt(j)=='4') {
					 arr[i]=true;
					 break;
				 }
				 if(temp.length()<2) {
					 break;
				 }
				 else {
				 if(temp.charAt(j)=='6'&&j<temp.length()-1) {
					 if(temp.charAt(j+1)=='2') {
						 arr[i]=true;
						 break;
					 }
				 }
				 }
			 }
		 }
		 while(sc.hasNext()) { 
			 int start=sc.nextInt();
			 int end=sc.nextInt();
			 if(start==0&&end==0)break;
			 int count=0;
			 for(int i=start;i<end+1;i++) {
				 if(arr[i]) {
					 count++;
				 }
			 }
			 int sum=end-start+1-count;
			 System.out.println(sum);
		 }
	}

}
