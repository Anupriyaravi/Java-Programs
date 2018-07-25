import java.util.Scanner;
public class even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
int n=in.nextInt();
if(n>0){
if(n%2==0){
	System.out.println("Even");
}
else if(n%2!=0){
	System.out.println("Odd");
}
}
else{
	System.out.println("Invalid Input");
}
	}
	
}
