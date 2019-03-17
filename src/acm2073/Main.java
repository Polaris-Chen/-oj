package acm2073;//Accepted

import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {
	DecimalFormat df=new DecimalFormat("0.000");
	public double juli(int x1,int y1,int x2,int y2) {
		double way=Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2);
		//System.out.println(way);
		if(way==0) {
			return 0;
		}
		else return Math.sqrt(way);
	}
	public void zhufangfa() {
		Scanner sc=new Scanner(System.in);
		double[][] way=new double[201][2];//该数组保存所有点到0,0的距离
		for(int i=1;i<201;i++) {
			way[i][0]=juli(0,i,i-1,0)+way[i-1][1];
			way[i][1]=juli(0,i,i,0)+way[i][0];
		}
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int[][] arr=new int[n+1][4];
			for(int i=1;i<n+1;i++) {
				arr[i][0]=sc.nextInt();
				arr[i][1]=sc.nextInt();
				arr[i][2]=sc.nextInt();
				arr[i][3]=sc.nextInt();
			}
	
			for(int i=1;i<n+1;i++) {
			//对于任何一个点 都先求出他左上角的点到原点的距离,然后加上这个点和左上角点的距离 这就组成了该点到远点的距离 
			//两个点到原点的距离相减 就得到两点间折线距离
				int temp1=arr[i][0]+arr[i][1];
				int temp2=arr[i][2]+arr[i][3];
			
				double way1=way[temp1][0]+juli(arr[i][0],arr[i][1],0,temp1);//左上角点到原点+该点到左上角点
				double way2=way[temp2][0]+juli(arr[i][2],arr[i][3],0,temp2);
				
				double result=Math.abs(way1-way2);
			
				System.out.println(df.format(result));
			
			}
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main ma=new Main();
		ma.zhufangfa();
	}

}
