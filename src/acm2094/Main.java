package acm2094;

/*������뷨
 * ��������� ���ʧ������ �����������ʧ������=1 �Ǿ�ֻ��һ��ʤ����,����
 * ������-ʧ������=ûʧ�ܹ������� 
 * ���ҵ��뷨��������ͼ���ܵ����������е�Ķ������,�����ﲻ��
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
	public Iterable<Integer> adj(int v){//������
		
		Vector<Integer> adjV=new Vector<Integer>();
		for(int i=0;i<n;i++) {
			if(g[v][i]) {
				adjV.add(i);
			}
		}
		return adjV;
	}
	public void DFS() {//���ε�������� 
	
		for(int i=0;i<n;i++) {//��ÿ���ڵ㶼��һ��
			
			for(int j=0;j<n;j++) {//��Ϊ����Ҫ���� ����Ҫ���Ƿ�Ψһ��������һ����,������㿪ʼ�ܱ���������ͼ
				visited[j]=false;//����ÿ�ζ�Ҫ���÷��ʺ���
			}
				dfs(i);
				if(count==n) {//��������������е� ��������һ ��Ϊ�����л�·,�ʹ��ڶ����
					score++;
				}
				count=0;
			}
		
	}
	private void dfs(int i) {//��������
		
		count++;
		visited[i]=true;//����,Ȼ�󽫷��ʱ����Ϊtrue
		for(int j:adj(i)) {//��i���������ڽڵ����,���û���ʹ�,������dfs
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
		for(int i=0;i<n;i++) {//�ȴ洢���й�ϵ,����HashSetû���ظ�Ԫ�ص����Խ����нڵ㵼��һ��������
			allPerson[i][0]=sc.next();
			allPerson[i][1]=sc.next();
			s.add(allPerson[i][0]);
			s.add(allPerson[i][1]);
		}
		 String[] person=s.toArray(new String[s.size()]);//ֱ��ʹ��(String)s.toArray()��ʧ��
		 gragh gra=new gragh(s.size());
		 //System.out.println(s.size());
		 for(int i=0;i<n;i++) {
			 int win=findpos(person,allPerson[i][0]);
			 int lose=findpos(person,allPerson[i][1]);
			 gra.g[win][lose]=true;//����ͼ�еı�
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
