import java.util.*;
public class max {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int x[]=new int[N];
		for(int i=0;i<N;i++){
			x[i]=in.nextInt();
		}
		int max=x[0];
		for(int i=1;i<N;i++){
			if(x[i]>max){
				     max=x[i];
				 		}
		}
		  System.out.println(max);
			}

}
