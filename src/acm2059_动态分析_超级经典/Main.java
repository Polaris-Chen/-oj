package acm2059_��̬����_��������;
//���ﱻ�۵���
//̰���㷨���ܵõ����Ž� ����:
/*180
2 100 5
7 10 2
80 110 */ //�м��Ҫ��һ�ε� ���ڵڶ��ε�ʱ�� �ֲ�̰�Ļ�ѡ�񲻳��,��Ϊ����ǰ���ľ���ܶ�,����������ʱ��ܳ�
//������ȫ�ֿ���,�ܹ鶼��Ҫ��һ�ε��,���ڲ������ҲҪ��,
//���Ի�������һ�γ��˵�,����ȫ�����Ǹ���ǰ��,������һ�ε���ǰ���ľ����������ʱ��,�ֲ�̰�Ľ����õ��˴��Ž�
// 

//��̬�滮�㷨 ����ÿ�ζ��õ� ����i��վ�����ʱ�� ���´��жϲ���ֻ����ǰ���������ž���������һ������ 
//���Ǵ�ͷ��ʼ ����   �Ե�һ������Ϊ�����õ��� ����i+1���ĵĲ��� ���Եڶ�������Ϊ�����õ��� ����i+1���ĵĲ��Եȵ���һϵ��
//���������ŵĲ��ԣ�  �Ӷ��õ�����i+1��վ������ ����ʹ������Ե�ǰi������͵���i��վ�����Ų��貢����ͬ��
//����ÿ�εõ��Ķ���ÿ���ӹ��̵����Ž� ���õ��������һ��վ�����Ž⡣


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
			 /***********��ֵ����**************/
			 for(int i=1;i<N+2;i++){
				 double min=Double.MAX_VALUE;
				 for(int j=0;j<i;j++){//�ڵ�j��վ���󵽵�i��վ��ʱ��
					 double tempTime=0;
					 int len=arr[i]-arr[j];
					 if(len>C) {//����
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
