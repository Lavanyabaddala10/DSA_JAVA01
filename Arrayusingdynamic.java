import java.util.*;
public class Arrayusingdynamic{
	public static void main(String[] args)
	{
	  int [] a=new int [5];
	  Scanner sc=new Scanner(System.in);
		for(int i=1;i<a.length;i++)
		{
		    a[i]=sc.nextInt();
		}
		 for(int i=1;i<a.length;i++)
		  {
		    System.out.println(a[i]);
      	}
		
    }
}