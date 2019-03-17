package acm2095;
//异或是指 相同的值异或为0,不同的值异或为1 例如10^00=10 11^10=01
/*0^n=n; //0和任何数异或都为n

a^b=b^a//满足交换律 

a^a=0;//相同的数异或等于0

*/
//这里还学到了一个快速输入  但很复杂 可以看一看
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
