package acm2062;

import java.util.Scanner;
public class Main {
	public class SqList  {
		int[] arr;
		int count;//��ǰ�������һ��Ԫ�ص�λ��;
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
	
	/************˳������**************/
	
	
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
	public long sum(int n) {//������ÿ�����ֿ�ͷ�ܹ��ж��������
		long sum=0;
		for(int i=0;i<n+1;i++) {
			sum+=A(n,i);
		}
		return sum;
	}
	public void subset(int n,long m,SqList s) {//�ȼ��������ټ�ȥǰ�治�Ǹ��������Ŀ��
		//Ȼ��ݹ� 
	//�����ÿ��������Ϊ��ͷ���ܿ�������Ȼ����m-1����ÿ�����ֵ��ܿ��������ټ�1���͵õ������m�ᴦ��
		//��һ����������ȡ��˳��������λ�õ�ֵ����ΪʲôҪ��˳����أ�����Ϊ���ֱ�������ֵĻ����������
		//�����һ������2���ڶ�������ֵõ�2�������2 ��ʵ�ǵڶ���λ�ã�Ҳ����3��
		//Ȼ���µ�m�͵��ھɵ�m��ȥǰ���Ѿ�û���ܵ���Ŀ��
		//Ȼ�� �� n-1���µ�m���ٵ���һ�κ���
	
	//���ʣ�µ����һ�������Ҳ�������գ�
		//�Ͳ�����ȥ�����ˣ�ֱ�Ӱ�˳�����ʣ�µ��Ǹ�����ӡ
		if(n==1) {
			System.out.print(s.Delete(1));
			return;
		}
		long oneScorePossible=sum(n-1);
		long firstScore=1+(m-1)/oneScorePossible;
		System.out.print(s.Delete((int)firstScore));
		
		long newM=(m-(firstScore-1)*oneScorePossible);
		if(newM!=1) {
			System.out.print(" ");//�������һ�����������һ���ո�
		}
		
		if(newM==1)return;//���ʣ�µ���1����֤��������һ��ĵ�һ��������һ��ĵ�һ����ȻΪ��
		
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
	

