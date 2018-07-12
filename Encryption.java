import java.util.Scanner;
public class Encryption {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int l=s.length();
		int t;
		char ch=s.charAt(l-1);
		if(ch>=65&&ch<=90){
			t=ch-64;}
		else{
			t=ch-96;
		}
		int d;
		for(int i1=0;i1<l-1;i1++){
			d=s.charAt(i1);
			if(d>=65&&d<=90){
				d=d-64;
				d=d-t;
				if(d<=0){
					d=d+26;
					}
				d=d+64;
		System.out.print((char)d);
			}
			else{
				   d=d-t;
					if(d<97){
						d=d+26;
						}
					System.out.print((char)d);
				}
			}
		
		System.out.println(ch);
	}
}
					
					
				
