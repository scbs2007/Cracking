package chapter2;

public class Q3
{
	public static void main(String args[])
	{
		LinkedList node = new LinkedList(1);
		node.add();
		
		
		//Will fail if its the last node!!
		node.data = node.next.data;
		node.next = node.next.next;
		node.display();
		
	}
	
}