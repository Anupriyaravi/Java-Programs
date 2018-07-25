import java.util.Scanner;
public class eveninterval {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
int a=in.nextInt();
int b=in.nextInt();
for(int i=a+1;i<b;i++){
	if(i%2==0){
		System.out.print(i+" ");
	}
}
}
}
