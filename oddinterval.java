import java.util.Scanner;
public class oddinterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
	int a=in.nextInt();
    int b=in.nextInt();
    for(long l=a+1;l<b;l++){
    	if(l%2!=0){
    		System.out.print(l+" ");
    	}
    }

	}

}
