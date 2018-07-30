import java.util.Scanner;
public class min {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
	int x[]=new int[n];
		for(int i=0;i<n;i++){
			x[i]=in.nextInt();
		}
		int min=x[0];
for(int i=1;i<n;i++){
	if(x[i]<min){
		min=x[i];
			}
	}
System.out.println(min);
	}
}
