package anu;

public class Age {
public static void main(String args[])
{
String s1=args[0];
int s2=Integer.parseInt(args[1]);
if((s1.equals("female"))&&(s2>=1&&s2<=58))
{
	System.out.println("8.2%");
}
else if(((s1.equals("female"))&&(s2>=59&&s2<=120)))
{
System.out.println("7.6%");
}
else if(((s1.equals("male"))&&(s2>=1&&s2<=60)))
{
	System.out.println("9.2");
}
else if(((s1.equals("male"))&&(s2>=61&&s2<=120)))
{
	System.out.println("8.3");
}
else
{
	System.out.println("INVALID INPUT");
	
}

}
}
