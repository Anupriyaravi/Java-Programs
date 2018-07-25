import java.util.Scanner;
public class digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int p=0;
while(n!=0){
	n=n/10;
	p++;
}
System.out.println(p);

	}

}
