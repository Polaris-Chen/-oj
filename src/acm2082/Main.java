package acm2082;//Accepted
//https://blog.csdn.net/ten_sory/article/details/59483762
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 int T=sc.nextInt();
		 while(T>0){
			
			 int[] arr=new int[27];
			 for(int i=1;i<=26;i++) {
				arr[i]=sc.nextInt();
			 }
			 int Max=0;//MaxΪȫ�������ϵ�����ֵ
			 for(int i=1;i<27;i++) {
				 Max+=i*arr[i];
			 }
			 int[] a=new int[Max+1];//���յķ�������
			 a[0]=1;//�ⲽ��Ҫ ʲô����Ҫ ��һ�ַ���
			 int[] b=new int[Max+1];//��ʱ����
			 
			//�൱�ڰ�ÿ����ĸ�Ŀ��ܵ�  ����i ���ŵ����������Ӧ��a�����е� iλ�� 
			 //����ȫ���������,iλ�õ�ֵ���Ǽ�ֵΪi�ķ�����
			 //,���յõ�һ����������
			 for(int i=1;i<=26;i++) {//���м�����ĸ
				 for(int j=0;j<=arr[i]&&j*arr[i]<=Max;j++) {//ÿ����ĸ�ü���
					 for(int k=0;k+j*i<=Max;k++) {//ע��߽�Max��Ҫ����
						/*����:
						 * b[7]=b[7]+a[1];����7��ķ�������ԭ����7�鷽������ ��֪�� 1��ķ���,
						 * ��Ϊ����������� 2��3��,
						 * ����ǰ���1�鷽���׷׽���Ϊ7�鷽��(ֻҪ������6�����7�鷽��)
						 * Ҳ����˵ǰ���1��ķ���������ȫ������
						 */
						 b[k+j*i]+=a[k];
					 }
				 }
				 for(int k=0;k<=Max;k++) {
					 a[k]=b[k];//����εĽ��������������
					 b[k]=0;
				 }
			 }
			 int count=0;
			 for(int i=1;i<51;i++) {
				 count+=a[i];
				 //System.out.println(count);
				 if(i+1>Max||a[i+1]==0) {
					 break;
				 }
			 }
			 System.out.println(count);
			 T--;
		 }
	}

}
