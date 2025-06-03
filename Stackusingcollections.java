import java.util.Stack;
public class Stackusingcollections
{
    public static void main(String[] args)
    {
        Stack s=new Stack<>();
        s.push(1);
        s.push(2);
        System.out.println(s.peek());
        System.out.println(s.pop());
    }
}