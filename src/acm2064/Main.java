package acm2064;

/*//��̬�滮��һ��С���⣬����n�����ӵ����⣬�Ϳ��Կ�������������Ӻ������n-1�����Ӱ�n-1�����ӿ���һ�����壺

��n �����Ӵ�A����ƶ���C  ��Ҫ�����岽:
1. ��n - 1 �����Ӽ�Ӵ�A �Ƶ�C     f(n - 1)
2. ���������Ӵ�A �Ƶ�B              1
3. ��n - 1 �����Ӽ�Ӵ�C �Ƶ�A     f(n - 1)
4. ���������Ӵ�B �Ƶ�C               1
5. ��n - 1 �����Ӽ�Ӵ�A �Ƶ�C     f(n - 1)
�׵�f(n) = 3 *��f(n - 1) + 2, f(1) = 2;
*/
import java.util.Scanner;

public class Main {
public void S() {
	Scanner sc=new Scanner(System.in);
	long[] arr=new long[40];
	arr[0]=0;arr[1]=2;arr[2]=8;
	for(int i=3;i<36;i++) {
		arr[i]=3*arr[i-1]+2;
	}
	while(sc.hasNext()) {
		int N=sc.nextInt();
		System.out.println(arr[N]);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.S();
	}

}
