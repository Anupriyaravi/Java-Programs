import java.util.Scanner;
public class Alpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
char c=in.next().charAt(0);
if((c>=65&&c<=90)||(c>=97&&c<122)){
System.out.println("Alphabet");	
}
else{
	System.out.println("No");
}
}
}
