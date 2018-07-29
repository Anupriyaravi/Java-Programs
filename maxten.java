import java.util.Arrays;
import java.util.Scanner;
public class maxten {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
int n=in.nextInt();
int x[]=new int[n];
for(int i=0;i<n;i++){
	x[i]=in.nextInt();
}
Arrays.sort(x);
//System.out.println(Arrays.toString(x));
for(int i=n-1;i>=0;i--){
	System.out.println(x[n-1]);	
	break;
}
	}
}
