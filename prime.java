import java.util.Scanner;
public class Prime 
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
int n=in.nextInt();
int p=0;
for(int i=2;i<=n;i++){
	if(n%i==0){
		p++;
	}
}
if(p==1){
	System.out.println("yes");
}
else{
	System.out.println("no");
}
	}
	}
