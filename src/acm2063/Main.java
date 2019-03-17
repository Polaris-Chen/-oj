package acm2063;

import java.util.Scanner;//https://blog.csdn.net/Q_AN1314/article/details/79488562
//����ǿ����������㷨�Ļ���Ӧ��,���������ƥ������,˼·����,һֱ��δƥ��Ķ���,�����w
//Ȼ������������·,���ǿ����������ĵ���û��ƥ��,Ȼ������Ǹ������ĵ�v,ûƥ�����v��ԭƥ��㻹�б�Ŀ�ƥ���
//�Ǿ���w��vƥ������.�򵥵�˵������û���ŵ���,�����A,ȥ������ϲ����Ů��,��һ���Ů��û�Ϲ�,�����,��һ���Ϲ�,
//�������Ϲ���û��С��
//�����,�ͽ����Ϲ���С��ȥ��,A�����Ů����һ��.
//������û���ŵĶ��õ��ú���������·��,���õ���ƥ��������ƥ��;(ԭ�����)
//https://blog.csdn.net/qq_38956769/article/details/80238896
//���е�(��)����·��



public class Main {
	public class Gragh {//����ͼ
		int n;//����
		int m;//����
		int[][] g;//�Ƿ��б� �ڽӾ���
		int[] match;//-1��ʾ��ƥ��
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
					//�������i��δƥ�䣬�����붥��iƥ����Ǹ��������
					//��������ƥ�䣨Ҳ����˵���԰Ѷ���i���ø�����ǰ����x������Ѷ���x�Ͷ���iΪ�Է���ƥ�䶥��
                  //������һ���Ѿ�������i���ó�used������find(match[i])�����ٿ��Ƕ���i��
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
	public int search() {//�����ܺ���
		for(int i=0;i<n;i++) {//ÿ��δƥ��ڵ㶼Ҫ��һ������·��
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