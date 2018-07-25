import java.util.Scanner;
public class palinno {
	public static void main(String[] args) {
Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String s=String.valueOf(n);
		StringBuffer sb=new StringBuffer(s);
        StringBuffer w=sb.reverse();
    		String q=w.toString();
			if(s.equals(q)){
		System.out.println("yes");
                            }
       else{
	System.out.println("no");
            }
in.close();
	}
}
