package acm2061;//Accepted
import java.util.Scanner;
public class Main {//不要break！！！！！！！！！！！！！！
	//////////////////////要continue!!!!!!!!!!!!!!!!!!!!!!!!!!
	
	public void S() {
	
		 Scanner sc = new Scanner(System.in);
		 
		 int N=sc.nextInt();
		 for(int i=0;i<N;i++) {//每个学生
			 int subjectScore=sc.nextInt();
			 
			 double[] powerOfSubject=new double[subjectScore];
			 double[] scoreOfSubject=new double[subjectScore];
			 boolean flag=true;
			 for(int j=0;j<subjectScore;j++) {
				 sc.next();
				 powerOfSubject[j]=sc.nextDouble();
				 scoreOfSubject[j]=sc.nextDouble();
				 if(scoreOfSubject[j]<60) {
					 flag=false;
					
				 }
			 }
			 
			 if(!flag) {
				 System.out.println("Sorry!");
				 if(i!=N-1)System.out.println();
				 continue;
			 }
			 double sumUp=0;
			 double sumDown=0;
			 for(int k=0;k<subjectScore;k++) {
			 sumUp+=powerOfSubject[k]*scoreOfSubject[k];
			 sumDown+=powerOfSubject[k];
			 }
			 double GPA=sumUp/sumDown;
			 System.out.println(String.format("%.2f", GPA));
			 if(i!=N-1)System.out.println();
		 }
		 }
	
public static void main(String[] args) {
	Main ma=new Main();
	ma.S();

}
}
