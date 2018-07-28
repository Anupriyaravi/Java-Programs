import java.util.Scanner;
public class numeric {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		s=s.replaceAll("[^0-9]","");
		int l=s.length();
		System.out.println(l);
			}
}
