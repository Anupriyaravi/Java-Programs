import java.util.Scanner;
public class swap {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int	number1=in.nextInt();
		int number2=in.nextInt();
		int temp=0;
	temp=number1;
	number1=number2;
	number2=temp;
	System.out.println(number1+" "+number2);
}
}
