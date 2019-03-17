package acm2063;

import java.util.Scanner;//https://blog.csdn.net/Q_AN1314/article/details/79488562
//这个是考察匈牙利算法的基本应用,就是求最大匹配问题,思路就是,一直找未匹配的顶点,比如叫w
//然后找它的增广路,就是看和他相连的点有没有匹配,然后如果那个相连的点v,没匹配或者v的原匹配点还有别的可匹配点
//那就让w和v匹配起来.简单地说就是找没老婆的人,比如叫A,去看看他喜欢的女的,万一这个女的没老公,那最好,万一有老公,
//问问她老公有没有小三
//如果有,就叫她老公和小三去过,A和这个女的在一起.
//对所有没老婆的都用调用函数求增广路径,最后得到的匹配就是最大匹配;(原因见下)
//https://blog.csdn.net/qq_38956769/article/details/80238896
//其中的(三)增广路径



public class Main {
	public class Gragh {//无向图
		int n;//点数
		int m;//边数
		int[][] g;//是否有边 邻接矩阵
		int[] match;//-1表示无匹配
		boolean[] used;
	
	  
		public Gragh(int n) {
			this.n=n;
			this.m=0;
			this.g=new int[n][n];
			this.used=new boolean[n];
			this.match=new int[n];
			for(int i=0;i<n;i++) {
				this.match[i]=-1;
			}
		}
		public void addEdge(int v,int w) {
			assert(v>=0&&v<n);
			assert(w>=0&&w<n);
			if(g[v][w]==1) {
				return;
			}
			g[v][w]=1;
			m++;
		}
		
	public boolean find(int x) {
	
		for(int i=0;i<n;i++) {
			if(g[x][i]==1) {
				
				if(!used[i]) {
					used[i]=true;
					//如果顶点i还未匹配，或者与顶点i匹配的那个顶点可以
					//换个顶点匹配（也就是说可以把顶点i“让给”当前顶点x），则把顶点x和顶点i为对方的匹配顶点
                  //由于上一步已经将顶点i设置成used，所以find(match[i])不会再考虑顶点i了
					if(match[i]==-1||find(match[i])) {
						match[i]=x;
						match[x]=i;
						
						return true;
						
					}
				}
			}
		}
		return false;
	}
	public int search() {//主功能函数
		for(int i=0;i<n;i++) {//每个未匹配节点都要求一次增广路径
			if(match[i]==-1) {
				clearUsed();
				find(i);
			}
		}
		int count=0;
		for(int i=0;i<match.length;i++) {
			if(match[i]!=-1) {
				count++;
			}
		}
		return count/2;
	}
	void clearUsed() {
		for(int i=0;i<n;i++) {
			used[i]=false;
		}
	}
	}
	public void S() {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
		int K=sc.nextInt();
		if(K==0) {
			break;
		}
		int score_girl=sc.nextInt();
		int score_boy=sc.nextInt();
		Gragh gra=new Gragh(score_girl+score_boy+1);
		for(int i=0;i<K;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt()+score_girl;
			gra.g[a][b]=1;
		}
		System.out.println(gra.search());
	}
	}
	public static void main(String[] args) {
		Main ma=new Main();
		ma.S();
	}

}