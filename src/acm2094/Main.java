package acm2094;

/*大神的想法
 * 算出总人数 算出失败人数 如果总人数减失败人数=1 那就只有一个胜利者,满足
 * 总人数-失败人数=没失败过的人数 
 * 但我的想法还可以求图中能到达其他所有点的顶点个数,他这里不行
 * import java.util.HashSet;

import java.util.Scanner;
import java.util.Set;

public class Main {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	Set<String> set=new HashSet<String>();
	Set<String> sum=new HashSet<String>();
	while(sc.hasNext()) {
		int a=sc.nextInt();
		if(a==0)
			break;
		for(int i=0;i<a;i++) {
			String b=sc.next();
		String c=sc.next();
		sum.add(b);
		sum.add(c);
		set.add(c);
	}
		if(sum.size()-set.size()==1)
			System.out.println("Yes");
		else
			System.out.println("No");
		sum.clear();
		set.clear();

}
}
}
 * */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class Main {
public class gragh{
	
	int n;
	boolean[][] g;
	boolean[] visited;
	int count=0;
	int score=0;
	public gragh(int n) {
		this.n=n;
		this.g=new boolean[n][n];
		this.visited=new boolean[n];
	}
	public Iterable<Integer> adj(int v){//迭代器
		
		Vector<Integer> adjV=new Vector<Integer>();
		for(int i=0;i<n;i++) {
			if(g[v][i]) {
				adjV.add(i);
			}
		}
		return adjV;
	}
	public void DFS() {//变形的深度优先 
	
		for(int i=0;i<n;i++) {//对每个节点都看一遍
			
			for(int j=0;j<n;j++) {//因为不是要遍历 而是要看是否唯一存在这样一个点,从这个点开始能遍历完整个图
				visited[j]=false;//所以每次都要重置访问函数
			}
				dfs(i);
				if(count==n) {//如果访问完了所有点 计数器加一 因为可能有回路,就存在多个点
					score++;
				}
				count=0;
			}
		
	}
	private void dfs(int i) {//辅助函数
		
		count++;
		visited[i]=true;//访问,然后将访问标记置为true
		for(int j:adj(i)) {//对i的所有相邻节点迭代,如果没访问过,就再用dfs
			if(!visited[j]) {
				dfs(j);
			}
		}
	}

}
public int  findpos(String[] arr,String name) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i].equals(name)) {
			return i;
		}
	}
	return -1;
}
public void zhufangfa() {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		int n=sc.nextInt(); 
		if(n==0)break;
		String[][]  allPerson=new String[n][2];
		Set<String> s=new HashSet<String>();
		for(int i=0;i<n;i++) {//先存储所有关系,再用HashSet没有重复元素的特性将所有节点导入一个集合中
			allPerson[i][0]=sc.next();
			allPerson[i][1]=sc.next();
			s.add(allPerson[i][0]);
			s.add(allPerson[i][1]);
		}
		 String[] person=s.toArray(new String[s.size()]);//直接使用(String)s.toArray()会失败
		 gragh gra=new gragh(s.size());
		 //System.out.println(s.size());
		 for(int i=0;i<n;i++) {
			 int win=findpos(person,allPerson[i][0]);
			 int lose=findpos(person,allPerson[i][1]);
			 gra.g[win][lose]=true;//构造图中的边
		 }
		gra.DFS();
		//System.out.println(gra.score);
		if(gra.score==1) {
			System.out.println("Yes");
		}
		else System.out.println("No");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main ma=new Main();
		ma.zhufangfa();
	}

}
