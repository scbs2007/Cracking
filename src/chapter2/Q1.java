package chapter2;

class LinkedList {

	LinkedList next = null;
	int data;
	public LinkedList()
	{
		
	}
	public LinkedList(int d)
	{
		data = d;
	}

	public void add()
	{
		this.addEnd(2);
		this.addEnd(3);
		this.addEnd(4);
		this.addEnd(5);
		this.addEnd(2);
		this.addEnd(3);
		this.addEnd(4);
		this.addEnd(5);
		
	}
	public void display()
	{
		LinkedList node = this;
		while(node != null)
		{
			System.out.print(node.data+" ");
			node = node.next;
		}
		System.out.println();
	}
	void addListToEnd(LinkedList toEnd)
	{
		LinkedList before = this;
		while(before.next!=null)
			before = before.next;
		before.next = toEnd;
			
	}
	void addEnd(int d)
	{
		LinkedList node = this;
		
		if(node.data == -1)
		{
			node.data = d;
			node.next = null;
			return;
		}
		LinkedList newNode = new LinkedList(d);
		while(node.next != null)
		{
			node = node.next;
		}
		node.next = newNode;
		node.next.next = null;
	}
}

public class Q1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList node = new LinkedList(1);
		node.add();
		node.display();
		LinkedList i = node;
		LinkedList j,k;
		while(i != null)
		{
			j = i.next;
			k=i;
			while(j != null)
			{
				if(i.data == j.data)
				{
					if(j.next==null)
						k.next=null;
					else{
						k.next = j.next;
					}
					j=j.next;
					continue;
				}	
				k=k.next;
				j=j.next;
			}
			i=i.next;
		}
		node.display();
	}

}
