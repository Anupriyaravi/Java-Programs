import java.util.Scanner;;
public class Nk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
int N=in.nextInt();
int k=in.nextInt();
int x[]=new int[N];
for(int i=0;i<N;i++){
	x[i]=in.nextInt();
}
int sum=0;
for(int i=0;i<k;i++){
	sum=sum+x[i];
}
System.out.println(sum);

	}

}
