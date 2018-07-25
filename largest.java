import java.util.Scanner;
public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
int x = in.nextInt();
int y = in.nextInt();
int z = in.nextInt();

System.out.println(Math.max(x, Math.max(y,z)));
in.close();
	}
	
}
