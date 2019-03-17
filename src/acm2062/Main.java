package acm2062;

import java.util.Scanner;
public class Main {
	public class SqList  {
		int[] arr;
		int count;//当前表中最后一个元素的位置;
		int capacity;

		public SqList(int capacity) {
			this.capacity = capacity;
			arr = new int[capacity];
		}
		public boolean isempty() {
			// TODO Auto-generated method stub
			return count==0;
		}
		public void insert(int i, Integer x) {
			// TODO Auto-generated method stub
			assert(count+1<capacity);
			count++;
			for(int j=count-1;j>i-1;j--) {
				arr[j+1]=arr[j];
			}
			arr[i]=x;
		}

		
		public int Delete(int i) {
			// TODO Auto-generated method stub
			assert(!isempty());
			int s=arr[i];
			for(int j=i;j<count+1;j++) {
				arr[j]=arr[j+1];
			}
			count--;
			return s;
		}		
	}
	
	/************顺序表结束**************/
	
	
	public long  A(int n,int m) {//A m,n
		if(m==0)return 1;
		long sum=1;
		while(m>0) {
			sum*=n;
			n--;
			m--;
		}
		return sum;
	}
	public long sum(int n) {//计算以每个数字开头总共有多少种情况
		long sum=0;
		for(int i=0;i<n+1;i++) {
			sum+=A(n,i);
		}
		return sum;
	}
	public void subset(int n,long m,SqList s) {//先计算出首项，再减去前面不是该首项的数目，
		//然后递归 
	//计算出每个数字作为开头的总可能数，然后用m-1除以每个数字的总可能数，再加1，就得到了这个m会处于
		//哪一个可能区域，取出顺序表中这个位置的值，（为什么要用顺序表呢，是因为如果直接用数字的话后面会乱了
		//比如第一次拿了2，第二次相除又得到2，但这个2 其实是第二个位置，也就是3）
		//然后新的m就等于旧的m减去前面已经没可能的数目；
		//然后 对 n-1，新的m，再调用一次函数
	
	//如果剩下的最后一个数，且不是输出空，
		//就不用下去计算了，直接把顺序表里剩下的那个数打印
		if(n==1) {
			System.out.print(s.Delete(1));
			return;
		}
		long oneScorePossible=sum(n-1);
		long firstScore=1+(m-1)/oneScorePossible;
		System.out.print(s.Delete((int)firstScore));
		
		long newM=(m-(firstScore-1)*oneScorePossible);
		if(newM!=1) {
			System.out.print(" ");//不是最后一个数就在输出一个空格
		}
		
		if(newM==1)return;//如果剩下的是1，那证明就是下一组的第一个，而下一组的第一个必然为空
		
		else {
			newM--;
		subset(n-1,newM,s);}
		
	}
	public  void S() {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			long m=sc.nextLong();
		SqList s=new SqList(n+2);
			for(int i=1;i<n+1;i++) {
				s.insert(i, i);
			}
			subset(n,m,s);
			System.out.println();
		}
	}
public static void main(String[] args) {
	Main ma=new Main();
	ma.S();
}
}
	

