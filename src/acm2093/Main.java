package acm2093;//结果对了 不能AC 无所谓了

import java.util.Scanner;
public class Main {
	public class stu{
		String name;
		int wrongTimes;//错误次数
		int sumTime;//总时间
		int AcTimes;//通过科目总数
		
		public stu(String name,int wrongTimes,int sumTime,int AcTimes) {
			this.name=name;
			this.sumTime=sumTime;
			this.wrongTimes=wrongTimes;
			this.AcTimes=AcTimes;
		
		}
	 }

	/*
	 * public class LinkList{
	 * 
	 * stu head; public LinkList() { head=new stu("头结点",-1,-1,-1); head.next=null; }
	 * public void insert(stu newstu) { if(head.next==null) { head.next=newstu; }
	 * else{ newstu.next=head.next; head.next=newstu; } } public void sort() {
	 * 
	 * } }
	 */
	public void swap(stu[] arr,int a,int b) {
		stu temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	public void sort(stu[] arr,int x) {
		for(int i=0;i<x;i++) {
			for(int j=i;j>0;j--) {
			
				if(arr[j].AcTimes>arr[j-1].AcTimes) {
					swap(arr,j,j-1);
				}
				else if(arr[j].AcTimes==arr[j-1].AcTimes) {
					if(arr[j].sumTime<arr[j-1].sumTime) {
						swap(arr,j,j-1);
					}
					else if(arr[j].sumTime==arr[j-1].sumTime) {
						if(arr[j].name.compareTo(arr[j-1].name)<0) {
							swap(arr,j,j-1);
						}
					}
				}
			}
		}
	}
	public void zhufangfa() {
		Scanner sc=new Scanner(System.in);

		int scoreOfExam=sc.nextInt();
		int scoreOfwrong=sc.nextInt();
		 stu[] L=new stu[10000];
		 int x=0;
		while(sc.hasNext()) {
	        String name=sc.next();
	        if(name.equals("#")) {break;}
			int wrongTimes=0;//错误次数
			int sumTime=0;//总时间
			int AcTimes=0;
			
	     for(int i=0;i<scoreOfExam;i++){
	    	 String temp=sc.next();
	    	
	    	 if(temp.charAt(temp.length()-1)==')') {
	    		 wrongTimes+=Integer.parseInt(String.valueOf(temp.charAt(temp.length()-2)));
	    		 sumTime+=Integer.parseInt(temp.substring(0, temp.length()-3));
	    		 AcTimes++;
	    	 }
	    	 else {
	    		 int t=Integer.parseInt(temp);
	    		 if(t>0) {
	    			 sumTime+=t;
	    			 AcTimes++;
	    		 }

	    	 }
	    	 
	     }
	     sumTime=sumTime+wrongTimes*scoreOfwrong;
	     //System.out.println(x);
	    L[x]=new stu(name,wrongTimes,sumTime,AcTimes);
	    //System.out.println(L[0].AcTimes);
        
			x++;
	        		
		}
		sort(L,x);
		for(int i=0;i<x;i++){
			System.out.printf("%-10s %2d %4d",L[i].name,L[i].AcTimes,L[i].sumTime);
			System.out.println();
		}
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main ma=new Main();
		ma.zhufangfa();
	}

}
