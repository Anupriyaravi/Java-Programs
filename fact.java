import java.util.Scanner;
public class fact {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
int n=in.nextInt();
int fact = 1;	
for(int i=1;i<=n;i++){
	fact=fact*i;
	}
System.out.println(fact);
}
}
