package JavaAndDataStructures;

public class Stack {
	static final int MAX = 500; 
	int top; 
	int a[] = new int[MAX];  
	boolean isEmpty() 
	{ 
    		return (top<0); 
	} 
	Stack() 
	{ 
    		top = -1; 
	} 
	boolean push(int g) 
	{ 
    		if (top >= (MAX-1)) {
        			System.out.println("Stack Overflow"); 
        			return false; 
    		}
    		else {
        			a[++top] = g; 
        			System.out.println(g + " push into stack"); 
        			return true;
    		}
	}
	int pop() 
	{ 
    		if (top < 0) 
    		{ 
        			System.out.println("Stack Underflow"); 
        			return 0; 
    		} 
    		else
    		{ 
        			int o = a[top--]; 
        			return o; 
    		} 
	} 	
	public static void main(String args[])
	{
    		Stack s= new Stack(); 
    		s.push(10); 
    		s.push(20); 
    		System.out.println(s.pop() + " Pop from stack"); 
    		s.push(30); 
    		System.out.println(s.pop() + " Pop from stack"); 
	}
}