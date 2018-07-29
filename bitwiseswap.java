import java.util.Scanner;
public class bitwise {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int number1=in.nextInt();
		int number2=in.nextInt();
		int result=0,result2=0;
		number1=number1^number2;
		number2=number1^number2;
		number1=number1^number2;
		System.out.println(number1+" "+number2);
	}
}
