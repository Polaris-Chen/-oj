package acm2057;
//�Ȱ�����ʮ�����ƵĶ�ת����ʮ���� ����� ��ת��Ϊ16����
//�ĵ�̫������ ,����д�ļ��һ��
import java.util.Scanner;
//java���õ�̫���� a.nextInt(int i)�����i�ǻ��� i=16���ǰ������16������ת��Ϊlong�͵�10������
//System.out.format("%X", sum); %X���ǰ�10���������Ϊ16���� ̫ǿ��!!!!
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
			
		 while(sc.hasNext()) {
			 long a=sc.nextLong(16);
			 long b=sc.nextLong(16);
		
			 long sum=a+b;
			 if(sum>=0) {
			 System.out.format("%X",sum);
			 }
		 else {
			 sum=-sum;
			 System.out.print("-");
			 System.out.format("%X", sum);
		 }
			 System.out.println();
	}
	}
}