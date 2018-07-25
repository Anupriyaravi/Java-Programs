import java.util.Scanner;
public class leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
		int year=in.nextInt();
		if(year%4==0){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}

	}

}
