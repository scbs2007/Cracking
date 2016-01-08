package chapter2;

import java.util.Scanner;

public class Q4 {

	public static void main(String args[])
	{
		LinkedList node = new LinkedList(1);
		node.add();
		
		Scanner sc = new Scanner (System.in);
		int n =sc.nextInt();
		LinkedList less = new LinkedList(-1);
		LinkedList more = new LinkedList(-1);
		LinkedList iterator = node;
		while(iterator!=null)
		{
			if(iterator.data<=n)
			{
				less.addEnd(iterator.data);
			}
			else
			{
				more.addEnd(iterator.data);
			}
			iterator=iterator.next;
		}
		
		less.addListToEnd(more);
		less.display();
		sc.close();
	}

}
