public class Recursionusingfactorial
{
	public int fun(int n)
	{
	    if(n==1) 
	    {
	        return 1;
	    }
	    return n*fun(n-1);
	}
	public static void main(String[] args){
	 Recursionusingfactorial m=new Recursionusingfactorial();
	 System.out.println(m.fun(5));
	}
	
}