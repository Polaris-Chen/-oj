package acm2089;//Accepted
//������һ˼·���Ƕ������ڵ�ÿһ�����ֽ��м�⣬����������һ�����⣬��ʱ��

//��ô�Ͳ�����ÿ������n��m�����Ѱ�Ҽ���������������������֮ǰ���������¼���������ݡ�
//������û������� ����Ϊ�����Ƕ�������,���Ի��ظ��ö��

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
