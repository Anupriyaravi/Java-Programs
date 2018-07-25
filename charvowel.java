import java.util.Scanner;
public class charvowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
		char c=in.next().charAt(0);
		if(c>=48&&c<=57){
			System.out.println("Consonant");
		}
		else if((c>=65&&c<=90)||(c>=97&&c<=122)){
			System.out.println("vowel");
		}
		else{
			System.out.println("Invalid");
		}
	}

}
