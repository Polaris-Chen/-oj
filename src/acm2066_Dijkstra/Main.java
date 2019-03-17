package acm2066_Dijkstra;//Accepted!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


//爽爽爽!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//迪杰斯特拉算法!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//因为题目里是无向图!!!!
//思路就是先用领接表将数据储存起来,此处注意是无向带权图,然后求出单源点到其余各点的最短路径
//再比较所有情况,求出最小值
//求单源点到其余各点的最短路径使用迪杰斯特拉算法,思路是,先将和源点直接相连的路径加入数组A中
//无连接的用最大值代替,求出源点直接相连的最短路径,记做OKroad,那个点记做min
//考察(和min点直接相连的C的路径)+OKroad 的结果  与  A中源点到这个点C得距离比较 取小的值
//遍历和min点相邻的所有点,同时更新了A中源点到其余所有点的距离
//再求出A中的最小值 的位置点,代替min,开始下次循环
//这样不断更新 ,遍历完所有点后,数组里的所有点都达到了最小

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
		public void insert(int key,long data) {//头插法
			Node nextNode=new Node(key,data);
			if(rear==head) {//如果是第一个节点,就让头结点先连上这个,不然没法找到这个链表了
				head.next=nextNode;
				rear=nextNode;
			}
			else {//不是第一个就直接用尾指针插上一个新的,再让尾指针往前移动到最后一个元素的位置
				rear.next=nextNode;
				rear=rear.next;
			}		
		}

	}

	public class gragh{
		int n;
		int m;
		LinkList[] L;//L的第0位是不用的，从第一格开始，表示这个位置的点与其他点的关系
		
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
			long[] iniToall=new long[n+1];//该数组为ini点到其余所有点的距离
			long max=Integer.MAX_VALUE;//设置一个极大值来代表两点间无路径
			for(int i=1;i<n+1;i++) {
				iniToall[i]=max;//全部路径初始化
			}
			Node q=L[ini].head.next;
			
			for(int i=0;i<1010;i++) {//用与ini链接的路径更新数组
				if(q==null) {//没有别的点和ini点相连了,就直接跳出循环
					break;
				}
			int point=q.key;
			long data=q.data;
			if(data<iniToall[point]) {//这一步其实就是把下面的循环|的第一步先做了一下,但我不会,就先
				                             //搞一步,理一理思路  | 就是把初始点的所有连接点的路径长度
				                              //更新进数组中      |
			                          //                          |
				iniToall[point]=data;//                           |
			}                        //                           |
			q=q.next;//前往下一个连接点 //                                                        |
			}                         //                          |  
			int min=min(iniToall,ifThisPointisOk);//              | 
			ifThisPointisOk[min]=true;  //                        |
			long OKroad=iniToall[min];//                          |
			for(int j=1;j<n-1;j++) {//每个点都看一遍     <--------|  
				Node p=L[min].head.next;
			   for(int i=1;i<1010;i++) {//将经过这个点的最短路径更新到原数组
				   if(p==null) {
						break;
					}
				   int point=p.key;//这是哪个点
					long data=p.data;
					if(data+OKroad<iniToall[point]) {//更新起始点到其余点的最短距离
						iniToall[point]=data+OKroad;//且只要平行边中最短的边
					}
					p=p.next;
			   }
			   min=min(iniToall,ifThisPointisOk);//求起始点到其余点的最短距离是哪一个点,下一次从这个点开始考虑
			   ifThisPointisOk[min]=true;//下次求起始点到其余点的最短距离时不再考虑这一点
				OKroad=iniToall[min];//更新最短路径树
				
			}
			/*
			 * for(int i=1;i<n+1;i++) { System.out.println(iniToall[i]); }
			 */
			return iniToall;
		}
		public int min(long[] arr,boolean[] arr1) {//这个布尔型的数组表示这个位置的元素是否已经是
			                                       //最短路径上的点了
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
			int S=sc.nextInt();//输入数据
			int D=sc.nextInt();
			int[] start=new int[S];//起始点
			int[] end=new int[D];//终点
			gragh g=new gragh(1010);//开辟一个图
			for(int i=0;i<T;i++) {
				int v=sc.nextInt();
				int w=sc.nextInt();
				long time=sc.nextLong();
				g.L[v].insert(w, time);//无向图,两边都要加入邻接表中
				g.L[w].insert(v, time);
			}
			for(int i=0;i<S;i++) {
				start[i]=sc.nextInt();
			}
			for(int i=0;i<D;i++) {
				 end[i]=sc.nextInt();
			}
			long min=Long.MAX_VALUE;
			for(int i=0;i<S;i++) {//遍历每个起始点
				long[] s=g.minRoad(start[i]);//将起始点到每个点得最短距离算出
				for(int j=0;j<D;j++) {//遍历每个终点
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


