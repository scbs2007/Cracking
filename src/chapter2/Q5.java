package chapter2;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList n1 = new LinkedList(1);
		n1.add();
		LinkedList n2 = new LinkedList(1);
		n2.add();
		n1.display();
		n2.display();
		LinkedList n3 = new LinkedList(-1);;
		int temp = 0;
		while(n1!=null || n2 !=null)
		{
			temp += (n1.data + n2.data);
			n3.addEnd(temp%10);
			temp/=10;
			n1 = n1.next;
			n2 = n2.next;
		}
		while(n1!=null)
		{
			n3.addEnd(n1.data+temp);
			temp = 0;
		}
		while(n2!=null)
		{
			n3.addEnd(n2.data+temp);
			temp = 0;
		}
		n3.addEnd(temp);
		n3.display();
	}

}
