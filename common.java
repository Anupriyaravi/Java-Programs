import java.util.Arrays;
import java.util.Scanner;
public class lettercommon {
	public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n=in.nextInt();
String []x=new String[n];
for(int i=0;i<n;i++){
	x[i]=in.next();
}
int []l=new int[n];
for(int i=0;i<n;i++){
	l[i]=x[i].length();
	}
Arrays.sort(l);
String m,y;
int count=0;
String b="";
System.out.println(l[0]);
for(int i=0;i<l[0];i++){
	count=0;
m=x[0].substring(i,i+1);
for(int j=1;j<n;j++){
	 y=x[j].substring(i,i+1);
	if(m.equals(y)){
	 count++;
	}
}
	 	if(count==n-1){
	 		b=b+m;
	 		 		 	}
			 	else{
	 		break;
	 	}
}
System.out.println(b);
	 	}
}
