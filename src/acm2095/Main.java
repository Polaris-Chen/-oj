package acm2095;
//�����ָ ��ͬ��ֵ���Ϊ0,��ͬ��ֵ���Ϊ1 ����10^00=10 11^10=01
/*0^n=n; //0���κ������Ϊn

a^b=b^a//���㽻���� 

a^a=0;//��ͬ����������0

*/
//���ﻹѧ����һ����������  ���ܸ��� ���Կ�һ��
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
	
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		
		while(in.nextToken()!= StreamTokenizer.TT_EOF)  {
			int n=(int)in.nval;
			if(n==0) {
				break;
			}
			int result=0;
			for(int i=0;i<n;i++) {
				in.nextToken();
				int a=(int)in.nval;
				result^=a;
						
			}
			System.out.println(result);
				}
			}
		
	
}
