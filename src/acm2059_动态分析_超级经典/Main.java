package acm2059_动态分析_超级经典;
//这里被折叠了
//贪心算法不能得到最优解 例子:
/*180
2 100 5
7 10 2
80 110 */ //中间必要充一次电 但在第二段的时候 局部贪心会选择不充电,因为低速前进的距离很短,而充电所需的时间很长
//但是在全局看来,总归都是要充一次电的,现在不充后面也要充,
//所以还不如这一次充了电,后面全部都是高速前进,所以这一段低速前进的距离提高了总时间,局部贪心仅仅得到了次优解
// 

//动态规划算法 就是每次都得到 到第i个站的最短时间 但下次判断并非只依据前面的这个最优决定作出下一步决定 
//而是从头开始 分析   以第一步最优为基础得到的 到第i+1步的的策略 和以第二步最优为基础得到的 到第i+1步的的策略等等这一系列
//策略中最优的策略，  从而得到到第i+1个站的最优 ，即使这个策略的前i个步骤和到第i个站的最优步骤并不相同，
//这样每次得到的都是每个子过程的最优解 最后得到的是最后一个站的最优解。


import java.util.Scanner;
public class Main {

	public void S() {
		 Scanner sc = new Scanner(System.in);
		 while(sc.hasNext()) {
			 int L=sc.nextInt();
			 
			 int N=sc.nextInt();
			 int C=sc.nextInt();
			 int T=sc.nextInt();
			 
			 int VR=sc.nextInt();
			 int VT1=sc.nextInt();
			 int VT2=sc.nextInt();
			 int[] arr=new int[N+2];
			 double[] d=new double[N+2];
			 arr[0]=0;arr[N+1]=L;
			 for(int i=1;i<N+1;i++) {
				 arr[i]=sc.nextInt();
			 }
			 /***********赋值结束**************/
			 for(int i=1;i<N+2;i++){
				 double min=Double.MAX_VALUE;
				 for(int j=0;j<i;j++){//在第j个站充电后到第i个站的时间
					 double tempTime=0;
					 int len=arr[i]-arr[j];
					 if(len>C) {//不够
						 tempTime+=1.0*C/VT1+1.0*(len-C)/VT2;
					 }
					 else {
						 tempTime+=1.0*len/VT1;
					 }
					 tempTime+=d[j];
					 if(j!=0) {
						 tempTime+=T;
					 }
					 if(tempTime<min) {
						 min=tempTime;
					 }
				 }
				 d[i]=min;
			 }
			 double rabbitTime=((double)L)/VR;
			 if(d[N+1]<rabbitTime) {
				 System.out.println("What a pity rabbit!");
			 }
			 else  System.out.println("Good job,rabbit!");
		 }
	}
	public static void main(String[] args) {
		Main ma=new Main();
		ma.S();
	
	}
}
