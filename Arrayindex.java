import java.util.Scanner;
public class Arrayindex {
	public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int x[]=new int[n];
for(int i=0;i<n;i++){
x[i]=in.nextInt();
	}
for(int i=0;i<n;i++){
	System.out.println(x[i]+" "+i);
}
	}
}
