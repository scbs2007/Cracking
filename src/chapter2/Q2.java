package chapter2;

import java.util.Scanner;

public class Q2
{
	public static void main(String args[])
	{
		LinkedList node = new LinkedList(1);
		node.add();
		LinkedList p1, p2;
		p1=p2=node;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ncopy = n;
		while(ncopy != 0)
		{
			--ncopy;
			p1 = p1.next;
		}
		while(p1 != null)
		{
			p1 = p1.next;
			p2 = p2.next;
		}
		node.display();
		System.out.println(n+" nodes from end contains:" + p2.data);
		sc.close();
	}
}