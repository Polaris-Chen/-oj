package acm2066_Dijkstra;//Accepted!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


//ˬˬˬ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//�Ͻ�˹�����㷨!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//��Ϊ��Ŀ��������ͼ!!!!
//˼·����������ӱ����ݴ�������,�˴�ע���������Ȩͼ,Ȼ�������Դ�㵽�����������·��
//�ٱȽ��������,�����Сֵ
//��Դ�㵽�����������·��ʹ�õϽ�˹�����㷨,˼·��,�Ƚ���Դ��ֱ��������·����������A��
//�����ӵ������ֵ����,���Դ��ֱ�����������·��,����OKroad,�Ǹ������min
//����(��min��ֱ��������C��·��)+OKroad �Ľ��  ��  A��Դ�㵽�����C�þ���Ƚ� ȡС��ֵ
//������min�����ڵ����е�,ͬʱ������A��Դ�㵽�������е�ľ���
//�����A�е���Сֵ ��λ�õ�,����min,��ʼ�´�ѭ��
//�������ϸ��� ,���������е��,����������е㶼�ﵽ����С

import java.util.Scanner;



public class Main {
	public class Node{
		long data;
		int key;
		Node next;
		public Node() {
			this.data=0;
			this.key=-1;  
			this.next=null;
		}
		public Node(int key,long data) {
			this.key=key;
			this.data=data;
			this.next=null;
		}
	}
	public class LinkList{
		Node rear;
		Node head;
	
		public LinkList() {
			head=new Node();
			rear=new Node();
			rear=head;
			
		}
		public void insert(int key,long data) {//ͷ�巨
			Node nextNode=new Node(key,data);
			if(rear==head) {//����ǵ�һ���ڵ�,����ͷ������������,��Ȼû���ҵ����������
				head.next=nextNode;
				rear=nextNode;
			}
			else {//���ǵ�һ����ֱ����βָ�����һ���µ�,����βָ����ǰ�ƶ������һ��Ԫ�ص�λ��
				rear.next=nextNode;
				rear=rear.next;
			}		
		}

	}

	public class gragh{
		int n;
		int m;
		LinkList[] L;//L�ĵ�0λ�ǲ��õģ��ӵ�һ��ʼ����ʾ���λ�õĵ���������Ĺ�ϵ
		
		public gragh(int n) {
			this.n=n;
			this.L=new LinkList[n+1];
			for(int i=0;i<n+1;i++) {
				L[i]=new LinkList();
			}
			this.m=0;
		}
		public long[] minRoad(int ini) {
			boolean[] ifThisPointisOk=new boolean[n+1];
			long[] iniToall=new long[n+1];//������Ϊini�㵽�������е�ľ���
			long max=Integer.MAX_VALUE;//����һ������ֵ�������������·��
			for(int i=1;i<n+1;i++) {
				iniToall[i]=max;//ȫ��·����ʼ��
			}
			Node q=L[ini].head.next;
			
			for(int i=0;i<1010;i++) {//����ini���ӵ�·����������
				if(q==null) {//û�б�ĵ��ini��������,��ֱ������ѭ��
					break;
				}
			int point=q.key;
			long data=q.data;
			if(data<iniToall[point]) {//��һ����ʵ���ǰ������ѭ��|�ĵ�һ��������һ��,���Ҳ���,����
				                             //��һ��,��һ��˼·  | ���ǰѳ�ʼ����������ӵ��·������
				                              //���½�������      |
			                          //                          |
				iniToall[point]=data;//                           |
			}                        //                           |
			q=q.next;//ǰ����һ�����ӵ� //                                                        |
			}                         //                          |  
			int min=min(iniToall,ifThisPointisOk);//              | 
			ifThisPointisOk[min]=true;  //                        |
			long OKroad=iniToall[min];//                          |
			for(int j=1;j<n-1;j++) {//ÿ���㶼��һ��     <--------|  
				Node p=L[min].head.next;
			   for(int i=1;i<1010;i++) {//���������������·�����µ�ԭ����
				   if(p==null) {
						break;
					}
				   int point=p.key;//�����ĸ���
					long data=p.data;
					if(data+OKroad<iniToall[point]) {//������ʼ�㵽��������̾���
						iniToall[point]=data+OKroad;//��ֻҪƽ�б�����̵ı�
					}
					p=p.next;
			   }
			   min=min(iniToall,ifThisPointisOk);//����ʼ�㵽��������̾�������һ����,��һ�δ�����㿪ʼ����
			   ifThisPointisOk[min]=true;//�´�����ʼ�㵽��������̾���ʱ���ٿ�����һ��
				OKroad=iniToall[min];//�������·����
				
			}
			/*
			 * for(int i=1;i<n+1;i++) { System.out.println(iniToall[i]); }
			 */
			return iniToall;
		}
		public int min(long[] arr,boolean[] arr1) {//��������͵������ʾ���λ�õ�Ԫ���Ƿ��Ѿ���
			                                       //���·���ϵĵ���
			long minData=Integer.MAX_VALUE;
			int minPlace=0;
			for(int i=1;i<arr.length;i++) {
				if(arr1[i]) {
					continue;
				}
				if(arr[i]<minData) {
					minData=arr[i];
					minPlace=i;
				}
			}
			return minPlace;
		}
		public void insert(int v,int w,long data) {
			L[v].insert(w, data);
		}
		
	}
	public void S() {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int T=sc.nextInt();
			int S=sc.nextInt();//��������
			int D=sc.nextInt();
			int[] start=new int[S];//��ʼ��
			int[] end=new int[D];//�յ�
			gragh g=new gragh(1010);//����һ��ͼ
			for(int i=0;i<T;i++) {
				int v=sc.nextInt();
				int w=sc.nextInt();
				long time=sc.nextLong();
				g.L[v].insert(w, time);//����ͼ,���߶�Ҫ�����ڽӱ���
				g.L[w].insert(v, time);
			}
			for(int i=0;i<S;i++) {
				start[i]=sc.nextInt();
			}
			for(int i=0;i<D;i++) {
				 end[i]=sc.nextInt();
			}
			long min=Long.MAX_VALUE;
			for(int i=0;i<S;i++) {//����ÿ����ʼ��
				long[] s=g.minRoad(start[i]);//����ʼ�㵽ÿ�������̾������
				for(int j=0;j<D;j++) {//����ÿ���յ�
					if(s[end[j]]<min) {
					min=s[end[j]];
					}
				
				}
			}
			

			System.out.println(min);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main ma=new Main();
ma.S();

}
	}


