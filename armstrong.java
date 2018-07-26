import java.util.Scanner;
public class armstrong {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int n=N;
		int count=0;
		while(n!=0){
			n=n/10;
		    count++;
		    		}
		int x[]=new int[count];
		int q=N;
		for(int i=0;i<count;i++){
			x[i]=N%10;
			N=N/10;
		}int sum=0;
		for(int i=0;i<count;i++){
			sum=sum+x[i]*x[i]*x[i];
		}
			if(sum==q){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}

}
