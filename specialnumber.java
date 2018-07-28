import java.util.Scanner;
public class specialcharater {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String s1=s.replaceAll(" ","");
		 s1=s1.replaceAll("[A-Za-z0-9]","");
		 System.out.println(s1.length());
	}
}
