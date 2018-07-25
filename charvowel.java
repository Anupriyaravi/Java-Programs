public class charvowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
		char c=in.next().charAt(0);
		
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'
				||c=='I'||c=='O'||c=='U'){
			System.out.println("vowel");
		}
		else if((c>=65&&c<=90)||(c>=97&&c<=122)){
			System.out.println("Consonant");
		}
				else{
			System.out.println("Invalid");
		}
	}

}
