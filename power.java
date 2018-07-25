import java.util.Scanner;
public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
int  n=in.nextInt();
int  p=in.nextInt();
int  x=n;
for(int i=0;i<p-1;i++){
x=x*n;
}
System.out.println(x);
}
	}
