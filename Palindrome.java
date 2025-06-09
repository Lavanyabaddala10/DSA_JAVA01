public class Palindrome
{
	public boolean fun(String s,int i,int j)
	{
	    if(i==j) 
	    {
	        return true;
	    }
	    if(s.charAt(i)!=s.charAt(j)) return false;
	    return fun(s,i+1,j-1);
	}
	public static void main(String[] args){
	Palindrome  m=new Palindrome ();
	String  s="120";
	int i=0;
	int j=s.length()-1;
	 System.out.println(m.fun(s,i,j));
	}
	
}